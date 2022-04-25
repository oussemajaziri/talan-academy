import java.sql.Date;

public class AnnouncementImpl implements Announcement {

	private int id;
	private String title;
	private String description;
	private int category;
	private double price;
	private String picture;
	private Date pubDate;
	private String Stat;
	private boolean disponibility;
	private int nbrViews;
	private String localisation;
	private int userId;

	// Empty constructor
	public AnnouncementImpl() {

	}

	// Constructor with all attributes
	public AnnouncementImpl(int id, String title, String description, int category, double price, String picture,
			Date pubDate, String stat, boolean disponibility, int nbrViews, String localisation,int userId) {
		this.id = id;
		this.title = title;
		this.description = description;
		this.category = category;
		this.price = price;
		this.picture = picture;
		this.pubDate = pubDate;
		this.Stat = stat;
		this.disponibility = disponibility;
		this.nbrViews = nbrViews;
		this.localisation = localisation;
		this.userId=userId;
	}
	
	// Constructor without status
	public AnnouncementImpl(int id, String title, String description, int category, double price, String picture,
			Date pubDate, boolean disponibility, int nbrViews, String localisation,int userId) {
		this.id = id;
		this.title = title;
		this.description = description;
		this.category = category;
		this.price = price;
		this.picture = picture;
		this.pubDate = pubDate;
		this.disponibility = disponibility;
		this.nbrViews = nbrViews;
		this.localisation = localisation;
		this.userId=userId;
	}

	// Constructor without Id
	public AnnouncementImpl(String title, String description, int category, double price, String picture,
			Date pubDate, String stat, boolean disponibility, int nbrViews, String localisation,int userId) {
		this.title = title;
		this.description = description;
		this.category = category;
		this.price = price;
		this.picture = picture;
		this.pubDate = pubDate;
		this.Stat = stat;
		this.disponibility = disponibility;
		this.nbrViews = nbrViews;
		this.localisation = localisation;
		this.userId=userId;
	}

	// Constructor without id and Status

	public AnnouncementImpl(String title, String description, int category, double price, String picture,
			Date pubDate, boolean disponibility, int nbrViews, String localisation,int userId) {
		this.title = title;
		this.description = description;
		this.category = category;
		this.price = price;
		this.picture = picture;
		this.pubDate = pubDate;
		this.disponibility = disponibility;
		this.nbrViews = nbrViews;
		this.localisation = localisation;
		this.userId=userId;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getCategory() {
		return category;
	}

	public void setCategory(int category) {
		this.category = category;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public Date getPubDate() {
		return pubDate;
	}

	public void setPubDate(Date pubDate) {
		this.pubDate = pubDate;
	}

	public String getStat() {
		return Stat;
	}

	public void setStat(String stat) {
		Stat = stat;
	}

	public boolean isDisponibility() {
		return disponibility;
	}

	public void setDisponibility(boolean disponibility) {
		this.disponibility = disponibility;
	}

	public int getNbrViews() {
		return nbrViews;
	}

	public void setNbrViews(int nbrViews) {
		this.nbrViews = nbrViews;
	}

	public String getLocalisation() {
		return localisation;
	}

	public void setLocalisation(String localisation) {
		this.localisation = localisation;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	
}
