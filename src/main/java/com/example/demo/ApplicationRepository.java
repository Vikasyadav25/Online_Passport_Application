package com.example.demo;

import org.springframework.data.repository.CrudRepository;

public interface ApplicationRepository extends CrudRepository<ApplicationRegister, Integer> {
	ApplicationRegister findByEmail(String email);

}
