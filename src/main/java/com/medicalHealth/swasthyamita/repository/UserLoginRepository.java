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
//	@Query("From PortalUser user Where user.email =:email ")
//	public User findUserByEmailId(@Param("email") String email);
//
//	@Query(value = "SELECT * from user "
//			+ "Where email =:email and user.password = AES_ENCRYPT(:password, 'ApmosysRuambot#2020') and is_active='Y' ", nativeQuery = true)
//	public User findByEmailIdAndPassword(@Param("email") String userid, @Param("password") String password);
//
//	@Query("From User user")
//	public List<User> getUsers();
//
////	@Transactional
////	@Modifying
////	@Query(value = "UPDATE user u set request_type =:type,mobile =:mobile, districtid=:districtid,role=:rolename,role_id=:usertype,approver=:user2,edited_by=:userTPID,user_type=:myVar,edited_on=:date2 where u.userid = :userid", nativeQuery = true)
////	void updateUser(@Param("type") String type, @Param("mobile") String mailid, @Param("districtid") String fullname,
////			@Param("usertype") Integer usertype, @Param("userid") String userid, @Param("user2") String user2,
////			@Param("userTPID") String userTPID, @Param("myVar") String myVar, @Param("date2") String date2,
////			@Param("rolename") String rolename);
////
////
////	@Transactional
////	@Modifying
////	@Query(value = "UPDATE portal_user_details a SET a.password= AES_ENCRYPT(:pass, 'ApmosysRuambot#2020') WHERE a.userid=:user", nativeQuery = true)
////	public void updatePassword(@Param("pass") String new_pass, @Param("user") String username);
//
//}
