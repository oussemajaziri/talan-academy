
public class Book {

	private int id;
	private String title;
	private String author;
	private String editor;
	private int pageNbr;
	private int libraryId;
	private String summary;

	public Book() {

	}

	public Book(int id, String title, String author,String editor, int pageNbr, int libraryId, String summary) {
		this.id = id;
		this.title = title;
		this.author = author;
		this.editor=editor;
		this.pageNbr = pageNbr;
		this.summary = summary;
		this.libraryId = libraryId;
	}
	
	public Book(String title, String author,String editor, int pageNbr, int libraryId, String summary) {
		this.title = title;
		this.author = author;
		this.editor=editor;
		this.pageNbr = pageNbr;
		this.summary = summary;
		this.libraryId = libraryId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	public String getEditor() {
		return editor;
	}

	public void setEditor(String editor) {
		this.editor = editor;
	}

	public int getPageNbr() {
		return pageNbr;
	}

	public void setPageNbr(int pageNbr) {
		this.pageNbr = pageNbr;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public int getLibrary() {
		return libraryId;
	}

	public void setLibrary(int library) {
		this.libraryId = library;
	}

	public void affichLivre(Book book) {
		System.out
				.println("L'id du livre est  "+book.id +" son titre est "+book.title+" écrit par "+book.author+ " il est editer par "+book.editor+" il contient "+book.pageNbr+" il est dans la bibliotèque "+book.libraryId);
	}

	public boolean compareDeuxLivres(Book book1, Book book2) {
		if (book1.title.equals(book2.title) && book1.author.equals(book2.author) && book1.pageNbr == book2.pageNbr
				&& book1.summary.equals(book2.summary) && book1.libraryId==book2.libraryId) {
			return true;
		} else {
			return false;
		}
	}

}