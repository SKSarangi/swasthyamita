package com.medicalHealth.swasthyamita.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.medicalHealth.swasthyamita.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	@Query(value="SELECT * from user where email  = :email",nativeQuery=true)
	public User getUserByEmailId(String email);
	
	@Query(value="SELECT * from user where email  = :email and password = :password",nativeQuery=true)
	public  User findByEmailIdAndPassword(String email, String password);
	
	
}
