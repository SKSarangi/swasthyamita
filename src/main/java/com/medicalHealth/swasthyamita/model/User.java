package com.medicalHealth.swasthyamita.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.web.multipart.MultipartFile;

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
	private String bloodgroup;
	private String bodyweight;
	private boolean smoking;
	private boolean alcohol;
	private boolean tobacco;
	private String otherBadHabits;
	private String chronicDiseases;
	private MultipartFile  previousPrescriptions;
	private MultipartFile  previousPIreports;
	private String idNumber;
	private MultipartFile  idProof;

	
	public User() {

	}

	public User(long id, String mobile, String districtid, String email, String user_type, String dob, String gender,
			String name, String password, String pin, String address, String bloodgroup, String bodyweight,
			boolean smoking, boolean alcohol, boolean tobacco, String otherBadHabits, String chronicDiseases,
			MultipartFile previousPrescriptions, MultipartFile previousPIreports, String idNumber, MultipartFile idProof) {
		super();
		this.id = id;
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
		this.bloodgroup = bloodgroup;
		this.bodyweight = bodyweight;
		this.smoking = smoking;
		this.alcohol = alcohol;
		this.tobacco = tobacco;
		this.otherBadHabits = otherBadHabits;
		this.chronicDiseases = chronicDiseases;
		this.previousPrescriptions = previousPrescriptions;
		this.previousPIreports = previousPIreports;
		this.idNumber = idNumber;
		this.idProof = idProof;
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
	
	@Column(name = "bloodgroup", nullable = false)
	public String getBloodgroup() {
		return bloodgroup;
	}

	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}

	@Column(name = "bodyweight", nullable = false)
	public String getBodyweight() {
		return bodyweight;
	}

	public void setBodyweight(String bodyweight) {
		this.bodyweight = bodyweight;
	}

	@Column(name = "smoking", nullable = false)
	public boolean isSmoking() {
		return smoking;
	}

	public void setSmoking(boolean smoking) {
		this.smoking = smoking;
	}

	@Column(name = "tobacco", nullable = false)
	public boolean isTobacco() {
		return tobacco;
	}

	public void setTobacco(boolean tobacco) {
		this.tobacco = tobacco;
	}

	@Column(name = "otherBadHabits", nullable = false)
	public String getOtherBadHabits() {
		return otherBadHabits;
	}

	public void setOtherBadHabits(String otherBadHabits) {
		this.otherBadHabits = otherBadHabits;
	}

	@Column(name = "chronicDiseases", nullable = false)
	public String getChronicDiseases() {
		return chronicDiseases;
	}

	public void setChronicDiseases(String chronicDiseases) {
		this.chronicDiseases = chronicDiseases;
	}

	@Column(name = "previousPrescriptions", nullable = false)
	public MultipartFile getPreviousPrescriptions() {
		return previousPrescriptions;
	}

	public void setPreviousPrescriptions(MultipartFile previousPrescriptions) {
		this.previousPrescriptions = previousPrescriptions;
	}

	@Column(name = "previousPIreports", nullable = false)
	public MultipartFile getPreviousPIreports() {
		return previousPIreports;
	}

	public void setPreviousPIreports(MultipartFile previousPIreports) {
		this.previousPIreports = previousPIreports;
	}
	
	
	@Column(name = "idNumber", nullable = false)
	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}


	@Column(name = "idProof", nullable = false)
	public MultipartFile getIdProof() {
		return idProof;
	}

	public void setIdProof(MultipartFile idProof) {
		this.idProof = idProof;
	}

	
	@Override
	public String toString() {
		return "User [id=" + id + ", mobile=" + mobile + ", districtid=" + districtid + ", email=" + email
				+ ", user_type=" + user_type + ", dob=" + dob + ", gender=" + gender + ", name=" + name + ", password="
				+ password + ", pin=" + pin + ", address=" + address + ", bloodgroup=" + bloodgroup + ", bodyweight="
				+ bodyweight + ", smoking=" + smoking + ", alcohol=" + alcohol + ", tobacco=" + tobacco
				+ ", otherBadHabits=" + otherBadHabits + ", chronicDiseases=" + chronicDiseases
				+ ", previousPrescriptions=" + previousPrescriptions + ", previousPIreports=" + previousPIreports
				+ ", idNumber= " + idNumber + ", idProof=" + idProof + "]";
	}

}

