package com.cts.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.model.User;
import com.cts.repository.UserRepository;



@RestController
public class UserController {

	@Autowired
	private UserRepository userrepo;

    @RequestMapping("/index")
    public String index() {
 

        return "Welcome! Users";
    }
	
	@GetMapping("/users")
	public List<User> getAllUser()
	{
		return userrepo.findAll();
	}
	
	
	@GetMapping("/users/{uid}")
	public User getUserById(@PathVariable Integer uid)
	{
		Optional<User> user=userrepo.findById(uid);
		if(user.isPresent())
		return user.get();
		else
			return null;
	}
	
	
	@DeleteMapping("/users/{id}")
	public Boolean deletetUserById(@PathVariable Integer id)
	{
		Optional<User> user=userrepo.findById(id);
		if(user.isPresent())
		{ 
			userrepo.deleteById(id);
			return true;
		}
		else
			return false;
	}
	
	@PostMapping("/users")
	public 	User createUser(@RequestBody User user)
	{
		
		return userrepo.save(user);	
		
	}
	
	@PutMapping("/users/{uid}")
	public User updateUser(@RequestBody User user,@PathVariable Integer uid)
	{
		Optional<User> usertemp = userrepo.findById(uid);
		if(usertemp.isPresent())
		{ 
			
			User userToUpdate=usertemp.get();
			userToUpdate.setAddress(user.getAddress());
			userToUpdate.setAge(user.getAge());
			userToUpdate.setName(user.getName());
			userToUpdate.setSalary(user.getSalary());
			
			
			userToUpdate=userrepo.save(userToUpdate);
			return userToUpdate;
		}
		else
			return null;
		
		
	}
}
