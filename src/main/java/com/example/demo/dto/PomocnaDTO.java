/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.dto;

/**
 *
 * @author NEVEN
 */
public class PomocnaDTO {
    private Double cenaKarte;
    private Integer brojSlobodnihMesta;
    private String terminal;
    private Long aerodromPolazni;
    private Long aerodromDolazni;
    private Long kompanija;
    private Long tipAviona;
    private String datumP;
    private String datumD;
    private String vremeP;
    private String vremeD;

    public PomocnaDTO() {
    }

    public PomocnaDTO(Double cenaKarte, Integer brojSlobodnihMesta, String terminal, Long aerodromPolazni, Long aerodromDolazni, Long kompanija, Long tipAviona, String datumP, String datumD, String vremeP, String vremeD) {
        this.cenaKarte = cenaKarte;
        this.brojSlobodnihMesta = brojSlobodnihMesta;
        this.terminal = terminal;
        this.aerodromPolazni = aerodromPolazni;
        this.aerodromDolazni = aerodromDolazni;
        this.kompanija = kompanija;
        this.tipAviona = tipAviona;
        this.datumP = datumP;
        this.datumD = datumD;
        this.vremeP = vremeP;
        this.vremeD = vremeD;
    }

    public String getDatumP() {
        return datumP;
    }

    public void setDatumP(String datumP) {
        this.datumP = datumP;
    }

    public String getDatumD() {
        return datumD;
    }

    public void setDatumD(String datumD) {
        this.datumD = datumD;
    }

    public String getVremeP() {
        return vremeP;
    }

    public void setVremeP(String vremeP) {
        this.vremeP = vremeP;
    }

    public String getVremeD() {
        return vremeD;
    }

    public void setVremeD(String vremeD) {
        this.vremeD = vremeD;
    }

    public Long getTipAviona() {
        return tipAviona;
    }

    public void setTipAviona(Long tipAviona) {
        this.tipAviona = tipAviona;
    }

    public Double getCenaKarte() {
        return cenaKarte;
    }

    public void setCenaKarte(Double cenaKarte) {
        this.cenaKarte = cenaKarte;
    }

    public Integer getBrojSlobodnihMesta() {
        return brojSlobodnihMesta;
    }

    public void setBrojSlobodnihMesta(Integer brojSlobodnihMesta) {
        this.brojSlobodnihMesta = brojSlobodnihMesta;
    }

    public String getTerminal() {
        return terminal;
    }

    public void setTerminal(String terminal) {
        this.terminal = terminal;
    }


    public Long getAerodromPolazni() {
        return aerodromPolazni;
    }

    public void setAerodromPolazni(Long aerodromPolazni) {
        this.aerodromPolazni = aerodromPolazni;
    }

    public Long getAerodromDolazni() {
        return aerodromDolazni;
    }

    public void setAerodromDolazni(Long aerodromDolazni) {
        this.aerodromDolazni = aerodromDolazni;
    }

    public Long getKompanija() {
        return kompanija;
    }

    public void setKompanija(Long kompanija) {
        this.kompanija = kompanija;
    }
    
}
