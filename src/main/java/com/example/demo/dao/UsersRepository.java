/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.dao;

import com.example.demo.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author NEVEN
 */
public interface UsersRepository extends JpaRepository<Users, Long>{
    
    @Query("SELECT u FROM Users u WHERE u.username= ?1 and u.password= ?2")
    public Users login(String username, String password);
}
