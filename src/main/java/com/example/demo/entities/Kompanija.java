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
@Table(name = "kompanija")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Kompanija.findAll", query = "SELECT k FROM Kompanija k"),
    @NamedQuery(name = "Kompanija.findBySifraKompanije", query = "SELECT k FROM Kompanija k WHERE k.sifraKompanije = :sifraKompanije"),
    @NamedQuery(name = "Kompanija.findByNaziv", query = "SELECT k FROM Kompanija k WHERE k.naziv = :naziv")})
public class Kompanija implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "sifraKompanije")
    private Long sifraKompanije;
    @Size(max = 50)
    @Column(name = "naziv")
    private String naziv;
    @OneToMany(mappedBy = "kompanija")
    private Collection<Let> letCollection;

    public Kompanija() {
    }

    public Kompanija(Long sifraKompanije) {
        this.sifraKompanije = sifraKompanije;
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

    @XmlTransient
    public Collection<Let> getLetCollection() {
        return letCollection;
    }

    public void setLetCollection(Collection<Let> letCollection) {
        this.letCollection = letCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sifraKompanije != null ? sifraKompanije.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Kompanija)) {
            return false;
        }
        Kompanija other = (Kompanija) object;
        if ((this.sifraKompanije == null && other.sifraKompanije != null) || (this.sifraKompanije != null && !this.sifraKompanije.equals(other.sifraKompanije))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.example.demo.entities.Kompanija[ sifraKompanije=" + sifraKompanije + " ]";
    }
    
}
