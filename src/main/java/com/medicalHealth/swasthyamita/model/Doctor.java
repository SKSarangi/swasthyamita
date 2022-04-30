package com.medicalHealth.swasthyamita.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "doctor")
@Table(name = "doctor")
public class Doctor {
	
	private long uniqueId;
	private String name;
	private String gender;
	private String specialist;
	private String registrationID;
	private String phoneNumber;
	private String email;
	private String password;
	private String address1;
	private String address2;
	
	public Doctor() {

	}
	
	public Doctor(long uniqueId, String name, String gender, String specialist, String registrationID,
			String phoneNumber, String email, String password, String address1, String address2) {
		this.uniqueId = uniqueId;
		this.name = name;
		this.gender = gender;
		this.specialist = specialist;
		this.registrationID = registrationID;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.password = password;
		this.address1 = address1;
		this.address2 = address2;
	}


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getUniqueId() {
		return uniqueId;
	}

	public void setUniqueId(long uniqueId) {
		this.uniqueId = uniqueId;
	}

	@Column(name = "name", nullable = false)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "gender", nullable = false)
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Column(name = "specialist", nullable = false)
	public String getSpecialist() {
		return specialist;
	}

	public void setSpecialist(String specialist) {
		this.specialist = specialist;
	}

	@Column(name = "registrationID", nullable = false)
	public String getRegistrationID() {
		return registrationID;
	}

	public void setRegistrationID(String registrationID) {
		this.registrationID = registrationID;
	}

	@Column(name = "phoneNumber", nullable = false)
	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Column(name = "email", nullable = false)
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "password", nullable = false)
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "address1", nullable = false)
	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	@Column(name = "address2", nullable = false)
	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	
	@Override
	public String toString() {
		return "Doctor [name=" + name + ", gender=" + gender + ", specialist=" + specialist
				+ ", address1=" + address1 + ", address2=" + address2 + "]";
	}


}
