/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.service;

import com.example.demo.dao.AerodromRepository;
import com.example.demo.dto.AerodromDTO;
import com.example.demo.entities.Aerodrom;
import com.example.demo.mapper.GenericMapper;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author NEVEN
 */
@Service
public class AerodromService {
    
    @Autowired
    GenericMapper mapper;
    @Autowired
    AerodromRepository repository;
    
    public List<AerodromDTO> findAll() {
        List<Aerodrom> aerodromi = repository.findAll();
        List<AerodromDTO> aerodromiDTO = new ArrayList<>();
        for (Aerodrom a : aerodromi) {
            aerodromiDTO.add(mapper.aerodromToAerodromDTO(a));
        }
        return aerodromiDTO;
    }
}
