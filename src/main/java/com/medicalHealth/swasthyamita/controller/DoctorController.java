package com.medicalHealth.swasthyamita.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.medicalHealth.swasthyamita.exception.ResourceNotFoundException;
import com.medicalHealth.swasthyamita.model.Doctor;
import com.medicalHealth.swasthyamita.repository.DoctorRepository;
import com.medicalHealth.swasthyamita.service.DoctorService;


@RestController
@RequestMapping("/doctor")
public class DoctorController {
	
	@Autowired
	private DoctorRepository doctorRepository;
	
	@Autowired
	private DoctorService doctorService;

	@PostMapping("/login")
	public Doctor loginUser(@RequestBody Doctor doctor) throws ResourceNotFoundException {
		System.out.println(doctor);
		String email = doctor.getEmail();
		String password = doctor.getPassword();
		Doctor doctorObj = null;
		if (email != null && password != null) {
			doctorObj = doctorService.fetchDoctorByEmailIdAndPassword(email, password);
			System.out.println(doctorObj);
		}
		if (doctorObj == null) {
			throw new ResourceNotFoundException("Invalid Credential");
		}
		return doctorObj;

	}
	
	@PostMapping("/register")
	public Doctor createDoctor(@RequestBody Doctor doctor) {
		System.out.println(doctor);
		return doctorRepository.save(doctor);
	}
	
	@PostMapping("/getByAddress")
	public ResponseEntity<Doctor> getDoctoByEmailId(@RequestBody Doctor doctor) {
		System.out.println(doctor.getAddress2());
		return new ResponseEntity<>(doctorService.getDoctorByAddress(doctor.getAddress2()), HttpStatus.OK);
	}
	
	@PostMapping("/getByAddressANDSpecialization")
	public ResponseEntity<Doctor> getDoctoByAddressANDSpcialization(@RequestBody Doctor doctor) {
		String address2 = doctor.getAddress2();
		String specialist = doctor.getSpecialist();
		return new ResponseEntity<>(doctorService.getDoctorByAddressANDspecialization(address2, specialist), HttpStatus.OK);
	}
} 
