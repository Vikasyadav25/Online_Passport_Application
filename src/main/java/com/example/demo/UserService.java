package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class UserService {
@Autowired(required = true)
public UserRepository repository;

public List<UserRegister> getAllUser(){
	java.util.List<UserRegister> records =new java.util.ArrayList<UserRegister>();
	repository.findAll().forEach(records::add);
	return records;
}

// for adding user
public void addUser(UserRegister UserRecord) {
	repository.save(UserRecord);
}


//  public UserRegister updatePassword(UserRegister UserRecord) {
//	int userid=UserRecord.getUserid();
//	UserRegister p=repository.findById(userid).get();
//	p.setPassword(UserRecord.getPassword());
//	repository.save(p);
//	return p;	
//  }


  public UserRegister getRegisterById(int id) {
	  return repository.findById(id).get();
  }



}