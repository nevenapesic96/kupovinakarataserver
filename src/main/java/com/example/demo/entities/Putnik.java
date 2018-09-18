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
@Table(name = "putnik")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Putnik.findAll", query = "SELECT p FROM Putnik p"),
    @NamedQuery(name = "Putnik.findBySifraPutnika", query = "SELECT p FROM Putnik p WHERE p.sifraPutnika = :sifraPutnika"),
    @NamedQuery(name = "Putnik.findByIme", query = "SELECT p FROM Putnik p WHERE p.ime = :ime"),
    @NamedQuery(name = "Putnik.findByPrezime", query = "SELECT p FROM Putnik p WHERE p.prezime = :prezime"),
    @NamedQuery(name = "Putnik.findByTelefon", query = "SELECT p FROM Putnik p WHERE p.telefon = :telefon"),
    @NamedQuery(name = "Putnik.findByEmail", query = "SELECT p FROM Putnik p WHERE p.email = :email"),
    @NamedQuery(name = "Putnik.findByBrojPasosa", query = "SELECT p FROM Putnik p WHERE p.brojPasosa = :brojPasosa"),
    @NamedQuery(name = "Putnik.findByAdresa", query = "SELECT p FROM Putnik p WHERE p.adresa = :adresa")})
public class Putnik implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "sifraPutnika")
    private Long sifraPutnika;
    @Size(max = 50)
    @Column(name = "ime")
    private String ime;
    @Size(max = 50)
    @Column(name = "prezime")
    private String prezime;
    @Size(max = 50)
    @Column(name = "telefon")
    private String telefon;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 50)
    @Column(name = "email")
    private String email;
    @Size(max = 50)
    @Column(name = "brojPasosa")
    private String brojPasosa;
    @Size(max = 50)
    @Column(name = "adresa")
    private String adresa;
    @OneToMany(mappedBy = "putnik")
    private Collection<Karta> kartaCollection;

    public Putnik() {
    }

    public Putnik(Long sifraPutnika) {
        this.sifraPutnika = sifraPutnika;
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

    @XmlTransient
    public Collection<Karta> getKartaCollection() {
        return kartaCollection;
    }

    public void setKartaCollection(Collection<Karta> kartaCollection) {
        this.kartaCollection = kartaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sifraPutnika != null ? sifraPutnika.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Putnik)) {
            return false;
        }
        Putnik other = (Putnik) object;
        if ((this.sifraPutnika == null && other.sifraPutnika != null) || (this.sifraPutnika != null && !this.sifraPutnika.equals(other.sifraPutnika))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.example.demo.entities.Putnik[ sifraPutnika=" + sifraPutnika + " ]";
    }
    
}
