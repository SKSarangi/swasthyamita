package com.medicalHealth.swasthyamita.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicalHealth.swasthyamita.model.Pharmacy;
import com.medicalHealth.swasthyamita.repository.PharmacyRepository;

@Service
public class PharmacyService {

	@Autowired
	private PharmacyRepository pharmacyRepository;

	public Pharmacy fetchPharmacyByEmailIdAndPassword(String email, String password) {
		return pharmacyRepository.findPharmacyByEmailIdAndPassword(email, password);
	}

	public Pharmacy getPharmacyByEmail(String email) {
		System.out.println(pharmacyRepository.getPharmacyByEmailId(email));
		return pharmacyRepository.getPharmacyByEmailId(email);
	}

}
