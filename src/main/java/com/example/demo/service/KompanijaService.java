/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.service;

import com.example.demo.dao.KompanijaRepository;
import com.example.demo.dto.KompanijaDTO;
import com.example.demo.entities.Kompanija;
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
public class KompanijaService {
    @Autowired
    GenericMapper mapper;
    @Autowired
    KompanijaRepository repository;
    
    public List<KompanijaDTO> findAll() {
        List<Kompanija> kompanije = repository.findAll();
        List<KompanijaDTO> kompanijeDTO = new ArrayList<>();
        for (Kompanija k : kompanije) {
            kompanijeDTO.add(mapper.kompanijaToKompanijaDTO(k));
        }
        return kompanijeDTO;
    }
}
