package com.medicalHealth.swasthyamita.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.medicalHealth.swasthyamita.model.Doctor;
import com.medicalHealth.swasthyamita.model.User;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long> {
	
	@Query(value="SELECT * from doctor where email  = :email and password = :password",nativeQuery=true)
	public  Doctor findDoctorByEmailIdAndPassword(String email, String password);
	
	@Query(value="SELECT * from doctor where address2  = :address2",nativeQuery=true)
	public Doctor getDoctorByAddress(String address2);

	
	@Query(value="SELECT * from doctor where address2  = :address2 and specialist = :specialist",nativeQuery=true)
	public Doctor getDoctorByAddressANDspecialization(String address2, String specialist);


}
