/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.antero.liemipeli.domain;

import java.util.Objects;

/**
 *
 * @author Antero Oikkonen
 */
public class Kurssitoteutus {
    private Opettaja opettaja;
    private Kurssi kurssi;

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
