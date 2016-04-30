/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.antero.liemipeli.domain.paikat;

import com.antero.liemipeli.domain.Tuote;
import com.antero.liemipeli.domain.TuoteImpl;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Antero Oikkonen
 */
public class VarastoTest {

    private Varasto varasto;

    public VarastoTest() {
    }

    @Before
    public void setUp() {
        varasto = new Varasto(1);
    }

    @Test
    public void testHaeTuote() {
        String nimi = "jäkälä";
        varasto.lisaaTuote(new TuoteImpl(nimi, 10, null));
        Tuote t = varasto.haeTuote(nimi);
        assertTrue(t.getNimi().equals(nimi));
    }

    @Test
    public void testHaeTuoteJotaeiole() {
        assertNull(varasto.haeTuote("Musketti"));
    }

    @Test
    public void testLisaaTuoteTayteenVarastoon() {
        assertTrue(varasto.lisaaTuote(new TuoteImpl("yritti", 10, null)));
        assertFalse(varasto.lisaaTuote(new TuoteImpl("jäkälä", 10, null)));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAsetaVarastonKokoNegatiivinen() {
        varasto.asetaVarastonKoko(-10);
    }

    @Test
    public void testKokoaEivoiasettaaPienemmäksiKuinVarastosaldo() {
        varasto.asetaVarastonKoko(10);
        varasto.lisaaTuote(new TuoteImpl("sokeri", 10, null));
        varasto.lisaaTuote(new TuoteImpl("vehnä", 2, null));
        varasto.lisaaTuote(new TuoteImpl("maito", 10, null));
        assertEquals(3, varasto.asetaVarastonKoko(2));

    }

    @Test
    public void testVarastonArvo() {
        varasto.asetaVarastonKoko(5);
        varasto.lisaaTuote(new TuoteImpl("Vehna", 25, null));
        varasto.lisaaTuote(new TuoteImpl("sokeri", 15, null));
        varasto.lisaaTuote(new TuoteImpl("ruuti", 100, null));

        assertEquals(140, varasto.laskeVarastonArvo());

    }

    @Test
    public void testVarastonArvoHaeTuote() {
        varasto.asetaVarastonKoko(5);
        varasto.lisaaTuote(new TuoteImpl("Vehna", 25, null));
        varasto.lisaaTuote(new TuoteImpl("sokeri", 15, null));
        varasto.lisaaTuote(new TuoteImpl("ruuti", 100, null));
        Tuote t = varasto.haeTuote("ruuti");
        assertEquals("ruuti", t.getNimi());
        assertEquals(40, varasto.laskeVarastonArvo());
        assertEquals(100, t.getHinta());

    }

    @Test(expected = IllegalArgumentException.class)
    public void testAsetaVarastonKokoNegatiiviseksi() {
        varasto.asetaVarastonKoko(-10);
    }

    @Test
    public void asetaVarastonKoko100() {
        assertEquals(100, varasto.asetaVarastonKoko(100));
    }

    @Test
    public void testVarastoSaldo() {
        varasto.asetaVarastonKoko(10);

        varasto.lisaaTuote(new TuoteImpl("miekka", 1000, null));
        varasto.lisaaTuote(new TuoteImpl("haarniska", 2000, null));
        varasto.lisaaTuote(new TuoteImpl("kypärä", 1000, null));

        assertEquals(3, varasto.varastoSaldo());

        Tuote t = varasto.haeTuote("miekka");

        assertEquals(2, varasto.varastoSaldo());
    }

}
