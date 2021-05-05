package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
public class UserController {
	
	private UserService userService;
	@Autowired
	public UserController(UserService userService) {
		this.userService = userService;
	}
	@GetMapping(path = "/users", produces = "application/json")
	public ResponseEntity<Collection<User>> findAllUser() {

		return ResponseEntity.status(HttpStatus.OK).body(userService.getAllUser());
	}
	@GetMapping("/users/{userId}")
	public ResponseEntity<User> findUserById(@PathVariable("userId")Integer id)
	{

		return ResponseEntity.status(HttpStatus.OK).body(userService.findByUserId(id));
	}

	@PostMapping(path = "/users")
	public ResponseEntity<User> createUser(@RequestBody User user)
	{
		return ResponseEntity.status(HttpStatus.CREATED).body(userService.createUser(user));
	}
	@DeleteMapping("/users/del/{userId}")
	public ResponseEntity<Integer> deleteUserById(@PathVariable("userId") Integer userId) {

		Integer result = userService.deleteByUserId(userId);
		return ResponseEntity.status(HttpStatus.OK).body(result);

	}

	@PutMapping(path = "/users/update/{id}")
	public ResponseEntity<User> updateUser(@PathVariable Integer id,@RequestBody User user)
	{
		User u=userService.updateUser(user,id);
		return ResponseEntity.status(HttpStatus.OK).body(u);
	}
}

