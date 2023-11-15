package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminCredentialService {
	@Autowired 
	AdminCredentialsRepository admin;
	
	
	public AdminCredentials getAdmin(int id)
	{
		return admin.findById(id).get();
	}

}
