//package com.medicalHealth.swasthyamita.repository;
//
//import java.sql.Timestamp;
//import java.util.List;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Modifying;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//import org.springframework.transaction.annotation.Transactional;
//
//import com.medicalHealth.swasthyamita.model.User;
//
//public interface UserLoginRepository extends JpaRepository<User, Integer> {
//
//	@Query("From User user Where user.email =:email ")
//	public User findUserByEmailId(@Param("email") String email);
//
//	@Query(value = "SELECT * from user "
//			+ "Where email =:email and user.password = AES_ENCRYPT(:password, 'ApmosysRuambot#2020') and is_active='Y' ", nativeQuery = true)
//	public User findByEmailIdAndPassword(@Param("email") String userid, @Param("password") String password);
//
//	@Query("From User user")
//	public List<User> getUsers();
//
//}
