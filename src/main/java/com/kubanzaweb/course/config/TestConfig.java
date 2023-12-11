package com.kubanzaweb.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.kubanzaweb.course.entities.User;
import com.kubanzaweb.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		
		User u1 = new User(null, "Albino", "albino@gmail.com", "988885688", "123456");
		User u2 = new User(null, "Alfredo", "albinoalfredo@gmail.com", "977777", "123456");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		
	}
	
	
	
	
}
