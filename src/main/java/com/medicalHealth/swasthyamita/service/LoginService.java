//package com.medicalHealth.swasthyamita.service;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpSession;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.apmosys.mahindraleasingsystemcalculator.models.PortalUser;
//import com.apmosys.mahindraleasingsystemcalculator.services.DBconnection;
//import com.medicalHealth.swasthyamita.Codec;
//import com.medicalHealth.swasthyamita.model.User;
//import com.medicalHealth.swasthyamita.repository.UserLoginRepository;
//import com.medicalHealth.swasthyamita.response.ServiceResponse;
//
//@Service
//public class LoginService {
//
//	@Autowired
//	private UserLoginRepository userLoginRepository;
//
//	@Autowired
//	private Codec codec;
//
//	@Autowired
//	private HttpServletRequest request;
//
//	@Autowired
//	private HttpSession session;
//
//	@SuppressWarnings("unused")
//	public ServiceResponse checkSessionWhileLogin(PortalUser user,String remoteAddr) {
//
//		PortalUser portalUser;
//		int active = 0;
//		ServiceResponse serviceResponse=new ServiceResponse();
//		String qry1="SELECT active_status FROM user_sessions WHERE user_id=?";
//		Connection con=null;
//		PreparedStatement stmt=null;
//		ResultSet rs1=null;
//		String systemipaddress = "";
//
//		try{
//
//			System.out.println("in checkSessionWhileLogin try");
//			con = DBconnection.getConnectionforUAT();
//			stmt=con.prepareStatement(qry1);
//			System.out.println("userid===="+user.getUserid());
//			stmt.setString(1, user.getUserid());
//			rs1 = stmt.executeQuery();
//			String activeStatus=null;
//			while(rs1.next()) {activeStatus= rs1.getString(1);}
//			con.close();
//			System.out.println(activeStatus);
//			if(activeStatus == null) {
//				serviceResponse= checkLogin(user, remoteAddr);
//			}
//			else if(activeStatus.equalsIgnoreCase("Y")) {
//				System.out.println("inside else if:-"+activeStatus);
//				serviceResponse.setServiceResponse("Y");
//				serviceResponse.setServiceStatus(ServiceResponse.STATUS_SUCCESS);
//			}
//			//System.out.println(activeStatus);
//			//serviceResponse.setServiceResponse(activeStatus);
//			//serviceResponse.setServiceStatus(ServiceResponse.STATUS_SUCCESS);
//			//serviceResponse.setServiceError("Username or Password Invalid");
//			return serviceResponse;
//
//
//
//
//		}catch (Exception e) {
//			System.out.println("ERROR:- "+e);
//			logger.error(e);
//		}finally {
//
//			close(rs1, stmt, con);
//		}
//		logger.info(serviceResponse);
//		return serviceResponse;
//	}
//
//	public ServiceResponse checkLogin(PortalUser user,String remoteAddr)  {
//
//		PortalUser portalUser=null;
//		int active = 0;
//		ServiceResponse serviceResponse=new ServiceResponse();
//		String qry1="SELECT is_active FROM role_table WHERE role_id=?";
//		Connection con=null;
//		PreparedStatement stmt=null;
//		ResultSet rs1 =null;
//		PreparedStatement stmt3=null; 
//		PreparedStatement stmt2=null;
//		String systemipaddress = "";
//
//		try{
//
//
//			System.out.println("in login try");
//			con = DBconnection.getConnectionforUAT();
//			stmt=con.prepareStatement(qry1);
//			String name="";
//			System.out.println("userid===="+user.getUserid());
//			String password=codec.decrypt(user.getPassword());
//			System.out.println("password:- "+password);
//
//
//			PortalUser usr = portaluserRepository.findByUserid(user.getUserid ());
//			String authentication=usr.getAuthentication();
//
//			if(authentication.equals("LDAP")||authentication.equals("ldap")) {			
////				name = checkAuthService.authenticate(user.getUserid(), password);
//				System.out.println("name==="+name);
//				portalUser=usr;
//				stmt.setInt(1, portalUser.getRole_id());
//				rs1 = stmt.executeQuery();
//				while(rs1.next()) 
//					active=rs1.getInt(1);
//				if(active != 0) {
//					portalUser.setRole_id(0);
//					portalUser.setUsertype(usr.getUsertype());
//				}
//				if (name==null||name==""||name=="Validation failed") {
//					portalUser=new PortalUser();
//				}
//
//			}
//			else {
//
//				System.out.println("in login else");
//				portalUser = portaluserRepository.findByUseridAndPassword(user.getUserid(), password);				
//				System.out.println("RUAMBOT USER:----------->"+portalUser);	
//				if(portalUser!=null) {
//					stmt.setInt(1, portalUser.getRole_id());
//					rs1 = stmt.executeQuery();
//					while(rs1.next()) 
//						active=rs1.getInt(1);
//					if(active != 0) {
//						portalUser.setRole_id(0);
//						portalUser.setUsertype(usr.getUsertype());
//					}
//					name= portalUser.getFullname();		
//
//				}
//				else {
//
//
//					PortalUser usr1 = portaluserRepository.getUser(user.getUserid());
//					serviceResponse.setServiceError("Username or Password Invalid");
//					logger.info("Username or Password Invalid---------getUser-------");
//
//
//					if(usr1!=null && usr1.getIs_active().equalsIgnoreCase("Y")){
//
//						usr1.setCount(usr1.getCount()+1);
//						if(usr1.getCount()==3){
//							usr1.setIs_active("N");
//							serviceResponse.setServiceError("3 Wrong Attempts,Your Account Has been Locked");
//							logger.info("------3 Wrong Attempts,Your Account Has been Locked--------");
//
//							String subject="Dear Team,\r\r"+
//									user.getUserid()+" Has Tried Invalid Password for 3 times and Account Has been Locked.\r\r"+
//									"Thanks & Regards,\r ApMoSys Monitoring Team";
//							//userService.sendMail(subject,"");
//						}
//						else {
//
//
//						}
//						portaluserRepository.save(usr1);
//					}
//
//					serviceResponse.setServiceResponse("");
//					serviceResponse.setServiceStatus(ServiceResponse.STATUS_FAIL);
//					logger.info("------STATUS_FAIL--------");
//					System.out.println("RUAMBOT USER:----------->Not Exist");	
//					return serviceResponse;
//
//
//
//				}
//				remoteAddr="";
//				portalUser.setIP_address(remoteAddr);
//
//			}
//			
//
//
//			if(name != null||name!=""||name!="Validation failed"){
//				System.out.println("Test pass");
//				session=request.getSession();
//				session.invalidate();
//				session=request.getSession(true);
//				session.setMaxInactiveInterval(15*60);
//				//user.setFullname(name);
//				String token=codec.encrypt(user.getLoginTime());
//				session.setAttribute("tokenID", token);
//				//portalUser.setTokenID(token);
//				if(token != null) {
//					try{
//						portalUser.setTokenID(token);
//					}catch (Exception e) {
//						logger.error(e);
//					}
//					
//				}
//				session.setAttribute("user", portalUser);
//
//
//				String qry2="INSERT INTO user_sessions(user_id, session_key, active_status, logintime) Values(?, ?, ?, ?)";
//				 
//				stmt2=con.prepareStatement(qry2);
//				stmt2.setString(1, user.getUserid());
//				String sessionid=session.getId();
//				System.out.println("sessionid:- "+sessionid);
//				stmt2.setString(2,  sessionid);
//				stmt2.setString(3, "Y");
//				stmt2.setString(4, user.getLoginTime());
//				int rs2 = stmt2.executeUpdate();
//				System.out.println("rs2:- "+rs2);
//
//				if(rs2 == 1) {
//					String qry3="DELETE FROM user_sessions WHERE user_id=? AND logintime < ?";
//					
//					stmt3=con.prepareStatement(qry3);
//					stmt3.setString(1, user.getUserid());
//					stmt3.setString(2, user.getLoginTime());
//					int rs3 = stmt3.executeUpdate();
//					System.out.println("rs3:- "+rs3);
//				}
//				con.close();
//				updatelastlogin(user.getUserid(),remoteAddr);
//				serviceResponse.setServiceResponse(portalUser);
//				serviceResponse.setServiceStatus(ServiceResponse.STATUS_SUCCESS);
//				serviceResponse.setServiceError("");
//				return serviceResponse;
//			}else{
//				updatelastfailedlogin(user.getUserid(),remoteAddr);
//				con.close();
//				serviceResponse.setServiceResponse("");
//				serviceResponse.setServiceStatus(ServiceResponse.STATUS_FAIL);
//				serviceResponse.setServiceError("Username or Password Invalid");
//				return serviceResponse;
//			}
//
//
//
//
//		}catch (Exception e) {
//
//			logger.error(e);
//			updatelastfailedlogin(user.getUserid(),remoteAddr);
//		}finally {
//			try {
//				if(stmt3!=null)
//					stmt3.close();
//			} catch (SQLException e) {
//				logger.error(e);
//			}
//			try {
//				if(stmt2!=null)
//					stmt2.close();
//			} catch (SQLException e) {
//				logger.error(e);
//			}
//			DBconnection.close(rs1, stmt, con);
//		}
//		logger.info(serviceResponse);
//		return serviceResponse;
//	}
//
//}
