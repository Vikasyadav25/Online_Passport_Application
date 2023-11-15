package com.example.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="admincredentials")
public class AdminCredentials {
	@Id
	@Column(name="userid")
	private int userid;
	@Column(name="password")
	private String password;
	public AdminCredentials() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AdminCredentials(int userid, String password) {
		super();
		this.userid = userid;
		this.password = password;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
