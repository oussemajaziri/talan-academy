import java.sql.Connection;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection conn = ConnectionManager.getConnection();

		if (conn == null) {
			System.out.println("Not Connected");
		} else {
			System.out.println("Connected");
		}

		LibraryManager libraryManager = new LibraryManager();

		libraryManager.getBooks().forEach(e -> e.affichLivre(e));

		// Book book = new Book("test title", "test author","test editor", 50, 2 , "test
		// summary");

		// libraryManager.addBook(book);

		System.out.println();

		Book bookId = libraryManager.getBookById(2);

		bookId.affichLivre(bookId);

		System.out.println();

		// Book book2=new Book(14,"test updated", "test author updated","test editor
		// updated", 50, 2 , "test summary");

		// libraryManager.updateBookById(book2);

		// book2.affichLivre(book2);

		libraryManager.deleteBookById(14);

		System.out.println("La liste aprés supression: ");

		libraryManager.getBooks().forEach(e -> e.affichLivre(e));
	}

}
