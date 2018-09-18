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
public class TipAvionaDTO {
    private Long sifraTipa;
    private String naziv;
    private Integer brojSedista;

    public TipAvionaDTO(Long sifraTipa, String naziv, Integer brojSedista) {
        this.sifraTipa = sifraTipa;
        this.naziv = naziv;
        this.brojSedista = brojSedista;
    }
    public TipAvionaDTO(Long sifraTipa) {
        this.sifraTipa = sifraTipa;
    }

    public TipAvionaDTO() {
    }


    public Long getSifraTipa() {
        return sifraTipa;
    }

    public void setSifraTipa(Long sifraTipa) {
        this.sifraTipa = sifraTipa;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public Integer getBrojSedista() {
        return brojSedista;
    }

    public void setBrojSedista(Integer brojSedista) {
        this.brojSedista = brojSedista;
    }
}
