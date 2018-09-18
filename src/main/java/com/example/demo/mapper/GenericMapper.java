/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.mapper;

import com.example.demo.dto.AerodromDTO;
import com.example.demo.dto.KartaDTO;
import com.example.demo.dto.KompanijaDTO;
import com.example.demo.dto.LetDTO;
import com.example.demo.dto.PutnikDTO;
import com.example.demo.dto.TipAvionaDTO;
import com.example.demo.dto.UsersDTO;
import com.example.demo.entities.Aerodrom;
import com.example.demo.entities.Karta;
import com.example.demo.entities.Kompanija;
import com.example.demo.entities.Let;
import com.example.demo.entities.Putnik;
import com.example.demo.entities.Tipaviona;
import com.example.demo.entities.Users;
import org.mapstruct.Mapper;

/**
 *
 * @author NEVEN
 */
@Mapper(componentModel = "spring")
public interface GenericMapper {
    
    UsersDTO usersToUsersDTO(Users user);
    Users usersDTOToUsers(UsersDTO korisnickiNalogDTO);
    
    AerodromDTO aerodromToAerodromDTO(Aerodrom aerodrom);
    Aerodrom aerodromDTOToAerodrom(AerodromDTO aerodromDTO);
    
    LetDTO letToLetDTO(Let let);
    Let letDTOToLet(LetDTO letDTO);
    
    PutnikDTO putnikToPutnikDTO(Putnik putnik);
    Putnik putnikDTOToPutnik(PutnikDTO putnikDTO);
    
    TipAvionaDTO tipavionaToTipavionaDTO(Tipaviona tipaviona);
    Tipaviona tipavionaDTOToTipaviona(TipAvionaDTO tipavionaDTO);
    
    KompanijaDTO kompanijaToKompanijaDTO(Kompanija kompanija);
    Kompanija kompanijaDTOToKompanija(KompanijaDTO kompanijaDTO);
    
    KartaDTO kartaToKartaDTO(Karta karta);
    Karta kartaDTOToKarta(KartaDTO kartaDTO);
}
