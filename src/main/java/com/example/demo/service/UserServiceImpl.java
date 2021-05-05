package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repo.UserRepository;

import javax.transaction.Transactional;

@Service
public class UserServiceImpl implements UserService{
	private UserRepository userRepository;
	
	
	@Autowired
	public UserServiceImpl(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public User createUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	@Override
	public User findByUserId(Integer theId) {
		// TODO Auto-generated method
		User result=userRepository.findByUserId(theId);
		return result;

	}

	@Override
	@Transactional
	public Integer deleteByUserId(Integer userId) {
		return userRepository.deleteByUserId(userId);
	}
	@Override
	public User updateUser(User user,Integer id) {
		// TODO Auto-generated method stub
		User user1=userRepository.findByUserId(id);



			user1.setFirstName(user.getFirstName());
			user1.setLastName(user.getLastName());
			user1.setEmail(user.getEmail());
			return userRepository.save(user1);
	}

}
