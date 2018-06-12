package com.wangyan.ssmWebAction.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wangyan.ssmWebAction.model.Role;
import com.wangyan.ssmWebAction.service.RoleService;

@Service
public class RoleController {

	@Autowired
	private RoleService roleService = null;
	
	public Role getRole() {
		
		Role role = roleService.getRoleById(4);
		System.out.println(role.getRolename() + role.getNote());
		
		return role;
	}
}
