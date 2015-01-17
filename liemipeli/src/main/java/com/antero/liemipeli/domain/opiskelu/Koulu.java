/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.antero.liemipeli.domain.opiskelu;

import com.antero.liemipeli.domain.opiskelu.Kurssitoteutus;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Antero Oikkonen
 */
public class Koulu {
    private String nimi;
    private Collection<Opettaja> opettaja;
    private Collection<Kurssitoteutus> kurssiToteutukset;
    private int lukukausimaksu;

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public Collection<Opettaja> getOpettaja() {
        return opettaja;
    }

    public void setOpettaja(Collection<Opettaja> opettaja) {
        this.opettaja = opettaja;
    }

    public Collection<Kurssitoteutus> getKurssiToteutukset() {
        return kurssiToteutukset;
    }

    public void setKurssiToteutukset(Collection<Kurssitoteutus> kurssiToteutukset) {
        this.kurssiToteutukset = kurssiToteutukset;
    }

    public int getLukukausimaksu() {
        return lukukausimaksu;
    }

    public void setLukukausimaksu(int lukukausimaksu) {
        this.lukukausimaksu = lukukausimaksu;
    }

    /**
     * lisätään <code>Kurssitoteutus</code>
     * @param ktot 
     */
    
    public void addKurssitoteutus(Kurssitoteutus ktot) {
       if(this.kurssiToteutukset==null){
           kurssiToteutukset = new ArrayList<Kurssitoteutus>();
       }
       kurssiToteutukset.add(ktot);
    }
    
    
    
    
}
