/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.antero.liemipeli.domain.opiskelu;

/**
 *
 * @author Antero Oikkonen
 */
public class Opintosuoritus {
    private Kurssitoteutus kurssiToteutus;
    private int arvosana;

    public Kurssitoteutus getKurssiToteutus() {
        return kurssiToteutus;
    }

    public void setKurssiToteutus(Kurssitoteutus kurssiToteutus) {
        this.kurssiToteutus = kurssiToteutus;
    }

    public int getArvosana() {
        return arvosana;
    }

    public void setArvosana(int arvosana) {
        this.arvosana = arvosana;
    }
    
    
    
}
