/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.antero.liemipeli.domain;

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
        assertTrue(pelaaja.getOpinnot().size()==1);
    }


    @Test
    public void testaaGetJaSetNimi() {
        pelaaja.setNimi("Antero");
        assertEquals("Antero", pelaaja.getNimi());
    }

    
}
