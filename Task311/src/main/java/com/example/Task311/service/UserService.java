package com.example.Task311.service;

import com.example.Task311.DTO.UserDTO;
import com.example.Task311.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;


import java.util.List;

public interface UserService {
    void addUser(UserDTO user);
    void updateUser(UserDTO user);
    void removeUser(int id);
    User getUserById(int id);
    List<UserDTO> getListUsers();

    User getUserByName(String name);


}
