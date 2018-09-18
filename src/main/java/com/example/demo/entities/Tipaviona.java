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
@Table(name = "tipaviona")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tipaviona.findAll", query = "SELECT t FROM Tipaviona t"),
    @NamedQuery(name = "Tipaviona.findBySifraTipa", query = "SELECT t FROM Tipaviona t WHERE t.sifraTipa = :sifraTipa"),
    @NamedQuery(name = "Tipaviona.findByNaziv", query = "SELECT t FROM Tipaviona t WHERE t.naziv = :naziv"),
    @NamedQuery(name = "Tipaviona.findByBrojSedista", query = "SELECT t FROM Tipaviona t WHERE t.brojSedista = :brojSedista")})
public class Tipaviona implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "sifraTipa")
    private Long sifraTipa;
    @Size(max = 50)
    @Column(name = "naziv")
    private String naziv;
    @Column(name = "brojSedista")
    private Integer brojSedista;
    @OneToMany(mappedBy = "tipaviona")
    private Collection<Let> letCollection;

    public Tipaviona() {
    }

    public Tipaviona(Long sifraTipa) {
        this.sifraTipa = sifraTipa;
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
        hash += (sifraTipa != null ? sifraTipa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tipaviona)) {
            return false;
        }
        Tipaviona other = (Tipaviona) object;
        if ((this.sifraTipa == null && other.sifraTipa != null) || (this.sifraTipa != null && !this.sifraTipa.equals(other.sifraTipa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.example.demo.entities.Tipaviona[ sifraTipa=" + sifraTipa + " ]";
    }
    
}
