package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminOfficeService {
	@Autowired
	public AdminOfficeRepository adminoffice1;

	public void addApplicant(AdminOfficeRegister adminreg) {
		adminoffice1.save(adminreg);
	}
}
