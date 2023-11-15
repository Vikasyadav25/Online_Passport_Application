package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserCredentialService {

	@Autowired
	UserCredentialRepo usr;
	
	
	public Usercredentials getUser(int id)
	{
		return usr.findById(id).get();
	}



}
