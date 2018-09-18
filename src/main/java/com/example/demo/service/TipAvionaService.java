/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.service;

import com.example.demo.dao.TipavionaRepository;
import com.example.demo.dto.TipAvionaDTO;
import com.example.demo.entities.Tipaviona;
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
public class TipAvionaService {
    @Autowired
    GenericMapper mapper;
    @Autowired
    TipavionaRepository repository;
    
    public List<TipAvionaDTO> findAll() {
        List<Tipaviona> tipoviA=  repository.findAll();
        List<TipAvionaDTO> tipoviADTO = new ArrayList<>();
        for (Tipaviona t : tipoviA) {
            tipoviADTO.add(mapper.tipavionaToTipavionaDTO(t));
        }
        return tipoviADTO;
    }
}
