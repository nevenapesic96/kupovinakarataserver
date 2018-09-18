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
public class KartaDTO {
    private Long sifraKarte;
    private String brojSedista;
    private Double cenaKarte;
    private Date datumIzdavanja;
    private Date vremeIzdavanja;
    private PutnikDTO putnik;
    private LetDTO let;

    public KartaDTO(Long sifraKarte, String brojSedista, Double cenaKarte, Date datumIzdavanja, Date vremeIzdavanja, PutnikDTO putnik, LetDTO let) {
        this.sifraKarte = sifraKarte;
        this.brojSedista = brojSedista;
        this.cenaKarte = cenaKarte;
        this.datumIzdavanja = datumIzdavanja;
        this.vremeIzdavanja = vremeIzdavanja;
        this.putnik = putnik;
        this.let = let;
    }

    public KartaDTO(String brojSedista, Double cenaKarte, Date datumIzdavanja, Date vremeIzdavanja, PutnikDTO putnik, LetDTO let) {
        this.brojSedista = brojSedista;
        this.cenaKarte = cenaKarte;
        this.datumIzdavanja = datumIzdavanja;
        this.vremeIzdavanja = vremeIzdavanja;
        this.putnik = putnik;
        this.let = let;
    }
    public KartaDTO() {
    }


    public Long getSifraKarte() {
        return sifraKarte;
    }

    public void setSifraKarte(Long sifraKarte) {
        this.sifraKarte = sifraKarte;
    }

    public String getBrojSedista() {
        return brojSedista;
    }

    public void setBrojSedista(String brojSedista) {
        this.brojSedista = brojSedista;
    }

    public Double getCenaKarte() {
        return cenaKarte;
    }

    public void setCenaKarte(Double cenaKarte) {
        this.cenaKarte = cenaKarte;
    }

    public Date getDatumIzdavanja() {
        return datumIzdavanja;
    }

    public void setDatumIzdavanja(Date datumIzdavanja) {
        this.datumIzdavanja = datumIzdavanja;
    }

    public Date getVremeIzdavanja() {
        return vremeIzdavanja;
    }

    public void setVremeIzdavanja(Date vremeIzdavanja) {
        this.vremeIzdavanja = vremeIzdavanja;
    }

    public PutnikDTO getPutnik() {
        return putnik;
    }

    public void setPutnik(PutnikDTO putnik) {
        this.putnik = putnik;
    }

    public LetDTO getLet() {
        return let;
    }

    public void setLet(LetDTO let) {
        this.let = let;
    }

}
