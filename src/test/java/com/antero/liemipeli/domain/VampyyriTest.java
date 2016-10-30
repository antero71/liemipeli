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
public class VampyyriTest {
    
    Vampyyri v = new Vampyyri();
    
    public VampyyriTest() {
    }
    
    @Before
    public void setUp() {
    }

    @Test
    public void testSetNimi() {
        v.setNimi("Darren");
        assertEquals("Darren", v.getNimi());
    }
    
}
