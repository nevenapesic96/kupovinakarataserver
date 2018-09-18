/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.dao;

import com.example.demo.entities.Putnik;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author NEVEN
 */
public interface PutnikRepository extends JpaRepository<Putnik, Long>{
    
    @Transactional
    @Modifying
    @Query("UPDATE Putnik p SET p.ime= ?1,p.prezime= ?2,p.telefon= ?3,p.email= ?4,p.brojPasosa= ?5,p.adresa= ?6 WHERE p.sifraPutnika= ?7")
    public void izmeni(String ime,String prezime,String telefon,String email,String brojPasosa,String adresa, Long sifraPutnika);
}
