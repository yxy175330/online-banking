package com.bms.dao;

import org.springframework.data.repository.CrudRepository;

import com.bms.domain.security.Role;

public interface RoleDao extends CrudRepository<Role, Integer> {
    
    Role findByName(String name);
}
