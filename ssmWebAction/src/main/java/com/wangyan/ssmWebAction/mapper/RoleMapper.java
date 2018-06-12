package com.wangyan.ssmWebAction.mapper;

import org.springframework.stereotype.Repository;
import com.wangyan.ssmWebAction.model.Role;

@Repository
public interface RoleMapper {

    int insert(Role record);

    Role selectByPrimaryKey(Integer id);
}