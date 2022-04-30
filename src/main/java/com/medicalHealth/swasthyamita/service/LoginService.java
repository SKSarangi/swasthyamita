//package com.medicalHealth.swasthyamita.service;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpSession;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
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
//	public ServiceResponse userLogin(User user) {
//
//		ServiceResponse serviceResponse = new ServiceResponse();
//		User usr = new User();
//
//		try {
//
//			usr = userLoginRepository.findUserByEmailId(user.getEmail());
//			String password = codec.decrypt(user.getPassword());
//
//			usr.setEmail(user.getEmail());
//
//			if (usr != null) {
//				User userChk = userLoginRepository.findByEmailIdAndPassword(user.getEmail(), password);
//
//				if (userChk != null) {
//
//					session = request.getSession();
//					session.invalidate();
//					session = request.getSession(true);
//					session.setMaxInactiveInterval(15 * 60);
//					session.setAttribute("user", user);
//
//					serviceResponse.setServiceResponse(usr);
//					serviceResponse.setServiceStatus(ServiceResponse.STATUS_SUCCESS);
//					serviceResponse.setServiceError("");
//					return serviceResponse;
//
//				} else {
//					serviceResponse.setServiceResponse("");
//					serviceResponse.setServiceStatus(ServiceResponse.STATUS_FAIL);
//					serviceResponse.setServiceError("Username or Password Invalid");
//					return serviceResponse;
//				}
//
//			}
//
//		} catch (Exception e) {
//			serviceResponse.setServiceError("Something Went Wrong");
//			serviceResponse.setServiceResponse(e.getMessage());
//			serviceResponse.setServiceStatus(ServiceResponse.STATUS_FAIL);
//
//		}
//
//		return serviceResponse;
//
//	}
//	
//
//}
