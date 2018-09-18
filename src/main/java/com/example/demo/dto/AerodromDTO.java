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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
public class AerodromDTO{
    private Long sifraAerodroma;
    private String naziv;
    private String skraceniNaziv;
    private GradDTO grad;

    public AerodromDTO() {
    }

    public AerodromDTO(Long sifraAerodroma) {
        this.sifraAerodroma = sifraAerodroma;
    }

    public AerodromDTO(Long sifraAerodroma, String naziv, String skraceniNaziv, GradDTO grad) {
        this.sifraAerodroma = sifraAerodroma;
        this.naziv = naziv;
        this.skraceniNaziv = skraceniNaziv;
        this.grad = grad;
    }

    public Long getSifraAerodroma() {
        return sifraAerodroma;
    }

    public void setSifraAerodroma(Long sifraAerodroma) {
        this.sifraAerodroma = sifraAerodroma;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getSkraceniNaziv() {
        return skraceniNaziv;
    }

    public void setSkraceniNaziv(String skraceniNaziv) {
        this.skraceniNaziv = skraceniNaziv;
    }

    public GradDTO getGrad() {
        return grad;
    }

    public void setGrad(GradDTO grad) {
        this.grad = grad;
    }
    
}
