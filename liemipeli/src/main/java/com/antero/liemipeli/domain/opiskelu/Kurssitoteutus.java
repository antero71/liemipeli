/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.antero.liemipeli.domain.opiskelu;

import java.util.Collection;
import java.util.Objects;

/**
 *
 * @author Antero Oikkonen
 */
public class Kurssitoteutus {

    private Opettaja opettaja;
    private Kurssi kurssi;
    private int kurssinKokonaisPisteet;
    private int kurssinEteneminen;
    private Collection<Harjoitus> harjoitukset;

    public Collection<Harjoitus> getHarjoitukset() {
        return harjoitukset;
    }

    public void setHarjoitukset(Collection<Harjoitus> harjoitukset) {
        this.harjoitukset = harjoitukset;
    }
    
    

    public int getKurssinKokonaisPisteet() {
        return kurssinKokonaisPisteet;
    }

    public void setKurssinKokonaisPisteet(int kurssinKokonaisPisteet) {
        this.kurssinKokonaisPisteet = kurssinKokonaisPisteet;
    }

    public int getKurssinEteneminen() {
        return kurssinEteneminen;
    }

    public void setKurssinEteneminen(int kurssinEteneminen) {
        this.kurssinEteneminen = kurssinEteneminen;
    }

    public Opettaja getOpettaja() {
        return opettaja;
    }

    public void setOpettaja(Opettaja opettaja) {
        this.opettaja = opettaja;
    }

    public Kurssi getKurssi() {
        return kurssi;
    }

    public void setKurssi(Kurssi kurssi) {
        this.kurssi = kurssi;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.opettaja);
        hash = 59 * hash + Objects.hashCode(this.kurssi);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Kurssitoteutus other = (Kurssitoteutus) obj;
        if (!Objects.equals(this.opettaja, other.opettaja)) {
            return false;
        }
        if (!Objects.equals(this.kurssi, other.kurssi)) {
            return false;
        }
        return true;
    }

}
