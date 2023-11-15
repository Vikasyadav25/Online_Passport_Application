package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminAppointmentService {
	@Autowired
	public AdminAppointmentRepository adminoffice;
	
	public void addApplicant(AdminAppointmentRegister adminreg) {
		adminoffice.save(adminreg);
	}
	

}
