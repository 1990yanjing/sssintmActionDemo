package com.wangyan.ssmWebAction.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.wangyan.ssmWebAction.mapper.RoleMapper;
import com.wangyan.ssmWebAction.model.Role;
import com.wangyan.ssmWebAction.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	public RoleMapper roleMapper = null;

	@Transactional(propagation = Propagation.REQUIRES_NEW, isolation = Isolation.READ_COMMITTED)
	public int insertRole(Role role) {
		
		return roleMapper.insert(role);
	}

	@Override
	public Role getRoleById(Integer id) {

		return roleMapper.selectByPrimaryKey(id);
	}
}
