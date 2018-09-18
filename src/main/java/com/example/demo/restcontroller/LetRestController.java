/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.restcontroller;

import com.example.demo.dto.LetDTO;
import com.example.demo.dto.PomocnaDTO;
import com.example.demo.service.LetService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author NEVEN
 */
@RestController
@CrossOrigin
@RequestMapping("/let")
public class LetRestController {
    @Autowired
    LetService service;
    
    @GetMapping("/sve")
    public @ResponseBody
    Object vratiSveLetove() {
        List<LetDTO> sviLetovi = service.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(sviLetovi);
    }
    
    @RequestMapping(value = "/izbrisi/{sifraLeta}", method = RequestMethod.DELETE)
    public void izbrisiLet(@PathVariable String sifraLeta) {
        
        service.izbrisiLet(sifraLeta);
    }
    
    @GetMapping("/filtrirane")
    public @ResponseBody
    Object vratiSveAerodrome(@RequestParam(value = "polazni") String polazni,@RequestParam(value = "dolazni") String dolazni,@RequestParam(value = "datum") String datum) {
        List<LetDTO> sviAerodromi = service.vratiLetZaAerodromeIDatum(polazni,dolazni,datum);
        return ResponseEntity.status(HttpStatus.OK).body(sviAerodromi);
    }
    
    @RequestMapping(value = "/dodaj", method = RequestMethod.POST)
    void dodajLet(@RequestBody PomocnaDTO pomocna) {
        service.dodajNoviLet(pomocna);
        
    }
}
