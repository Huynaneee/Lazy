package com.example.Task311.service;

import com.example.Task311.DTO.UserDTO;
import com.example.Task311.dao.UserDao;
import com.example.Task311.mappers.UserMappers;
import com.example.Task311.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService, UserDetailsService {

    private final UserDao userDao;

    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void addUser(UserDTO user) {
        userDao.addUser(UserMappers.USER_MAPPERS.fromUsers(user));
    }

    @Override
    public void updateUser(UserDTO user) {
        userDao.updateUser(UserMappers.USER_MAPPERS.fromUsers(user));
    }

    @Override
    public void removeUser(int id) {
        userDao.removeUser(id);
    }

    @Override
    public User getUserById(int id) {
        return userDao.getUserById(id);
    }

    @Override
    public List<UserDTO> getListUsers() {
        List<UserDTO> dtoList = new ArrayList<>();
        List<User> userList = userDao.getListUsers();
        for (User user : userList) {
            dtoList.add(UserMappers.USER_MAPPERS.fromDtouser(user));
        }
        return dtoList;
    }

    @Override
    public User getUserByName(String name) {
        return userDao.getUserByName(name);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userDao.loadUserByUsername(username);
    }
}
