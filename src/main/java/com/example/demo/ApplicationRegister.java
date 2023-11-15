package com.example.demo;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="application_details")
public class ApplicationRegister {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Override
	public String toString() {
		return "ApplicationRegister [id=" + id + ", email=" + email + ", f_name=" + f_name + ", l_name=" + l_name
				+ ", dob=" + dob + ", place_of_birth=" + place_of_birth + ", gender=" + gender + ", pan_aadhar="
				+ pan_aadhar + ", employment_type=" + employment_type + ", education_details=" + education_details
				+ ", fathers_name=" + fathers_name + ", mothers_name=" + mothers_name + ", house_no=" + house_no
				+ ", street_name=" + street_name + ", city=" + city + ", district=" + district + ", state=" + state
				+ ", pincode=" + pincode + ", phone_no=" + phone_no + ", appointment_date=" + appointment_date
				+ ", sscmarksheet=" + sscmarksheet + ", aadharcard_pancard=" + aadharcard_pancard + ", paymentslip="
				+ paymentslip + "]";
	}
	@Column(name="email")
	private String email;
	@Column(name="f_name")
	private String f_name;
	@Column(name="l_name")
	private String l_name;
	@Column(name="dob")
	private String dob;
	@Column(name="place_of_birth")
	private String place_of_birth;
	@Column(name="gender")
	private String gender;
	@Column(name="pan_aadhar")
	private String pan_aadhar;
	@Column(name="employment_type")
	private String employment_type;
	@Column(name="education_details")
	private String education_details;
	@Column(name="fathers_name")
	private String fathers_name;
	@Column(name="mothers_name")
	private String mothers_name;
	@Column(name="house_no")
	private String house_no;
	@Column(name="street_name")
	private String street_name;
	@Column(name="city")
	private String city;
	@Column(name="district")
	private String district;
	@Column(name="state")
	private String state;
	@Column(name="pincode")
	private String pincode;
	@Column(name="phone_no")
	private String phone_no;
	
	@Column(name="appointment_date")
	private String appointment_date;
	@Column(name="sscmarksheet")
	private String sscmarksheet;
	@Column (name="aadharcard_pancard")
	private String aadharcard_pancard;
	@Column (name="paymentslip")
	private String paymentslip;
	@Column (name="application_status")
	private String application_status;
	@Column (name="passportno")
	private String passportno;
	
	
	public String getPassportno() {
		return passportno;
	}
	public void setPassportno(String passportno) {
		this.passportno = passportno;
	}
	public String getApplication_status() {
		return application_status;
	}
	public void setApplication_status(String application_status) {
		this.application_status = application_status;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getF_name() {
		return f_name;
	}
	public void setF_name(String f_name) {
		this.f_name = f_name;
	}
	public String getL_name() {
		return l_name;
	}
	public void setL_name(String l_name) {
		this.l_name = l_name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getPlace_of_birth() {
		return place_of_birth;
	}
	public void setPlace_of_birth(String place_of_birth) {
		this.place_of_birth = place_of_birth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPan_aadhar() {
		return pan_aadhar;
	}
	public void setPan_aadhar(String pan_aadhar) {
		this.pan_aadhar = pan_aadhar;
	}
	public String getEmployment_type() {
		return employment_type;
	}
	public void setEmployment_type(String employment_type) {
		this.employment_type = employment_type;
	}
	
	public String getEducation_details() {
		return education_details;
	}
	public void setEducation_details(String education_details) {
		this.education_details = education_details;
	}
	public String getFathers_name() {
		return fathers_name;
	}
	public void setFathers_name(String fathers_name) {
		this.fathers_name = fathers_name;
	}
	public String getMothers_name() {
		return mothers_name;
	}
	public void setMothers_name(String mothers_name) {
		this.mothers_name = mothers_name;
	}
	public String getHouse_no() {
		return house_no;
	}
	public void setHouse_no(String house_no) {
		this.house_no = house_no;
	}
	public String getStreet_name() {
		return street_name;
	}
	public void setStreet_name(String street_name) {
		this.street_name = street_name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getAppointment_date() {
		return appointment_date;
	}
	public void setAppointment_date(String appointment_date) {
		this.appointment_date = appointment_date;
	}
	public String getSscmarksheet() {
		return sscmarksheet;
	}
	public void setSscmarksheet(String sscmarksheet) {
		this.sscmarksheet = sscmarksheet;
	}
	public String getAadharcard_pancard() {
		return aadharcard_pancard;
	}
	public void setAadharcard_pancard(String aadharcard_pancard) {
		this.aadharcard_pancard = aadharcard_pancard;
	}
	public String getPaymentslip() {
		return paymentslip;
	}
	public void setPaymentslip(String paymentslip) {
		this.paymentslip = paymentslip;
	}
	
	
	public ApplicationRegister(int id, String email, String f_name, String l_name, String dob, String place_of_birth,
			String gender, String pan_aadhar, String employment_type, String education_details, String fathers_name,
			String mothers_name, String house_no, String street_name, String city, String district, String state,
			String pincode, String phone_no, String appointment_date, String sscmarksheet, String aadharcard_pancard,
			String paymentslip, String application_status ,String passportno) {
		super();
		this.id = id;
		this.email = email;
		this.f_name = f_name;
		this.l_name = l_name;
		this.dob = dob;
		this.place_of_birth = place_of_birth;
		this.gender = gender;
		this.pan_aadhar = pan_aadhar;
		this.employment_type = employment_type;
		this.education_details = education_details;
		this.fathers_name = fathers_name;
		this.mothers_name = mothers_name;
		this.house_no = house_no;
		this.street_name = street_name;
		this.city = city;
		this.district = district;
		this.state = state;
		this.pincode = pincode;
		this.phone_no = phone_no;
		this.appointment_date = appointment_date;
		this.sscmarksheet = sscmarksheet;
		this.aadharcard_pancard = aadharcard_pancard;
		this.paymentslip = paymentslip;
		this.application_status=application_status;
		this.passportno=passportno;
		
	}
	public ApplicationRegister() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	

}
