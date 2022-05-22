package com.medicalHealth.swasthyamita.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.groovy.util.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.medicalHealth.swasthyamita.model.Doctor;
import com.medicalHealth.swasthyamita.model.User;
import com.medicalHealth.swasthyamita.repository.UserRepository;
import com.medicalHealth.swasthyamita.response.ServiceResponse;
import com.medicalHealth.swasthyamita.service.UserService;

import com.medicalHealth.swasthyamita.exception.ResourceNotFoundException;

@RestController
@RequestMapping("/patient")
public class UserController {

	@Autowired
	private UserService userService;
	

	@Autowired
	private UserRepository userRepository;

	@PostMapping("/login")
	public User loginUser(@RequestBody User user) throws ResourceNotFoundException {
		System.out.println(user);
		String email = user.getEmail();
		String password = user.getPassword();
		User userObj = null;
		if (email != null && password != null) {
			userObj = userService.fetchUserByEmailIdAndPassword(email, password);
			System.out.println(userObj);
		}
		if (userObj == null) {
			throw new ResourceNotFoundException("Invalid Credential");
		}
		return userObj;

	}
	
//	@PostMapping("/register")
//	public User createUser(@RequestBody User user) {
//		System.out.println(user);
//		return userRepository.save(user);
//	}
	
	@PostMapping(value = "/register", consumes = {MediaType.MULTIPART_FORM_DATA_VALUE})
    public User createUser(@ModelAttribute User user) {
		return userRepository.save(user);
    }

	@PostMapping("/getByEmail")
	public ResponseEntity<User> getEmployeeByEmailId(@RequestBody User user) {
		System.out.println(user.getEmail());
		return new ResponseEntity<>(userService.userGetUserByEmailId(user.getEmail()), HttpStatus.OK);
	}
	
}
