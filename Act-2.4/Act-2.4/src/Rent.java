
public class Rent {
	private int id;
	private User user;
	private Book book;
	private String datePret;
	private String dateFin;

	public Rent() {
	}

	public Rent(int id, User user, Book book, String datePret, String dateFin) {
		this.id = id;
		this.user = user;
		this.book = book;
		this.datePret = datePret;
		this.dateFin = dateFin;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public String getDatePret() {
		return datePret;
	}

	public void setDatePret(String datePret) {
		this.datePret = datePret;
	}

	public String getDateFin() {
		return dateFin;
	}

	public void setDateFin(String dateFin) {
		this.dateFin = dateFin;
	}

	public void afficheRent(Rent rent) {
		System.out.println("L'utilisateur " + rent.user + " a pris le livre " + rent.book + " à partir de "
				+ rent.datePret + " jusqu'à " + rent.dateFin);
	}

	public boolean compareRents(Rent rent1, Rent rent2) {

		if (rent1.user.equals(rent2.user) && rent1.book.equals(rent2.book) && rent1.datePret.equals(rent2.datePret)
				&& rent1.dateFin.equals(rent2.dateFin)) {
			return true;
		} else {
			return false;
		}

	}

}
