/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.antero.liemipeli.domain.paikat;

import com.antero.liemipeli.domain.Tuote;
import com.antero.liemipeli.domain.TuoteImpl;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Antero Oikkonen
 */
public class KauppaTest {

    private Kauppa kauppa;

    public KauppaTest() {
    }

    @Before
    public void setUp() {
        kauppa = new Kauppa(new Varasto(10));
    }

    @Test
    public void testOsta() {
        String nimi = "Vehnä";
        assertTrue(kauppa.lisaaVarastoon(new TuoteImpl(nimi, 10, null)));
        HashMap m = kauppa.osta(nimi, 100);
        Set keys = m.keySet();
        Iterator iter = keys.iterator();
        Integer vaihtorahat = null;
        Tuote t = null;
        while (iter.hasNext()) {
            t=(Tuote) iter.next();
            vaihtorahat = (Integer) m.get(t);
        }

        assertEquals(10, t.getHinta());
        assertEquals(90,vaihtorahat.intValue());
        
    }

    @Test
    public void testLisaaVarastoon() {
        assertTrue(kauppa.lisaaVarastoon(new TuoteImpl("Vehnä", 10, null)));
    }
    
    @Test
    public void testVarastosaldo(){
        kauppa.lisaaVarastoon(new TuoteImpl("kivääri", 1000, null));
        kauppa.lisaaVarastoon(new TuoteImpl("haarniska", 1200, null));
        kauppa.lisaaVarastoon(new TuoteImpl("reppu", 100, null));
        assertEquals(3, kauppa.montaTuotettaOnVarastossa());
    }

}
