package com.medicalHealth.swasthyamita.response;

import java.util.List;

import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class ServiceResponse {

	private Object serviceResponse;
	private String serviceStatus;
	private Object serviceError;
	
	public static final String STATUS_FAIL="Fail";
	public static final String STATUS_SUCCESS="Success";
	public static final String PUBLISHED="PUBLISHED";

	public ServiceResponse() {
        
    }
	public ServiceResponse(final String message) {
        super();
        this.setServiceResponse(message);
    }

    public ServiceResponse(final Object message, final String error, String status) {
        super();
        this.setServiceResponse(message);
        this.setServiceError(error);
        this.setServiceStatus(status);
    }

    public ServiceResponse(final List<FieldError> fieldErrors, final List<Object> globalErrors, final String status) {
        super();
        final ObjectMapper mapper = new ObjectMapper();
        try {
            this.setServiceResponse(mapper.writeValueAsString(fieldErrors));
            this.setServiceError(mapper.writeValueAsString(globalErrors));
            this.setServiceStatus(status);
        } catch (final JsonProcessingException e) {
            this.setServiceResponse("");
            this.setServiceError("");
            this.setServiceStatus(status);
        }
    }

	public ServiceResponse(List<FieldError> fieldErrors, List<ObjectError> globalErrors) {
		// TODO Auto-generated constructor stub
		super();
        final ObjectMapper mapper = new ObjectMapper();
        try {
            this.setServiceResponse(mapper.writeValueAsString(fieldErrors));
            this.setServiceError(mapper.writeValueAsString(globalErrors));
        } catch (final JsonProcessingException e) {
            this.setServiceResponse("");
            this.setServiceError("");
        }
	}

	public ServiceResponse(String message, String serviceError) {
		// TODO Auto-generated constructor stub
		super();
	        this.setServiceResponse(message);
	        this.setServiceError(serviceError);
	}

	/**
	 * @return the serviceResponse
	 */
	public Object getServiceResponse() {
		return serviceResponse;
	}
	/**
	 * @param serviceResponse the serviceResponse to set
	 */
	public void setServiceResponse(Object serviceResponse) {
		this.serviceResponse = serviceResponse;
	}
	/**
	 * @return the serviceStatus
	 */
	 //@ApiModelProperty
	public String getServiceStatus() {
		if(serviceStatus==null)
			return "";
		return serviceStatus;
	}
	/**
	 * @param serviceStatus the serviceStatus to set
	 */
	public void setServiceStatus(String serviceStatus) {
	 
		this.serviceStatus = serviceStatus;
	}
	/**
	 * @return the serviceError
	 */
	 //@ApiModelProperty
	public Object getServiceError() {
		if(serviceError==null)
			return "";
		return serviceError;
	}
	/**
	 * @param serviceError the serviceError to set
	 */
	public void setServiceError(Object serviceError) {
		this.serviceError = serviceError;
	}
}


