package com.shahin.ecommerce.bookstoreecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shahin.ecommerce.bookstoreecommerce.model.User;
import com.shahin.ecommerce.bookstoreecommerce.repository.UserRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(path = "users")
public class UserController {


	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/get")
	public List<User> getUsers() {
		
		return userRepository.findAll();
	}
	
	@PostMapping("/add")
	public void createUser(@RequestBody User user) {
		userRepository.save(user);
	}
	
//	@DeleteMapping(path = { "/{id}" })
//	public User deleteUser(@PathVariable("id") long id) {
//		User user = userRepository.getOne(id);
//		userRepository.deleteById(id);
//		return user;
//	}
	

	//DELETE /users/{username}/todos/{id}
	@DeleteMapping(path = { "/{id}" })
	public ResponseEntity<Void> deleteTodo(@PathVariable long id){
		
		//Todo todo = todoService.deleteById(id);
		userRepository.deleteById(id);
		
		return ResponseEntity.noContent().build();
		//return ResponseEntity.notFound().build();
	}
	


}
