/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.antero.liemipeli.domain;

import com.antero.liemipeli.domain.opiskelu.Kurssi;
import com.antero.liemipeli.domain.opiskelu.Kurssitoteutus;
import com.antero.liemipeli.domain.opiskelu.Opintosuoritus;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Antero Oikkonen
 */
public class PelaajaTest {

    private Pelaaja pelaaja;

    public PelaajaTest() {
    }

    @Before
    public void setUp() {
        pelaaja = new Pelaaja("Liisa");
    }

    @Test
    public void testaaGetOpinnotJosEiOleOpintoja() {
        assertTrue(pelaaja.getOpinnot().isEmpty());
    }

    @Test
    public void testaaAddOpinto() {
        Kurssi k = new Kurssi();
        k.setKurssinNimi("Liemienteon peruskurssi I");
        Opintosuoritus suoritus = new Opintosuoritus();
        Kurssitoteutus toteutus = new Kurssitoteutus();
        toteutus.setKurssi(k);
        suoritus.setKurssiToteutus(toteutus);
        suoritus.setArvosana(5);
        pelaaja.addOpinto(suoritus);
        assertTrue(pelaaja.getOpinnot().size() == 1);
    }

    @Test
    public void testaaGetJaSetNimi() {
        pelaaja.setNimi("Antero");
        assertEquals("Antero", pelaaja.getNimi());
    }

    @Test
    public void testaaOpiskeleJaKurssinLisays() {
        
        String kurssinNimi = "Liemien perusteet I";
        
        Kurssi k1 = new Kurssi();
        k1.setKurssinNimi(kurssinNimi);

        Kurssitoteutus tot = new Kurssitoteutus();
        tot.setKurssi(k1);
        pelaaja.opiskele(tot);

        assertTrue(pelaaja.getMeneillaanOlevatOpiskelut().size() == 1);

        pelaaja.opiskele(tot);
        assertTrue(pelaaja.getMeneillaanOlevatOpiskelut().size() == 1);

        Kurssi k2 = new Kurssi();
        k2.setKurssinNimi(kurssinNimi);

        Kurssitoteutus tot2 = new Kurssitoteutus();
        tot2.setKurssi(k2);

        pelaaja.opiskele(tot2);
        assertTrue(pelaaja.getMeneillaanOlevatOpiskelut().size() == 1);

    }

}
