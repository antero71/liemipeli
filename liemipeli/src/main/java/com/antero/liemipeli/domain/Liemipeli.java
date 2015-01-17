/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.antero.liemipeli.domain;

import com.antero.liemipeli.domain.opiskelu.Koulu;
import com.antero.liemipeli.domain.opiskelu.Kurssi;
import com.antero.liemipeli.domain.opiskelu.Kurssitoteutus;
import com.antero.liemipeli.domain.opiskelu.Opettaja;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Antero Oikkonen
 */
public class Liemipeli {

    private Collection<Koulu> koulut;

    public void valitseKoulu() {

    }

    public void alustaPeli() {
        Collection<Opettaja> opettajat = alustaOpettajat();
        Koulu k1 = new Koulu();
        k1.setOpettaja(opettajat);
        k1.setLukukausimaksu(10000);
        k1.setNimi("Walesin velhokoulu");

        for (Opettaja o : opettajat) {
            for (Kurssi k : o.getOpAineet()) {
                Kurssitoteutus ktot = new Kurssitoteutus();
                ktot.setKurssi(k);
                ktot.setOpettaja(o);
                k1.addKurssitoteutus(ktot);
            }
        }

        if (koulut == null) {
            koulut = new ArrayList<Koulu>();
        }

        koulut.add(k1);

    }

    private Collection<Opettaja> alustaOpettajat() {
        Opettaja o1 = luoOpettaja("Otto Sysimetsä", "Vanhempi tietäjä");

        Kurssi k1 = luoKurssi("Liementeon perusteet I", 10, 1000);

        o1.addKurssi(k1);

        Collection<Opettaja> opettajat = new ArrayList<Opettaja>();
        opettajat.add(o1);

        return opettajat;
    }

    private Opettaja luoOpettaja(String nimi, String oppiarvo) {
        Opettaja o1 = new Opettaja();
        o1.setElava(true);
        o1.setNimi(nimi);
        o1.setOppiarvo(oppiarvo);
        return o1;
    }

    private Kurssi luoKurssi(String nimi, int opintopisteet, int hinta) {
        Kurssi k1 = new Kurssi();
        k1.setKurssinNimi(nimi);
        k1.setKurssinHinta(hinta);
        k1.setOpintopisteet(opintopisteet);
        return k1;
    }

    public void listaaKoulut() {
        for(Koulu k:koulut){
            System.out.println(k);
        }
    }
}
