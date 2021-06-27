package com.toolkit.restservices.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.toolkit.restservices.entities.User;
import com.toolkit.restservices.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository ;
	
	public List<User> getAllUsers() {

		return userRepository.findAll();

	}
	
	
	public User createUser(User user) {
		return userRepository.save(user);
	}

}
