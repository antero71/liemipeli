/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.antero.liemipeli.domain.opiskelu;

import java.util.ArrayList;
import java.util.Collection;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Antero Oikkonen
 */
public class KurssitoteutusTest {

    Kurssitoteutus toteutus = null;
    
    public KurssitoteutusTest() {
    }

    @Before
    public void setUp() {
        toteutus=new Kurssitoteutus();
        toteutus.setKurssi(luoKurssi("Liementeon perusteet I"));
        toteutus.setKurssinKokonaisPisteet(100);
        toteutus.setKurssinEteneminen(0);
    }

    @Test
    public void testGetHarjoitukset() {
        System.out.println("getHarjoitukset");
        Kurssitoteutus instance = new Kurssitoteutus();
        Collection<Harjoitus> expResult = new ArrayList();
        Harjoitus h = new Harjoitus("Mitä on 15/3", "5");
        expResult.add(h);
        instance.setHarjoitukset(expResult);
        Collection<Harjoitus> result = instance.getHarjoitukset();

        assertEquals(expResult, result);
        assertEquals(1, result.size());
        assertEquals("5", ((Harjoitus) (result.iterator().next())).getVastaus());

        //fail("The test case is a prototype.");
    }

    @Test
    public void testPuuttuvatPisteet() {
        System.out.println("PuuttuvatPisteet");
      
        toteutus.opiskele();
        toteutus.opiskele();
        assertEquals(80, toteutus.montaPistettaPuuttuu());
    }

    @Test
    public void testOnkoKurssiSuoritettuJosEiOle() {
        System.out.println("OnkoKurssiSuoritettuJosEiOle");
        Kurssi k = luoKurssi("Taiat I");

        Kurssitoteutus instance = new Kurssitoteutus();
        instance.setKurssi(k);
        instance.setKurssinKokonaisPisteet(100);
        instance.opiskele();

        assertEquals(false, instance.isSuoritettu());
    }

    @Test
    public void testOnkoKurssiSuoritettuJosOn() {
        System.out.println("OnkoKurssiSuoritettuJosEiOle");
        Kurssi k = luoKurssi("Taiat I");

        Kurssitoteutus instance = new Kurssitoteutus();
        instance.setKurssi(k);
        instance.setKurssinKokonaisPisteet(100);
        for (int i = 0; i < 10; i++) {
            instance.opiskele();
        }

        assertEquals(true, instance.isSuoritettu());
    }

    @Test
    public void testOpiskele() {
        System.out.println("opiskele");
        Kurssi k = luoKurssi("Taiat I");

        Kurssitoteutus instance = new Kurssitoteutus();
        instance.setKurssi(k);
        instance.setKurssinKokonaisPisteet(100);
        instance.opiskele();

        assertEquals(10, instance.getKurssinEteneminen());

    }

    @Test
    public void testGetOpettaja() {
        System.out.println("getOpettaja");
        Kurssitoteutus instance = new Kurssitoteutus();
        Opettaja expResult = new Opettaja();
        expResult.setOppiarvo("Liementeon mestari");
        instance.setOpettaja(expResult);
        Opettaja result = instance.getOpettaja();
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testSetKurssi() {
        System.out.println("setKurssi");
        String kurssinNimi = "Liementeko I";
        Kurssi kurssi = luoKurssi(kurssinNimi);

        Kurssitoteutus instance = new Kurssitoteutus();
        instance.setKurssi(kurssi);
        Kurssi k = instance.getKurssi();
        assertEquals(10, k.getOpintopisteet());
        assertEquals(1000, k.getKurssinHinta());
        assertEquals(kurssinNimi, k.getKurssinNimi());
        //fail("The test case is a prototype.");
    }

    private Kurssi luoKurssi(String kurssinNimi) {

        Kurssi kurssi = new Kurssi();
        kurssi.setKurssinHinta(1000);
        kurssi.setKurssinNimi(kurssinNimi);
        kurssi.setOpintopisteet(10);
        return kurssi;
    }

}
