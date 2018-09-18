/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.dto;

import java.util.Date;


/**
 *
 * @author NEVEN
 */
public class LetDTO{

    private Long sifraLeta;
    private Date datumPolaska;
    private Date vremePolaska;
    private Date datumDolaska;
    private Date vremeDolaska;
    private Integer brojSlobodnihMesta;
    private Integer terminal;
    private AerodromDTO aerodromPolazni;
    private AerodromDTO aerodromDolazni;
    private KompanijaDTO kompanija;
    private TipAvionaDTO tipaviona;
    private Double cenaKarte;

    public LetDTO(Long sifraLeta){
        this.sifraLeta = sifraLeta;
    }
    public LetDTO(Long sifraLeta, Date datumPolaska, Date vremePolaska, Date datumDolaska, Date vremeDolaska, Integer brojSlobodnihMesta, Integer terminal, AerodromDTO aerodromPolazni, AerodromDTO aerodromDolazni, KompanijaDTO kompanija, TipAvionaDTO tipaviona,Double cenaKarte) {
        this.sifraLeta = sifraLeta;
        this.datumPolaska = datumPolaska;
        this.vremePolaska = vremePolaska;
        this.datumDolaska = datumDolaska;
        this.vremeDolaska = vremeDolaska;
        this.brojSlobodnihMesta = brojSlobodnihMesta;
        this.terminal = terminal;
        this.aerodromPolazni = aerodromPolazni;
        this.aerodromDolazni = aerodromDolazni;
        this.kompanija = kompanija;
        this.tipaviona = tipaviona;
        this.cenaKarte=cenaKarte;
    }
    
    public LetDTO(Date datumPolaska, Date vremePolaska, Date datumDolaska, Date vremeDolaska, Integer brojSlobodnihMesta, Integer terminal, AerodromDTO aerodromPolazni, AerodromDTO aerodromDolazni, KompanijaDTO kompanija, TipAvionaDTO tipaviona,Double cenaKarte) {
        this.datumPolaska = datumPolaska;
        this.vremePolaska = vremePolaska;
        this.datumDolaska = datumDolaska;
        this.vremeDolaska = vremeDolaska;
        this.brojSlobodnihMesta = brojSlobodnihMesta;
        this.terminal = terminal;
        this.aerodromPolazni = aerodromPolazni;
        this.aerodromDolazni = aerodromDolazni;
        this.kompanija = kompanija;
        this.tipaviona = tipaviona;
        this.cenaKarte=cenaKarte;
    }

    public Double getCenaKarte() {
        return cenaKarte;
    }

    public void setCenaKarte(Double cenaKarte) {
        this.cenaKarte = cenaKarte;
    }

    public LetDTO() {
    }


    public Long getSifraLeta() {
        return sifraLeta;
    }

    public void setSifraLeta(Long sifraLeta) {
        this.sifraLeta = sifraLeta;
    }

    public Date getDatumPolaska() {
        return datumPolaska;
    }

    public void setDatumPolaska(Date datumPolaska) {
        this.datumPolaska = datumPolaska;
    }

    public Date getVremePolaska() {
        return vremePolaska;
    }

    public void setVremePolaska(Date vremePolaska) {
        this.vremePolaska = vremePolaska;
    }

    public Date getDatumDolaska() {
        return datumDolaska;
    }

    public void setDatumDolaska(Date datumDolaska) {
        this.datumDolaska = datumDolaska;
    }

    public Date getVremeDolaska() {
        return vremeDolaska;
    }

    public void setVremeDolaska(Date vremeDolaska) {
        this.vremeDolaska = vremeDolaska;
    }

    public Integer getBrojSlobodnihMesta() {
        return brojSlobodnihMesta;
    }

    public void setBrojSlobodnihMesta(Integer brojSlobodnihMesta) {
        this.brojSlobodnihMesta = brojSlobodnihMesta;
    }

    public Integer getTerminal() {
        return terminal;
    }

    public void setTerminal(Integer terminal) {
        this.terminal = terminal;
    }

    public AerodromDTO getAerodromPolazni() {
        return aerodromPolazni;
    }

    public void setAerodromPolazni(AerodromDTO aerodromPolazni) {
        this.aerodromPolazni = aerodromPolazni;
    }

    public AerodromDTO getAerodromDolazni() {
        return aerodromDolazni;
    }

    public void setAerodromDolazni(AerodromDTO aerodromDolazni) {
        this.aerodromDolazni = aerodromDolazni;
    }

    public KompanijaDTO getKompanija() {
        return kompanija;
    }

    public void setKompanija(KompanijaDTO kompanija) {
        this.kompanija = kompanija;
    }

    public TipAvionaDTO getTipaviona() {
        return tipaviona;
    }

    public void setTipaviona(TipAvionaDTO tipaviona) {
        this.tipaviona = tipaviona;
    }

}
