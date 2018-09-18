/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.restcontroller;

import com.example.demo.dto.PutnikDTO;
import com.example.demo.service.PutnikService;
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
@RequestMapping("/putnik")
public class PutnikRestController {
    @Autowired
    PutnikService service;
    
    @GetMapping("/sve")
    public @ResponseBody
    Object vratiSvePutnike() {
        List<PutnikDTO> sviPutnici = service.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(sviPutnici);
    }
    
    @RequestMapping(value = "/dodaj", method = RequestMethod.POST)
    public @ResponseBody
    Object dodajPutnika(@RequestBody PutnikDTO putnik) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.dodajNovogPutnika(putnik));
        } catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Greska prilikom cuvanja putnika.");

        }
    }
    
    @RequestMapping(value = "/izbrisi/{sifraPutnika}", method = RequestMethod.DELETE)
    public void izbrisiPutnika(@PathVariable String sifraPutnika) {
        
        service.izbrisiPutnika(sifraPutnika);
    }
    
    @RequestMapping(value = "/izmeni/{sifraPutnika}", method = RequestMethod.PUT)
    public void izmeniPutnika(@RequestBody PutnikDTO putnik, @PathVariable String sifraPutnika) {
        
        service.izmeniPutnika(putnik,sifraPutnika);
    }
}
