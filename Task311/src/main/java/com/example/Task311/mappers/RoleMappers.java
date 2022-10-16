package com.example.Task311.mappers;

import com.example.Task311.DTO.RoleDTO;
import com.example.Task311.model.Role;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {UserMappers.class})
public interface RoleMappers {
    RoleMappers ROLE_MAPPERS = Mappers.getMapper(RoleMappers.class);
    RoleDTO fromUserRole(Role role);
    @InheritInverseConfiguration
    Role fromUserRoleDTO (RoleDTO roleDTO);
}
