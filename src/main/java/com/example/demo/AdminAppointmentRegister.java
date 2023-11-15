package com.example.demo;
import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="officeappointment")
public class AdminAppointmentRegister {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name="monthid")
	private String monthid;
	@Column(name="monthname")
	private String monthname;
	@Column(name="avilabledate")
	private String avilabledate;
	@Column(name="time")
	private String time;
	
	
	
	
	@Override
	public String toString() {
		return "ApplicationRegister [id=" + id + ", monthis=" + monthid + ", monthname=" + monthname + ", avilabledate=" + avilabledate
				+ ", time=" + time + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMonthid() {
		return monthid;
	}
	public void setMonthid(String monthid) {
		this.monthid = monthid;
	}
	public String getMonthname() {
		return monthname;
	}
	public void setMonthname(String monthname) {
		this.monthname = monthname;
	}
	public String getAvilabledate() {
		return avilabledate;
	}
	public void setAvilabledate(String avilabledate) {
		this.avilabledate = avilabledate;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	
	public AdminAppointmentRegister(int id, String monthid, String monthname, String avilabledate, String time) {
		super();
		this.id = id;
		this.monthid = monthid;
		this.monthname = monthname;
		this.avilabledate = avilabledate;
		this.time = time;
	}
	public AdminAppointmentRegister() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	
	

}
