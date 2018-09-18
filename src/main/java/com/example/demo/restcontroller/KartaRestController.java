/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.restcontroller;

import com.example.demo.dto.KartaDTO;
import com.example.demo.service.KartaService;
import com.example.demo.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
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
@RequestMapping("/karta")
public class KartaRestController {
    @Autowired
    KartaService service;
    @Autowired
    MailService mailService;
    
    @GetMapping("/dodaj")
    public @ResponseBody
    Object dodajKartu(@RequestParam(value = "brojSedista") String brojSedista,@RequestParam(value = "cenaKarte") String cenaKarte,@RequestParam(value = "putnik") String putnik,@RequestParam(value = "let") String let) {
        try {
            KartaDTO kartaDTO=service.dodajNovuKartu(brojSedista,cenaKarte,putnik,let);
            mailService.posaljiMail(kartaDTO);
            return ResponseEntity.status(HttpStatus.OK).body(kartaDTO);
        } catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Greska prilikom cuvanja karte.");

        }
    }
}
