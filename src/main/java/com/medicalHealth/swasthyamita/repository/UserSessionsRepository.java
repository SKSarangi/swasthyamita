package com.medicalHealth.swasthyamita.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.medicalHealth.swasthyamita.model.UserSessions;



	public interface UserSessionsRepository extends JpaRepository<UserSessions, Integer>{
		
		
		@Transactional
		@Modifying 
		@Query(value ="DELETE FROM user_sessions WHERE  user_id=:userId ",nativeQuery=true)
		int deleteUserSessiondetails(@Param("userId") String userId);
		

		@Transactional
		@Modifying 
		@Query(value ="UPDATE user_sessions SET active_status='N' WHERE user_id=:userId and active_status='Y'",nativeQuery=true)
		int updateUserSessiondetails(@Param("userId") String userId);
		
		
		@Transactional		 
		@Query(value ="SELECT count(*) FROM user_sessions WHERE user_id=:userId ",nativeQuery=true)
		int getprevUserSessionStatus(@Param("userId") String userId);
		
		@Transactional		 
		@Query(value ="SELECT session_key FROM user_sessions WHERE user_id=:userId ",nativeQuery=true)
		String getactiveSessionID(@Param("userId") String userId);
		
		@Transactional
		@Modifying 
		@Query(value ="UPDATE user_sessions SET last_check_time=NOW()  WHERE user_id=:userId",nativeQuery=true)
		int updateLastCheckTimestamp(@Param("userId") String userId);


		
		@Transactional
		@Modifying 
		@Query(value ="DELETE FROM user_sessions WHERE last_check_time < NOW() - INTERVAL 1 minute;",nativeQuery=true)
		int deleteUserSessionBasedOnLastCheckTime();
		
		
		
}

