/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.antero.liemipeli.domain;

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
    
    
}
