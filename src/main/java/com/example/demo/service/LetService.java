/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.service;

import com.example.demo.dao.LetRepository;
import com.example.demo.dto.AerodromDTO;
import com.example.demo.dto.KompanijaDTO;
import com.example.demo.dto.LetDTO;
import com.example.demo.dto.PomocnaDTO;
import com.example.demo.dto.TipAvionaDTO;
import com.example.demo.entities.Let;
import com.example.demo.mapper.GenericMapper;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author NEVEN
 */
@Service
public class LetService {
    
    @Autowired
    GenericMapper mapper;
    @Autowired
    LetRepository repository;
    
    public List<LetDTO> findAll() {
        List<Let> letovi = repository.findAll();
        List<LetDTO> letoviDTO = new ArrayList<>();
        for (Let l : letovi) {
            letoviDTO.add(mapper.letToLetDTO(l));
        }
        return letoviDTO;
    }
    
    public void izbrisiLet(String sifraLetaS) {
        try{
        Long sifraLeta=Long.parseLong(sifraLetaS);
        repository.deleteById(sifraLeta);
        }catch(Exception e){
            System.out.println("Paramtar nije dobro unet");
        }
    }
    
    public List<LetDTO> vratiLetZaAerodromeIDatum(String polazniS,String dolazniS,String datumS) {
        Long polazni=Long.parseLong(polazniS);
        Long dolazni=Long.parseLong(dolazniS);
        Date datum;
        try{
        datum=(new SimpleDateFormat("yyyy-MM-dd")).parse(datumS);
        }catch(Exception e){
            datum=new Date();
        }
        
        List<Let> letovi = repository.vratiLetZaAerodromeIDatum(polazni,dolazni,datum);
        List<LetDTO> letoviDTO = new ArrayList<>();
        for (Let l : letovi) {
            letoviDTO.add(mapper.letToLetDTO(l));
        }
        return letoviDTO;
    }
    
    public void dodajNoviLet(PomocnaDTO pomocna) {
        Date datumP,datumD,vremeP,vremeD;
        try{
        datumP=(new SimpleDateFormat("yyyy-MM-dd")).parse(pomocna.getDatumP());
        datumD=(new SimpleDateFormat("yyyy-MM-dd")).parse(pomocna.getDatumD());
        vremeP=(new SimpleDateFormat("HH:mm")).parse(pomocna.getVremeP());
        vremeD=(new SimpleDateFormat("HH:mm")).parse(pomocna.getVremeD());
        }catch(Exception e){
            datumP=new Date();
            datumD=new Date();
            vremeP=new Date();
            vremeD=new Date();
        }
        
        AerodromDTO aerodromPolazni=new AerodromDTO(pomocna.getAerodromPolazni());
        AerodromDTO aerodromDolazni=new AerodromDTO(pomocna.getAerodromDolazni());
        KompanijaDTO kompanija=new KompanijaDTO(pomocna.getKompanija());
        TipAvionaDTO tipA=new TipAvionaDTO(pomocna.getTipAviona());
        
        LetDTO let=new LetDTO(datumP, vremeP, datumD, vremeD, pomocna.getBrojSlobodnihMesta(), Integer.parseInt(pomocna.getTerminal()), aerodromPolazni, aerodromDolazni, kompanija, tipA, pomocna.getCenaKarte());
        repository.save(mapper.letDTOToLet(let));
    }
}
