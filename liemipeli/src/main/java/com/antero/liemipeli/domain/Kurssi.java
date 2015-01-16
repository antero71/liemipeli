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
public class Kurssi {
    private String kurssinNimi;
    private int opintopisteet;
    private int kurssinHinta;
    
    
    
    public String getKurssinNimi() {
        return kurssinNimi;
    }

    public void setKurssinNimi(String kurssinNimi) {
        this.kurssinNimi = kurssinNimi;
    }

    public int getOpintopisteet() {
        return opintopisteet;
    }

    public void setOpintopisteet(int opintopisteet) {
        this.opintopisteet = opintopisteet;
    }

    public int getKurssinHinta() {
        return kurssinHinta;
    }

    public void setKurssinHinta(int kurssinHinta) {
        this.kurssinHinta = kurssinHinta;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.kurssinNimi);
        hash = 59 * hash + this.opintopisteet;
        hash = 59 * hash + this.kurssinHinta;
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
        final Kurssi other = (Kurssi) obj;
        if (!Objects.equals(this.kurssinNimi, other.kurssinNimi)) {
            return false;
        }
        if (this.opintopisteet != other.opintopisteet) {
            return false;
        }
        if (this.kurssinHinta != other.kurssinHinta) {
            return false;
        }
        return true;
    }
    
    
}
