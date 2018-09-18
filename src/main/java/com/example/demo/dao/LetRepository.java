/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.dao;

import com.example.demo.entities.Let;
import java.util.Date;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author NEVEN
 */
public interface LetRepository  extends JpaRepository<Let, Long>{
    
    @Query("SELECT l FROM Let l WHERE l.aerodromPolazni.sifraAerodroma= ?1 AND l.aerodromDolazni.sifraAerodroma= ?2 AND l.datumPolaska= ?3")
    public List<Let> vratiLetZaAerodromeIDatum(Long polazni,Long dolazni,Date datum);
}
