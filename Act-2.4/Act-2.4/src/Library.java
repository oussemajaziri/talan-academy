import java.util.ArrayList;
import java.util.List;

public class Library {

	private int id;
	private String name;
	private String adress;
	private int numTel;
	private List<Book> bookList = new ArrayList<Book>();
	private List<Rent> rentList = new ArrayList<Rent>();

	public Library() {

	}

	public Library(int id, String name, String adress, int numTel, List<Book> bookList, List<Rent> rentList) {
		this.id = id;
		this.name = name;
		this.adress = adress;
		this.numTel = numTel;
		this.bookList = bookList;
		this.rentList = rentList;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public int getNumTel() {
		return numTel;
	}

	public void setNumTel(int numTel) {
		this.numTel = numTel;
	}

	public List<Book> getBookList() {
		return bookList;
	}

	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}

	public List<Rent> getRentList() {
		return rentList;
	}

	public void setRentList(List<Rent> rentList) {
		this.rentList = rentList;
	}

}
