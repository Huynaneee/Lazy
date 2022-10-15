package com.example.Task311.mappers;

import com.example.Task311.DTO.UserDTO;
import com.example.Task311.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {RoleMappers.class})
public interface UserMappers {
    UserMappers USER_MAPPERS = Mappers.getMapper(UserMappers.class);
    UserDTO fromUsers(User user);

}
