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
public class KompanijaDTO {
    private Long sifraKompanije;
    private String naziv;

    public KompanijaDTO(Long sifraKompanije, String naziv) {
        this.sifraKompanije = sifraKompanije;
        this.naziv = naziv;
    }
    public KompanijaDTO(Long sifraKompanije) {
        this.sifraKompanije = sifraKompanije;
    }

    public KompanijaDTO() {
    }


    public Long getSifraKompanije() {
        return sifraKompanije;
    }

    public void setSifraKompanije(Long sifraKompanije) {
        this.sifraKompanije = sifraKompanije;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

}
