package com.example.demo.service;

import java.util.List;

import com.example.demo.model.User;

public interface UserService {
	public List<User> getAllUser();
	public User createUser(User user);
	public User findByUserId(Integer userId);
	public Integer deleteByUserId(Integer userId);
	public User updateUser(User user, Integer id);


}
