package com.example.Task311.service;

import com.example.Task311.DTO.RoleDTO;
import com.example.Task311.dao.RoleDao;
import com.example.Task311.mappers.RoleMappers;
import com.example.Task311.model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {

    private final RoleDao roleDao;

    @Autowired
    public RoleServiceImpl(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    @Override
    public void addRole(RoleDTO role) {
        roleDao.addRole(RoleMappers.ROLE_MAPPERS.fromUserRoleDTO(role));
    }
}
