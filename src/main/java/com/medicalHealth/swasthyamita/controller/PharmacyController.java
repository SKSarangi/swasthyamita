package com.medicalHealth.swasthyamita.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.medicalHealth.swasthyamita.exception.ResourceNotFoundException;
import com.medicalHealth.swasthyamita.model.Pharmacy;
import com.medicalHealth.swasthyamita.repository.PharmacyRepository;
import com.medicalHealth.swasthyamita.service.PharmacyService;


@RestController
@RequestMapping("/pharmacy")
public class PharmacyController {
	
	@Autowired
	private PharmacyService pharmacyService;
	

	@Autowired
	private PharmacyRepository pharmacyRepository;
	
	@PostMapping("/login")
	public Pharmacy loginUser(@RequestBody Pharmacy pharmacy) throws ResourceNotFoundException {
		System.out.println(pharmacy);
		String email = pharmacy.getEmail();
		String password = pharmacy.getPassword();
		Pharmacy pharmacyObj = null;
		if (email != null && password != null) {
			pharmacyObj = pharmacyService.fetchPharmacyByEmailIdAndPassword(email, password);
			System.out.println(pharmacyObj);
		}
		if (pharmacyObj == null) {
			throw new ResourceNotFoundException("Invalid Credential");
		}
		return pharmacyObj;

	}
	
	@PostMapping("/register")
	public Pharmacy createUser(@RequestBody Pharmacy pharmacy) {
		System.out.println(pharmacy);
		return pharmacyRepository.save(pharmacy);
	}

	@PostMapping("/getByEmail")
	public ResponseEntity<Pharmacy> getEmployeeByEmailId(@RequestBody Pharmacy pharmacy) {
		System.out.println(pharmacy.getEmail());
		return new ResponseEntity<>(pharmacyService.getPharmacyByEmail(pharmacy.getEmail()), HttpStatus.OK);
	}

}
