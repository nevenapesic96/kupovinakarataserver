/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.service;

import com.example.demo.dao.KartaRepository;
import com.example.demo.dto.KartaDTO;
import com.example.demo.dto.LetDTO;
import com.example.demo.dto.PutnikDTO;
import com.example.demo.mapper.GenericMapper;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author NEVEN
 */
@Service
public class KartaService {
    
    @Autowired
    GenericMapper mapper;
    @Autowired
    KartaRepository repository;
    
    public KartaDTO dodajNovuKartu(String brojSedista, String cenaKarteS,String putnikS,String letS) {
        Double cenaKarte=Double.valueOf(cenaKarteS);
        PutnikDTO putnikDTO=new PutnikDTO(Long.parseLong(putnikS));
        LetDTO letDTO=new LetDTO(Long.parseLong(letS));
        Date datumIzd=new Date();
        KartaDTO karta=new KartaDTO(brojSedista, cenaKarte, datumIzd, datumIzd, putnikDTO, letDTO);
        return mapper.kartaToKartaDTO(repository.save(mapper.kartaDTOToKarta(karta)));
    }
}
