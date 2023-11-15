package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ApplicationRegService {
	@Autowired(required = true)
	
	public ApplicationRepository applicationrepository;
	
	
	public void addApplicant(ApplicationRegister Applicant) {
		applicationrepository.save(Applicant);
	}


	public ApplicationRegister getApplicantByEmail(String email) {
		// TODO Auto-generated method stub
//		return null;
//		return repository.findById(id).get();
		return applicationrepository.findByEmail(email);
	}


}
