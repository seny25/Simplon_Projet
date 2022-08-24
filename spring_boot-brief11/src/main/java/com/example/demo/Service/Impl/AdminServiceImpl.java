package com.example.demo.Service.Impl;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Admin;
import com.example.demo.Repository.AdminRepository;
import com.example.demo.Repository.EmployeeRepository;
import com.example.demo.Service.AdminService;
@Service
public class AdminServiceImpl implements AdminService{

	@Autowired
	private AdminRepository adminRepository;
	
	
	
	@Override
	public void saveAdmin(Admin admin) {
		
 
      this.adminRepository.save(admin);
		
	}

}
