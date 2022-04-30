package com.medicalHealth.swasthyamita.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "pharmacy")
@Table(name = "pharmacy")
public class Pharmacy {
	
	private long uniqueId;
	private String name;
	private String shopname;
	private String gender;
	private String registrationID;
	private String adoptedID;
	private String address1;
	private String address2;
	private String phoneNumber;
	private String email;
	private String password;

	public Pharmacy() {
		
	}
	
	public Pharmacy(long uniqueId, String name, String shopname, String gender, String registrationID, String adoptedID,
			String address1, String address2, String phoneNumber, String email, String password) {
		this.uniqueId = uniqueId;
		this.name = name;
		this.shopname = shopname;
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

	@Column(name = "shopname", nullable = false)
	public String getShopname() {
		return shopname;
	}

	public void setShopname(String shopname) {
		this.shopname = shopname;
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
		return "Pharmacy [uniqueId=" + uniqueId + ", name=" + name + ", shopname=" + shopname + ", gender=" + gender
				+ ", registrationID=" + registrationID + ", adoptedID=" + adoptedID + ", address1=" + address1
				+ ", address2=" + address2 + ", phoneNumber=" + phoneNumber + ", email=" + email + ", password="
				+ password + "]";
	}


}
