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
@Table(name = "grad")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Grad.findAll", query = "SELECT g FROM Grad g"),
    @NamedQuery(name = "Grad.findBySifraGrada", query = "SELECT g FROM Grad g WHERE g.sifraGrada = :sifraGrada"),
    @NamedQuery(name = "Grad.findByNaziv", query = "SELECT g FROM Grad g WHERE g.naziv = :naziv"),
    @NamedQuery(name = "Grad.findByDrzava", query = "SELECT g FROM Grad g WHERE g.drzava = :drzava")})
public class Grad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "sifraGrada")
    private Long sifraGrada;
    @Size(max = 50)
    @Column(name = "naziv")
    private String naziv;
    @Size(max = 50)
    @Column(name = "drzava")
    private String drzava;
    @OneToMany(mappedBy = "grad")
    private Collection<Aerodrom> aerodromCollection;

    public Grad() {
    }

    public Grad(Long sifraGrada) {
        this.sifraGrada = sifraGrada;
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

    @XmlTransient
    public Collection<Aerodrom> getAerodromCollection() {
        return aerodromCollection;
    }

    public void setAerodromCollection(Collection<Aerodrom> aerodromCollection) {
        this.aerodromCollection = aerodromCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sifraGrada != null ? sifraGrada.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Grad)) {
            return false;
        }
        Grad other = (Grad) object;
        if ((this.sifraGrada == null && other.sifraGrada != null) || (this.sifraGrada != null && !this.sifraGrada.equals(other.sifraGrada))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.example.demo.entities.Grad[ sifraGrada=" + sifraGrada + " ]";
    }
    
}
