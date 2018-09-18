/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.service;

import com.example.demo.dao.UsersRepository;
import com.example.demo.dto.UsersDTO;
import com.example.demo.entities.Users;
import com.example.demo.mapper.GenericMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author NEVEN
 */
@Service
public class UsersService {

    @Autowired
    private UsersRepository userDAO;
    @Autowired
    GenericMapper mapper;

//    public UsersDTO login(String username, String password) {
//        return mapper.usersToUsersDTO(userDAO.login(username, password));
//    }

    public Object authenticate(UsersDTO user) throws Exception {
        Users userDB = userDAO.login(user.getUsername(), user.getPassword());
        if (userDB == null) {
            throw new Exception("Unknown user.");
        }
        return userDB;
    }
}
