/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.service;

import com.example.demo.dao.PutnikRepository;
import com.example.demo.dto.KartaDTO;
import com.example.demo.dto.MailDTO;
import com.example.demo.dto.PutnikDTO;
import com.example.demo.entities.Putnik;
import com.example.demo.mapper.GenericMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

/**
 *
 * @author NEVEN
 */
@Service
public class MailService {
    
    @Autowired
    GenericMapper mapper;
    @Autowired
    private JavaMailSender javaMailSender;
    @Autowired
    PutnikRepository repository;
        
    public void posaljiMail(KartaDTO kartaDTO){
        PutnikDTO putnikDTO=mapper.putnikToPutnikDTO(repository.getOne(kartaDTO.getPutnik().getSifraPutnika()));
        String text="Uplatnica: \n\n"
                + "Uplatilac: "+putnikDTO.getIme()+" "+putnikDTO.getPrezime()+"\n\t"
                +putnikDTO.getAdresa()+"\n\n"
                +"Iznos: "+kartaDTO.getCenaKarte()+"\n\n"
                +"Racun primaoca: 333-3333333-33\n\n"
                +"Poziv na broj: "+kartaDTO.getSifraKarte()+"sp"+putnikDTO.getSifraPutnika();
        SimpleMailMessage message = new SimpleMailMessage();
        message.setSubject("Online kupovina avionske karte-uputstvo za uplatu");
        message.setText(text);
        message.setTo(putnikDTO.getEmail());
        
        System.out.println("Mail: \n"+message.getText());
        javaMailSender.send(message);
    }
}
