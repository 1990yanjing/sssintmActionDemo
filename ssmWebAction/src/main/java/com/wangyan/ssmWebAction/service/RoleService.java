package com.wangyan.ssmWebAction.service;

import com.wangyan.ssmWebAction.model.Role;

public interface RoleService {
	
	public int insertRole(Role role);
	
	Role getRoleById(Integer id);
}
