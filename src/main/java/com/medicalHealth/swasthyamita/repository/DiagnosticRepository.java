package com.medicalHealth.swasthyamita.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.medicalHealth.swasthyamita.model.Diagnostic;


@Repository
public interface DiagnosticRepository  extends JpaRepository<Diagnostic, Long> {
	
	@Query(value="SELECT * from diagnostic where email  = :email and password = :password",nativeQuery=true)
	public  Diagnostic findDiagnosticByEmailIdAndPassword(String email, String password);
	
	@Query(value="SELECT * from diagnostic where email  = :email",nativeQuery=true)
	public Diagnostic getDiagnosticByEmailId(String email);

}
