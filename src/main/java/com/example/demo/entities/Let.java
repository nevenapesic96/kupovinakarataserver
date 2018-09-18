/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.entities;

import java.io.Serializable;
import java.util.Collection;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author NEVEN
 */
@Entity
@Table(name = "let")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Let.findAll", query = "SELECT l FROM Let l"),
    @NamedQuery(name = "Let.findBySifraLeta", query = "SELECT l FROM Let l WHERE l.sifraLeta = :sifraLeta"),
    @NamedQuery(name = "Let.findByDatumPolaska", query = "SELECT l FROM Let l WHERE l.datumPolaska = :datumPolaska"),
    @NamedQuery(name = "Let.findByVremePolaska", query = "SELECT l FROM Let l WHERE l.vremePolaska = :vremePolaska"),
    @NamedQuery(name = "Let.findByDatumDolaska", query = "SELECT l FROM Let l WHERE l.datumDolaska = :datumDolaska"),
    @NamedQuery(name = "Let.findByVremeDolaska", query = "SELECT l FROM Let l WHERE l.vremeDolaska = :vremeDolaska"),
    @NamedQuery(name = "Let.findByBrojSlobodnihMesta", query = "SELECT l FROM Let l WHERE l.brojSlobodnihMesta = :brojSlobodnihMesta"),
    @NamedQuery(name = "Let.findByTerminal", query = "SELECT l FROM Let l WHERE l.terminal = :terminal"),
    @NamedQuery(name = "Let.findByCenaKarte", query = "SELECT l FROM Let l WHERE l.cenaKarte = :cenaKarte")})
public class Let implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "sifraLeta")
    private Long sifraLeta;
    @Column(name = "datumPolaska")
    @Temporal(TemporalType.DATE)
    private Date datumPolaska;
    @Column(name = "vremePolaska")
    @Temporal(TemporalType.TIME)
    private Date vremePolaska;
    @Column(name = "datumDolaska")
    @Temporal(TemporalType.DATE)
    private Date datumDolaska;
    @Column(name = "vremeDolaska")
    @Temporal(TemporalType.TIME)
    private Date vremeDolaska;
    @Column(name = "brojSlobodnihMesta")
    private Integer brojSlobodnihMesta;
    @Column(name = "terminal")
    private Integer terminal;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "cenaKarte")
    private Double cenaKarte;
    @OneToMany(mappedBy = "let")
    private Collection<Karta> kartaCollection;
    @JoinColumn(name = "aerodromPolazni", referencedColumnName = "sifraAerodroma")
    @ManyToOne
    private Aerodrom aerodromPolazni;
    @JoinColumn(name = "aerodromDolazni", referencedColumnName = "sifraAerodroma")
    @ManyToOne
    private Aerodrom aerodromDolazni;
    @JoinColumn(name = "kompanija", referencedColumnName = "sifraKompanije")
    @ManyToOne
    private Kompanija kompanija;
    @JoinColumn(name = "tipaviona", referencedColumnName = "sifraTipa")
    @ManyToOne
    private Tipaviona tipaviona;

    public Let() {
    }

    public Let(Long sifraLeta) {
        this.sifraLeta = sifraLeta;
    }

    public Long getSifraLeta() {
        return sifraLeta;
    }

    public void setSifraLeta(Long sifraLeta) {
        this.sifraLeta = sifraLeta;
    }

    public Date getDatumPolaska() {
        return datumPolaska;
    }

    public void setDatumPolaska(Date datumPolaska) {
        this.datumPolaska = datumPolaska;
    }

    public Date getVremePolaska() {
        return vremePolaska;
    }

    public void setVremePolaska(Date vremePolaska) {
        this.vremePolaska = vremePolaska;
    }

    public Date getDatumDolaska() {
        return datumDolaska;
    }

    public void setDatumDolaska(Date datumDolaska) {
        this.datumDolaska = datumDolaska;
    }

    public Date getVremeDolaska() {
        return vremeDolaska;
    }

    public void setVremeDolaska(Date vremeDolaska) {
        this.vremeDolaska = vremeDolaska;
    }

    public Integer getBrojSlobodnihMesta() {
        return brojSlobodnihMesta;
    }

    public void setBrojSlobodnihMesta(Integer brojSlobodnihMesta) {
        this.brojSlobodnihMesta = brojSlobodnihMesta;
    }

    public Integer getTerminal() {
        return terminal;
    }

    public void setTerminal(Integer terminal) {
        this.terminal = terminal;
    }

    public Double getCenaKarte() {
        return cenaKarte;
    }

    public void setCenaKarte(Double cenaKarte) {
        this.cenaKarte = cenaKarte;
    }

    @XmlTransient
    public Collection<Karta> getKartaCollection() {
        return kartaCollection;
    }

    public void setKartaCollection(Collection<Karta> kartaCollection) {
        this.kartaCollection = kartaCollection;
    }

    public Aerodrom getAerodromPolazni() {
        return aerodromPolazni;
    }

    public void setAerodromPolazni(Aerodrom aerodromPolazni) {
        this.aerodromPolazni = aerodromPolazni;
    }

    public Aerodrom getAerodromDolazni() {
        return aerodromDolazni;
    }

    public void setAerodromDolazni(Aerodrom aerodromDolazni) {
        this.aerodromDolazni = aerodromDolazni;
    }

    public Kompanija getKompanija() {
        return kompanija;
    }

    public void setKompanija(Kompanija kompanija) {
        this.kompanija = kompanija;
    }

    public Tipaviona getTipaviona() {
        return tipaviona;
    }

    public void setTipaviona(Tipaviona tipaviona) {
        this.tipaviona = tipaviona;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sifraLeta != null ? sifraLeta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Let)) {
            return false;
        }
        Let other = (Let) object;
        if ((this.sifraLeta == null && other.sifraLeta != null) || (this.sifraLeta != null && !this.sifraLeta.equals(other.sifraLeta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.example.demo.entities.Let[ sifraLeta=" + sifraLeta + " ]";
    }
    
}
