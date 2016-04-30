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
public class MoonCalculationTest {

    MoonCalculation calc;

    public MoonCalculationTest() {

    }

    @Before
    public void setUp() {
        calc = new MoonCalculation();
    }

    @Test
    public void testFullMoon() {
        int vaihe = calc.moonPhase(2016, 4, 22);
        assertEquals("Full", calc.phaseName(vaihe));

        vaihe = calc.moonPhase(2016, 4, 7);
        assertEquals("New", calc.phaseName(vaihe));

        vaihe = calc.moonPhase(2019, 2, 19);

        assertEquals("Full", calc.phaseName(vaihe));

        vaihe = calc.moonPhase(2020, 10, 31);

        assertEquals("Full", calc.phaseName(vaihe));

    }

    @Test
    public void testFirstQuarter() {
        int vaihe = calc.moonPhase(2016, 8, 10);
        assertEquals("First quarter", calc.phaseName(vaihe));

        vaihe = calc.moonPhase(2017, 6, 1);
        assertEquals("First quarter", calc.phaseName(vaihe));

        vaihe = calc.moonPhase(2018, 12, 15);
        assertEquals("First quarter", calc.phaseName(vaihe));

    }
    
    @Test
    public void testViimeinenNeljannes(){
        int vaihe = calc.moonPhase(2016, 5, 29);
        assertEquals("Third quarter", calc.phaseName(vaihe));
        vaihe = calc.moonPhase(2018, 3, 9);
        assertEquals("Third quarter", calc.phaseName(vaihe));
        
        vaihe = calc.moonPhase(2020, 8, 11);
        assertEquals("Third quarter", calc.phaseName(vaihe));

    }

    @Test
    public void testNewMoon() {
        int vaihe = calc.moonPhase(2016, 4, 7);
        assertEquals("New", calc.phaseName(vaihe));
    }

    @Test
    public void testMoonPhase() {
    }

    @Test
    public void testDaysInMonth() {
    }

    @Test
    public void testIsLeapYearP() {
    }

    @Test
    public void testPhaseName() {
    }

}
