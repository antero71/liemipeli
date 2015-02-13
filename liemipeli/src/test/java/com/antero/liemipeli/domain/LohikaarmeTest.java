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
public class LohikaarmeTest {
    
    private Lohikaarme lohikaarme;
    
    public LohikaarmeTest() {
        lohikaarme = new Lohikaarme();
    }
    
    @Before
    public void setUp() {
    }

    @Test
    public void testGetMaksaJosLohikaarmeKuollut() {
        lohikaarme.setElava(false);
        Maksa m = new Maksa();
        
        assertEquals(m, lohikaarme.getMaksa());
        
    }

    public void testaaGetMaksaJosLohikaarmeElaa(){
        lohikaarme.setElava(true);
        assertNull(lohikaarme.getMaksa());
    }
    

    @Test
    public void testOtaSisaelin() {
    }
    
}
