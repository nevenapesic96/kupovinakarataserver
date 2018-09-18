/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.service;

import com.example.demo.dao.PutnikRepository;
import com.example.demo.dto.PutnikDTO;
import com.example.demo.entities.Putnik;
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
public class PutnikService {
    
    @Autowired
    GenericMapper mapper;
    @Autowired
    PutnikRepository repository;
    
    public List<PutnikDTO> findAll() {
        List<Putnik> putnici = repository.findAll();
        List<PutnikDTO> putniciDTO = new ArrayList<>();
        for (Putnik p : putnici) {
            putniciDTO.add(mapper.putnikToPutnikDTO(p));
        }
        return putniciDTO;
    }
    
    public PutnikDTO dodajNovogPutnika(PutnikDTO putnik) {
        return mapper.putnikToPutnikDTO(repository.save(mapper.putnikDTOToPutnik(putnik)));
    }
    
    public void izbrisiPutnika(String sifraPutnikaS) {
        try{
        Long sifraPutnika=Long.parseLong(sifraPutnikaS);
        repository.deleteById(sifraPutnika);
        }catch(Exception e){
            System.out.println("Paramtar nije dobro unet");
        }
    }
    
    public void izmeniPutnika(PutnikDTO putnik, String sifraPutnikaS){
        Long sifraPutnika=Long.parseLong(sifraPutnikaS);
        String ime=putnik.getIme();
        String prezime=putnik.getPrezime();
        String telefon=putnik.getTelefon();
        String email=putnik.getEmail();
        String brojPasosa=putnik.getBrojPasosa();
        String adresa=putnik.getAdresa();
        repository.izmeni(ime,prezime,telefon,email,brojPasosa,adresa,sifraPutnika);
    }
}
