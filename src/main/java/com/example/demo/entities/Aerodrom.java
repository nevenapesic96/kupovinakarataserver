/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.entities;

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
@Entity
@Table(name = "aerodrom")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Aerodrom.findAll", query = "SELECT a FROM Aerodrom a"),
    @NamedQuery(name = "Aerodrom.findBySifraAerodroma", query = "SELECT a FROM Aerodrom a WHERE a.sifraAerodroma = :sifraAerodroma"),
    @NamedQuery(name = "Aerodrom.findByNaziv", query = "SELECT a FROM Aerodrom a WHERE a.naziv = :naziv"),
    @NamedQuery(name = "Aerodrom.findBySkraceniNaziv", query = "SELECT a FROM Aerodrom a WHERE a.skraceniNaziv = :skraceniNaziv")})
public class Aerodrom implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "sifraAerodroma")
    private Long sifraAerodroma;
    @Size(max = 50)
    @Column(name = "naziv")
    private String naziv;
    @Size(max = 50)
    @Column(name = "skraceniNaziv")
    private String skraceniNaziv;
    @JoinColumn(name = "grad", referencedColumnName = "sifraGrada")
    @ManyToOne
    private Grad grad;
    @OneToMany(mappedBy = "aerodromPolazni")
    private Collection<Let> letCollection;
    @OneToMany(mappedBy = "aerodromDolazni")
    private Collection<Let> letCollection1;

    public Aerodrom() {
    }

    public Aerodrom(Long sifraAerodroma) {
        this.sifraAerodroma = sifraAerodroma;
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

    public Grad getGrad() {
        return grad;
    }

    public void setGrad(Grad grad) {
        this.grad = grad;
    }

    @XmlTransient
    public Collection<Let> getLetCollection() {
        return letCollection;
    }

    public void setLetCollection(Collection<Let> letCollection) {
        this.letCollection = letCollection;
    }

    @XmlTransient
    public Collection<Let> getLetCollection1() {
        return letCollection1;
    }

    public void setLetCollection1(Collection<Let> letCollection1) {
        this.letCollection1 = letCollection1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sifraAerodroma != null ? sifraAerodroma.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Aerodrom)) {
            return false;
        }
        Aerodrom other = (Aerodrom) object;
        if ((this.sifraAerodroma == null && other.sifraAerodroma != null) || (this.sifraAerodroma != null && !this.sifraAerodroma.equals(other.sifraAerodroma))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.example.demo.entities.Aerodrom[ sifraAerodroma=" + sifraAerodroma + " ]";
    }
    
}
