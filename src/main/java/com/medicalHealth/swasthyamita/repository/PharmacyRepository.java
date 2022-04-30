package com.medicalHealth.swasthyamita.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.medicalHealth.swasthyamita.model.Pharmacy;

@Repository
public interface PharmacyRepository extends JpaRepository<Pharmacy, Long> {
	
	@Query(value="SELECT * from user where email  = :email",nativeQuery=true)
	public Pharmacy getPharmacyByEmailId(String email);
	
	@Query(value="SELECT * from user where email  = :email and password = :password",nativeQuery=true)
	public  Pharmacy findPharmacyByEmailIdAndPassword(String email, String password);

}
