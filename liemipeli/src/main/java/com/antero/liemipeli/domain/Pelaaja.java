/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.antero.liemipeli.domain;

import java.util.Collection;

/**
 *
 * @author Antero Oikkonen
 */
public class Pelaaja {
    private Collection<Opintosuoritus> opinnot;
    private String  nimi;

    public Collection<Opintosuoritus> getOpinnot() {
        return opinnot;
    }
    
    public void addOpinto(Opintosuoritus opinto){
        opinnot.add(opinto);
    }

    public void setOpinnot(Collection<Opintosuoritus> opinnot) {
        this.opinnot = opinnot;
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }
    
    
}
