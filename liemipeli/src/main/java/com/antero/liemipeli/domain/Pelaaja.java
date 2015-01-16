/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.antero.liemipeli.domain;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Antero Oikkonen
 */
public class Pelaaja extends ElavaOlio{
    private Collection<Opintosuoritus> opinnot;


    public Pelaaja(String nimi) {
        super.setNimi(nimi);
        opinnot=new ArrayList();
    }

    public Collection<Opintosuoritus> getOpinnot() {
        return opinnot;
    }
    
    public void addOpinto(Opintosuoritus opinto){
        opinnot.add(opinto);
    }

    public void setOpinnot(Collection<Opintosuoritus> opinnot) {
        this.opinnot = opinnot;
    }

}
