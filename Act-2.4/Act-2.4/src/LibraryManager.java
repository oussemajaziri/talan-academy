import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LibraryManager {

	// function get all books
	public List<Book> getBooks() {

		Connection conn = ConnectionManager.getConnection();

		if (conn == null) {
			return null;
		}
		List<Book> books = new ArrayList<>();

		String querry = "SELECT * FROM book;";

		try (PreparedStatement preparedStatement = conn.prepareStatement(querry)) {

			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {

				Book book = new Book(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3),
						resultSet.getString(4), resultSet.getInt(5), resultSet.getInt(6), resultSet.getString(7));
				books.add(book);

			}
		} catch (SQLException ex) {

			ex.printStackTrace();

		} finally {

			try {
				conn.close();

			} catch (SQLException ex) {

				ex.printStackTrace();
			}
		}

		return books;
	}

	// function add book
	public void addBook(Book book) {

		Connection conn = ConnectionManager.getConnection();
		if (conn == null) {
			return;
		}

		if (book.getId() > 0) {

		} else {
			String querry = "INSERT INTO book (title,author,editor,page_nb,library_id,summary) VALUES (?,?,?,?,?,?);";

			try (PreparedStatement preparedStatement = conn.prepareStatement(querry)) {
				preparedStatement.setString(1, book.getTitle());
				preparedStatement.setString(2, book.getAuthor());
				preparedStatement.setString(3, book.getEditor());
				preparedStatement.setInt(4, book.getPageNbr());
				preparedStatement.setInt(5, book.getLibrary());
				preparedStatement.setString(6, book.getSummary());

				preparedStatement.executeUpdate();

			} catch (SQLException ex) {

				ex.printStackTrace();

			} finally {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}

	// function get book by Id
	public Book getBookById(int id) {

		Connection conn = ConnectionManager.getConnection();
		if (conn == null) {
			return null;
		}

		String querry = "SELECT *FROM book WHERE id=?;";

		try (PreparedStatement preparedStatement = conn.prepareStatement(querry)) {

			preparedStatement.setInt(1, id);

			ResultSet resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {

				Book book = new Book(resultSet.getInt("id"), resultSet.getString(2), resultSet.getString(3),
						resultSet.getString(4), resultSet.getInt(5), resultSet.getInt(6), resultSet.getString(7));

				return book;
			}

		} catch (SQLException ex) {

			ex.printStackTrace();

		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	// function Update book by Id
	public void updateBookById(Book book) {

		Connection conn = ConnectionManager.getConnection();
		if (conn == null) {
			return;
		}

		if (book.getId() > 0) {

			String querry = "UPDATE book SET title =?, author=?, editor=?, page_nb=?, library_id=?, summary=?  WHERE id=?;";

			try (PreparedStatement preparedStatement = conn.prepareStatement(querry)) {
				preparedStatement.setString(1, book.getTitle());
				preparedStatement.setString(2, book.getAuthor());
				preparedStatement.setString(3, book.getEditor());
				preparedStatement.setInt(4, book.getPageNbr());
				preparedStatement.setInt(5, book.getLibrary());
				preparedStatement.setString(6, book.getSummary());
				preparedStatement.setInt(7, book.getId());

				preparedStatement.executeUpdate();

			} catch (SQLException ex) {

				ex.printStackTrace();

			} finally {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}

	// function Deletee book
	public void deleteBookById(int id) {

		Connection conn = ConnectionManager.getConnection();
		if (conn == null) {
			return;
		}

		String querry = "DELETE FROM book where id=?";

		try (PreparedStatement preparedStatement = conn.prepareStatement(querry)) {

			preparedStatement.setInt(1, id);
			preparedStatement.executeUpdate();

		} catch (SQLException ex) {

			ex.printStackTrace();

		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}
}