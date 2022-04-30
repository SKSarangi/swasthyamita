package com.medicalHealth.swasthyamita.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicalHealth.swasthyamita.model.Doctor;
import com.medicalHealth.swasthyamita.repository.DoctorRepository;

@Service
public class DoctorService {

	@Autowired
	private DoctorRepository doctorRepository;
	
	public Doctor fetchDoctorByEmailIdAndPassword(String email, String password) {
	return doctorRepository.findDoctorByEmailIdAndPassword(email, password);
	}
	
	public Doctor getDoctorByAddress(String address2) {
		System.out.println(doctorRepository.getDoctorByAddress(address2));
		return doctorRepository.getDoctorByAddress(address2);
	}
	
	public Doctor getDoctorByAddressANDspecialization(String address2, String specialist) {
		System.out.println(doctorRepository.getDoctorByAddressANDspecialization(address2, specialist));
		return doctorRepository.getDoctorByAddressANDspecialization(address2, specialist);
	}
	
}
