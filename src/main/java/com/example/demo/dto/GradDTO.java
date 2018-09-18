/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.dto;

import com.example.demo.entities.*;
import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author NEVEN
 */

public class GradDTO{
    private Long sifraGrada;
    private String naziv;
    private String drzava;

    public GradDTO() {
    }

    public GradDTO(Long sifraGrada) {
        this.sifraGrada = sifraGrada;
    }

    public GradDTO(Long sifraGrada, String naziv, String drzava) {
        this.sifraGrada = sifraGrada;
        this.naziv = naziv;
        this.drzava = drzava;
    }

    public Long getSifraGrada() {
        return sifraGrada;
    }

    public void setSifraGrada(Long sifraGrada) {
        this.sifraGrada = sifraGrada;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getDrzava() {
        return drzava;
    }

    public void setDrzava(String drzava) {
        this.drzava = drzava;
    }

}
