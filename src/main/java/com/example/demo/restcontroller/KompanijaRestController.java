/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.restcontroller;

import com.example.demo.dto.KompanijaDTO;
import com.example.demo.service.KompanijaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author NEVEN
 */
@RestController
@CrossOrigin
@RequestMapping("/kompanija")
public class KompanijaRestController {
    @Autowired
    KompanijaService service;
    
    @GetMapping("/sve")
    public @ResponseBody
    Object vratiSveTIpovaAviona() {
        List<KompanijaDTO> kompanijeDTO = service.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(kompanijeDTO);
    }
}
