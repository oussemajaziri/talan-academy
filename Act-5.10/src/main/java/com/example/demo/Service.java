package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class Service {

	@Autowired
	Repo repo;
	
	public Service() {
		// TODO Auto-generated constructor stub
	}
	
	
	public  List<UserImpl> getuser() {
		
	    
	    return repo.findAll();
	}

}
