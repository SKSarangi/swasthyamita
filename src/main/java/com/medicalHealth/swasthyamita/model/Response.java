package com.medicalHealth.swasthyamita.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity(name="jsondata")
@Table(name = "jsondata")
public class Response {
	
	
	private long id;
	private String userId;
    private String title;
    private String completed;
    
    public Response() {
    	
    }
    
    public Response (String userId,String title,String completed) {
    	this.userId = userId;
    	this.title = title;
    	this.completed = completed;
    	
    }
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	
	@Column(name = "userId", nullable = false)
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	
	@Column(name = "title", nullable = false)
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	
	@Column(name = "completed", nullable = false)
	public String getCompleted() {
		return completed;
	}
	public void setCompleted(String completed) {
		this.completed = completed;
	}
	
	
	@Override
    public String toString() {
        return "Response [id=" + id + ", userId=" + userId + ",title="+ title +", completed=" + completed + "]";
    }
}

