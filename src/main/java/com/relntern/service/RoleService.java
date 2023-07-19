package com.relntern.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.relntern.model.Role;
import com.relntern.repository.RoleRepository;

@Service
public class RoleService {
	@Autowired
	private RoleRepository roleRepository;
	
	
	public Role createNewRole(Role role) {
	 return roleRepository.save(role);
	}
}
