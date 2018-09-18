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
public class PutnikDTO {
    private Long sifraPutnika;
    private String ime;
    private String prezime;
    private String telefon;
    private String email;
    private String brojPasosa;
    private String adresa;

    public PutnikDTO(Long sifraPutnika){
        this.sifraPutnika = sifraPutnika;
    }
    public PutnikDTO(Long sifraPutnika, String ime, String prezime, String telefon, String email, String brojPasosa, String adresa) {
        this.sifraPutnika = sifraPutnika;
        this.ime = ime;
        this.prezime = prezime;
        this.telefon = telefon;
        this.email = email;
        this.brojPasosa = brojPasosa;
        this.adresa = adresa;
    }

    public PutnikDTO(String ime, String prezime, String telefon, String email, String brojPasosa, String adresa) {
        this.ime = ime;
        this.prezime = prezime;
        this.telefon = telefon;
        this.email = email;
        this.brojPasosa = brojPasosa;
        this.adresa = adresa;
    }

    public PutnikDTO() {
    }


    public Long getSifraPutnika() {
        return sifraPutnika;
    }

    public void setSifraPutnika(Long sifraPutnika) {
        this.sifraPutnika = sifraPutnika;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBrojPasosa() {
        return brojPasosa;
    }

    public void setBrojPasosa(String brojPasosa) {
        this.brojPasosa = brojPasosa;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }
}
