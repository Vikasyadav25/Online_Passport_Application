package com.example.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="usercredentials")

public class Usercredentials {
	@Id
	@Column(name="userid")
	private int userid;
	@Column(name="usertype")
	private String usertype;
	@Column(name="loginstatus")
	private String loginstatus;
	@Column (name="password")
	private String password;
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsertype() {
		return usertype;
	}
	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}
	public String getLoginstatus() {
		return loginstatus;
	}
	public void setLoginstatus(String loginstatus) {
		this.loginstatus = loginstatus;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Usercredentials(int userid, String usertype, String loginstatus, String password) {
		super();
		this.userid = userid;
		this.usertype = usertype;
		this.loginstatus = loginstatus;
		this.password = password;
	}
	public Usercredentials() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
