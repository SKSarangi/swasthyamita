package com.medicalHealth.swasthyamita.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "user")
@Table(name = "user")
public class User {

	private long id;
	private String mobile;
	private String districtid;
	private String email;
	private String user_type;
	private String dob;
	private String gender;
	private String name;
	private String password;
	private String pin;
	private String address;

	public User() {

	}

	public User(String mobile, String districtid, String email, String user_type, String dob, String gender,
			String name, String password, String pin, String address) {
		this.mobile = mobile;
		this.districtid = districtid;
		this.email = email;
		this.user_type = user_type;
		this.dob = dob;
		this.gender = gender;
		this.name = name;
		this.password = password;
		this.pin = pin;
		this.address = address;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "mobile", nullable = false)
	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Column(name = "districtid", nullable = false)
	public String getDistrictid() {
		return districtid;
	}

	public void setDistrictid(String districtid) {
		this.districtid = districtid;
	}

	@Column(name = "email", nullable = false)
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "user_type", nullable = false)
	public String getUser_type() {
		return user_type;
	}

	public void setUser_type(String user_type) {
		this.user_type = user_type;
	}

	@Column(name = "dob", nullable = false)
	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	@Column(name = "gender", nullable = false)
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Column(name = "name", nullable = false)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "password", nullable = false)
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "pin", nullable = false)
	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}
	
	@Column(name = "address", nullable = false)
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	

	@Override
	public String toString() {
		return "User [id=" + id + ", mobile=" + mobile + ", districtid=" + districtid + ", email=" + email
				+ "user_type=" + user_type + ", dob=" + dob + ", gender=" + gender + ", name=" + name + ", password="
				+ password + ", pin="+ pin +", address="+ address +"]";
	}

}

