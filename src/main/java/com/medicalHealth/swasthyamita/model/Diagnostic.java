package com.medicalHealth.swasthyamita.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "diagnostic")
@Table(name = "diagnostic")
public class Diagnostic {
	
	private long uniqueId;
	private String name;
	private String diagnosticCenter;
	private String gender;
	private String registrationID;
	private String adoptedID;
	private String address1;
	private String address2;
	private String phoneNumber;
	private String email;
	private String password;

	public Diagnostic() {

	}
	
	public Diagnostic(long uniqueId, String name, String diagnosticCenter, String gender, String registrationID,
			String adoptedID, String address1, String address2, String phoneNumber, String email, String password) {
		this.uniqueId = uniqueId;
		this.name = name;
		this.diagnosticCenter = diagnosticCenter;
		this.gender = gender;
		this.registrationID = registrationID;
		this.adoptedID = adoptedID;
		this.address1 = address1;
		this.address2 = address2;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.password = password;
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

	@Column(name = "diagnosticCenter", nullable = false)
	public String getDiagnosticCenter() {
		return diagnosticCenter;
	}

	public void setDiagnosticCenter(String diagnosticCenter) {
		this.diagnosticCenter = diagnosticCenter;
	}

	@Column(name = "gender", nullable = false)
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Column(name = "registrationID", nullable = false)
	public String getRegistrationID() {
		return registrationID;
	}

	public void setRegistrationID(String registrationID) {
		this.registrationID = registrationID;
	}

	@Column(name = "adoptedID", nullable = false)
	public String getAdoptedID() {
		return adoptedID;
	}

	public void setAdoptedID(String adoptedID) {
		this.adoptedID = adoptedID;
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

	@Override
	public String toString() {
		return "Diagnostic [uniqueId=" + uniqueId + ", name=" + name + ", diagnosticCenter=" + diagnosticCenter
				+ ", gender=" + gender + ", registrationID=" + registrationID + ", adoptedID=" + adoptedID
				+ ", address1=" + address1 + ", address2=" + address2 + ", phoneNumber=" + phoneNumber + ", email="
				+ email + ", password=" + password + "]";
	}
}
