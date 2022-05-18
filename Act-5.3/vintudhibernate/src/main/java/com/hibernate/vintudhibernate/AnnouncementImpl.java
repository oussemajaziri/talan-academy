package com.hibernate.vintudhibernate;
import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="announcements")
public class AnnouncementImpl implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="title")
	private String title;
	@Column(name="description")
	private String description;
	@Column(name="category")
	private int category;
	@Column(name="price")
	private double price;
	@Column(name="picture")
	private String picture;
	@Column(name="date")
	private Date pubDate;
	@Column(name="stat")
	private String Stat;
	@Column(name="disponibility")
	private boolean disponibility;
	@Column(name="nbrViews")
	private int nbrViews;
	@Column(name="localisation")
	private String localisation;
	@Column(name="userId")
	private int userId;

	// Empty constructor
	public AnnouncementImpl() {

	}

	// Constructor with all attributes
	public AnnouncementImpl(String title, String description, int category, double price, String picture,
			Date pubDate, String stat, boolean disponibility, int nbrViews, String localisation, int userId) {
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
		this.userId = userId;
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
