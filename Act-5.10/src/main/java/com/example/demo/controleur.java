package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class controleur {

	public controleur() {
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	private Repo repo;
	
	
	 @GetMapping("users")	
	public  List<UserImpl> getuser() {
	    return repo.findAll();
	}
    
    @GetMapping("usersbyid/{id}")	
   	public  Optional<UserImpl> getUserById(@PathVariable(value="id") int id) {
    	
    	
   	    return repo.findById(id);
   	}
    
    
    @PostMapping("addUser")
    public String addUser(@RequestBody UserImpl user) {
    	repo.save(user);
    	return "ok";
    	
    }
    
    

    
    

}
