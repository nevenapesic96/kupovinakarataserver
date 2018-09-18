/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.entities;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author NEVEN
 */
@Entity
@Table(name = "karta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Karta.findAll", query = "SELECT k FROM Karta k"),
    @NamedQuery(name = "Karta.findBySifraKarte", query = "SELECT k FROM Karta k WHERE k.sifraKarte = :sifraKarte"),
    @NamedQuery(name = "Karta.findByBrojSedista", query = "SELECT k FROM Karta k WHERE k.brojSedista = :brojSedista"),
    @NamedQuery(name = "Karta.findByCenaKarte", query = "SELECT k FROM Karta k WHERE k.cenaKarte = :cenaKarte"),
    @NamedQuery(name = "Karta.findByDatumIzdavanja", query = "SELECT k FROM Karta k WHERE k.datumIzdavanja = :datumIzdavanja"),
    @NamedQuery(name = "Karta.findByVremeIzdavanja", query = "SELECT k FROM Karta k WHERE k.vremeIzdavanja = :vremeIzdavanja")})
public class Karta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "sifraKarte")
    private Long sifraKarte;
    @Size(max = 10)
    @Column(name = "brojSedista")
    private String brojSedista;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "cenaKarte")
    private Double cenaKarte;
    @Column(name = "datumIzdavanja")
    @Temporal(TemporalType.DATE)
    private Date datumIzdavanja;
    @Column(name = "vremeIzdavanja")
    @Temporal(TemporalType.TIME)
    private Date vremeIzdavanja;
    @JoinColumn(name = "putnik", referencedColumnName = "sifraPutnika")
    @ManyToOne
    private Putnik putnik;
    @JoinColumn(name = "let", referencedColumnName = "sifraLeta")
    @ManyToOne
    private Let let;

    public Karta() {
    }

    public Karta(Long sifraKarte) {
        this.sifraKarte = sifraKarte;
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

    public Putnik getPutnik() {
        return putnik;
    }

    public void setPutnik(Putnik putnik) {
        this.putnik = putnik;
    }

    public Let getLet() {
        return let;
    }

    public void setLet(Let let) {
        this.let = let;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sifraKarte != null ? sifraKarte.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Karta)) {
            return false;
        }
        Karta other = (Karta) object;
        if ((this.sifraKarte == null && other.sifraKarte != null) || (this.sifraKarte != null && !this.sifraKarte.equals(other.sifraKarte))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.example.demo.entities.Karta[ sifraKarte=" + sifraKarte + " ]";
    }
    
}
