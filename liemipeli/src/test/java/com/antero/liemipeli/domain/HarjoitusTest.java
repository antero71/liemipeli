/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.antero.liemipeli.domain;

import com.antero.liemipeli.domain.opiskelu.Harjoitus;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Antero Oikkonen
 */
public class HarjoitusTest {

    private Harjoitus harjoitus;

    public HarjoitusTest() {
    }

    @Before
    public void setUp() {
        harjoitus = new Harjoitus();
    }

    @Test
    public void testaaVastaaOikeaVastays() {

        harjoitus.setKysymys("Mitä on 2 * 2?");
        harjoitus.setOikeaVastaus("4");
        assertEquals("Oikea vastaus", harjoitus.vastaa("4"));

    }

    @Test
    public void testaaVastaaVaaraVastaus() {
        harjoitus.setKysymys("Mitä on 2 * 2?");
        harjoitus.setOikeaVastaus("4");
        assertEquals("Väärä vastaus", harjoitus.vastaa("5"));

    }
}
