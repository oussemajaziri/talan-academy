package com.hibernate.vintudhibernate;

import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSystem {
	
	private static final EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence.createEntityManagerFactory("Vintud");

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		addUser("firstName", "lastName", "pseudo", "password", "mail.com","2222220002", "adress", 1);
		
		LocalDate today = LocalDate.now();
		addAnnouncement("annonce", "description",1, 100, "pathPicture",Date.valueOf(today), "available", true, 0, "Tunis", 1);

	}
	  public static void addUser(String firstName, String lastName, String pseudo, String password, String mail,String phone, String adress, int roleId) {
	        // The EntityManager class allows operations such as create, read, update, delete
	        EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
	        // Used to issue transactions on the EntityManager
	        EntityTransaction et = null;
	 
	        try {
	            // Get transaction and start
	            et = em.getTransaction();
	            et.begin();
	 
	            // Create and set values for new customer
	            UserImpl cust = new UserImpl(firstName, lastName,  pseudo, password, mail,phone, adress, roleId);
	         
	 
	            // Save the customer object
	            em.persist(cust);
	            et.commit();
	        } catch (Exception ex) {
	            // If there is an exception rollback changes
	            if (et != null) {
	                et.rollback();
	            }
	            ex.printStackTrace();
	        } finally {
	            // Close EntityManager
	            em.close();
	        }
	    }
	  
	  
	  
	  public static void addAnnouncement(String title, String description, int category, double price, String picture,
				Date pubDate, String stat, boolean disponibility, int nbrViews, String localisation, int userId) {
	        // The EntityManager class allows operations such as create, read, update, delete
	        EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
	        // Used to issue transactions on the EntityManager
	        EntityTransaction et = null;
	 
	        try {
	            // Get transaction and start
	            et = em.getTransaction();
	            et.begin();
	 
	            // Create and set values for new customer
	            AnnouncementImpl announcement = new AnnouncementImpl(title, description, category, price, picture,
	        			pubDate, stat, disponibility, nbrViews, localisation, userId);
	         
	 
	            // Save the customer object
	            em.persist(announcement);
	            et.commit();
	        } catch (Exception ex) {
	            // If there is an exception rollback changes
	            if (et != null) {
	                et.rollback();
	            }
	            ex.printStackTrace();
	        } finally {
	            // Close EntityManager
	            em.close();
	        }
	    }

}
