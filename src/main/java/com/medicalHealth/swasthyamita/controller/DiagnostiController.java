package com.medicalHealth.swasthyamita.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.medicalHealth.swasthyamita.exception.ResourceNotFoundException;
import com.medicalHealth.swasthyamita.model.Diagnostic;
import com.medicalHealth.swasthyamita.repository.DiagnosticRepository;
import com.medicalHealth.swasthyamita.service.DiagnosticService;

@RestController
@RequestMapping("/diagnostic")
public class DiagnostiController {
	@Autowired
	private DiagnosticService diagnosticService;
	

	@Autowired
	private DiagnosticRepository diagnosticRepository;
	
	@PostMapping("/login")
	public Diagnostic loginUser(@RequestBody Diagnostic diagnostic) throws ResourceNotFoundException {
		System.out.println(diagnostic);
		String email = diagnostic.getEmail();
		String password = diagnostic.getPassword();
		Diagnostic diagnosticObj = null;
		if (email != null && password != null) {
			diagnosticObj = diagnosticService.fetchDoctorByEmailIdAndPassword(email, password);
			System.out.println(diagnosticObj);
		}
		if (diagnosticObj == null) {
			throw new ResourceNotFoundException("Invalid Credential");
		}
		return diagnosticObj;

	}
	
	@PostMapping("/register")
	public Diagnostic createUser(@RequestBody Diagnostic diagnostic) {
		System.out.println(diagnostic);
		return diagnosticRepository.save(diagnostic);
	}

	@PostMapping("/getByEmail")
	public ResponseEntity<Diagnostic> getEmployeeByEmailId(@RequestBody Diagnostic diagnostic) {
		System.out.println(diagnostic.getEmail());
		return new ResponseEntity<>(diagnosticService.getDoctorByEmailId(diagnostic.getEmail()), HttpStatus.OK);
	}
	
}
