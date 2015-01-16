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
public class Pelaaja extends ElavaOlio implements Opiskelija{
    private Collection<Opintosuoritus> opinnot;
    private Collection<Kurssitoteutus> meneillaanOlevatOpiskelut;


    public Pelaaja(String nimi) {
        super.setNimi(nimi);
        opinnot=new ArrayList();
        meneillaanOlevatOpiskelut=new ArrayList();
    }

    public Collection<Kurssitoteutus> getMeneillaanOlevatOpiskelut() {
        return meneillaanOlevatOpiskelut;
    }

    public void setMeneillaanOlevatOpiskelut(Collection<Kurssitoteutus> meneillaanOlevatOpiskelut) {
        this.meneillaanOlevatOpiskelut = meneillaanOlevatOpiskelut;
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

    @Override
    public void opiskele() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void opiskele(Kurssitoteutus kurssitoteutus) {
        meneillaanOlevatOpiskelut.add(kurssitoteutus);
    }

}
