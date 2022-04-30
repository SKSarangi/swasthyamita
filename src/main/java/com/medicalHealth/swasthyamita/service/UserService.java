package com.medicalHealth.swasthyamita.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.medicalHealth.swasthyamita.model.User;
import com.medicalHealth.swasthyamita.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;

	public User fetchUserByEmailIdAndPassword(String email, String password) {
	return userRepository.findByEmailIdAndPassword(email, password);
	}
	
	public User userGetUserByEmailId(String email) {
		System.out.println(userRepository.getUserByEmailId(email));	
		return userRepository.getUserByEmailId(email);
	}
	
}
