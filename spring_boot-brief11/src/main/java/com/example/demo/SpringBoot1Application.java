package com.example.demo;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.Entity.Admin;
import com.example.demo.Entity.Employee;
import com.example.demo.Repository.AdminRepository;
import com.example.demo.Repository.EmployeeRepository;

@SpringBootApplication
public class SpringBoot1Application {

	public static void main(String[] args) throws ParseException {
	ApplicationContext ctx=
		SpringApplication.run(SpringBoot1Application.class, args);
	AdminRepository adminRepository=
			ctx.getBean(AdminRepository.class);
	
	adminRepository.save(new Admin("Balde","Seny","seny1.balde@gmail.com",1234));
	
	 
	
	 
	}
	

}