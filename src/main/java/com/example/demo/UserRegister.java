package com.example.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
//@javax.xml.bind.annotation.XmlRootElement(name="UserCredentails")
//@Table(name="Usercredentials")
//@javax.xml.bind.annotation.XmlRootElement(name="userprofile")


@Table(name="userprofile")

public class UserRegister {
	@Id 
	@GeneratedValue(generator = "User_gen", strategy = GenerationType.AUTO)
	@SequenceGenerator(initialValue = 20000 ,allocationSize = 10, name = "User_gen")
	
	@Column(name="userid")
	private int userid;
	@Column(name="password")
	private String password;
	@Column(name="name")
    private String name;
	@Column(name="emailid")
	private String emailid;
	@Column(name="dob")
	private String dob;
	@Column(name="gender")
	private String gender;
	@Column(name="presentaddress")
	private String presentaddress;
	@Column (name="permanentaddress")
	private String permanentaddress;
	@Column(name="phonenumber")
	private String phonenumber;
	
	public UserRegister(int userid, String password, String name, String emailid, String dob, String gender,
			String presentaddress, String permanentaddress, String phonenumber) {
		super();
		this.userid = userid;
		this.password = password;
		this.name = name;
		this.emailid = emailid;
		this.dob = dob;
		this.gender = gender;
		this.presentaddress = presentaddress;
		this.permanentaddress = permanentaddress;
		this.phonenumber = phonenumber;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPresentaddress() {
		return presentaddress;
	}
	public void setPresentaddress(String presentaddress) {
		this.presentaddress = presentaddress;
	}
	public String getPermanentaddress() {
		return permanentaddress;
	}
	public void setPermanentaddress(String permanentaddress) {
		this.permanentaddress = permanentaddress;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public UserRegister() {
		super();
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public int getUserid() {
		return userid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailId) {
		this.emailid = emailId;
	}
}
