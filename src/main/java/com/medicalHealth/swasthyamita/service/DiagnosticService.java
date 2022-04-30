package com.medicalHealth.swasthyamita.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicalHealth.swasthyamita.model.Diagnostic;
import com.medicalHealth.swasthyamita.repository.DiagnosticRepository;

@Service
public class DiagnosticService {
	
	@Autowired
	private DiagnosticRepository diagnosticRepository;
	
	public Diagnostic fetchDoctorByEmailIdAndPassword(String email, String password) {
	return diagnosticRepository.findDiagnosticByEmailIdAndPassword(email, password);
	}
	
	public Diagnostic getDoctorByEmailId(String email) {
		System.out.println(diagnosticRepository.getDiagnosticByEmailId(email));	
		return diagnosticRepository.getDiagnosticByEmailId(email);
	}

}
