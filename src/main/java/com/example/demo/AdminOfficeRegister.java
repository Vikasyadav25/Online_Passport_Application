package com.example.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="officedetails")
public class AdminOfficeRegister {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name="officeid")
	private String officeid;
	@Column(name="officename")
	private String officename;
	@Column(name="juridi")
	private String juridi;
	@Column(name="address")
	private String address;
	@Column(name="phoneno")
	private String phoneno;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOfficeid() {
		return officeid;
	}
	public void setOfficeid(String officeid) {
		this.officeid = officeid;
	}
	public String getOfficename() {
		return officename;
	}
	public void setOfficename(String officename) {
		this.officename = officename;
	}
	public String getJuridi() {
		return juridi;
	}
	public void setJuridi(String juridi) {
		this.juridi = juridi;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	public AdminOfficeRegister(int id, String officeid, String officename, String juridi, String address,
			String phoneno) {
		super();
		this.id = id;
		this.officeid = officeid;
		this.officename = officename;
		this.juridi = juridi;
		this.address = address;
		this.phoneno = phoneno;
	}
	public AdminOfficeRegister() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "AdminOfficeRegister [id=" + id + ", officeid=" + officeid + ", officename=" + officename + ", juridi="
				+ juridi + ", address=" + address + ", phoneno=" + phoneno + "]";
	}
	
	
	
	

}