/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.antero.liemipeli.domain;

import java.util.Calendar;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 *
 * @author Antero Oikkonen
 */
public class IhmissusiTest {
    
    Ihmissusi iSusi;
    
    
    public IhmissusiTest() {
    }
    
    @Before
    public void setUp() {
        //iSusi = new Ihmissusi(null);
    }

    @Test
    public void testIsHirvio() {
        MoonCalcInterface calc = mock(MoonCalcInterface.class);
        Calendar cal = mock(Calendar.class);
        when(cal.get(Calendar.MONTH)).thenReturn(1);
        when(cal.get(Calendar.DAY_OF_MONTH)).thenReturn(19);
        when(cal.get(Calendar.YEAR)).thenReturn(2019);
        
        when(calc.phaseName(4)).thenReturn("Full");
        when(calc.moonPhase(2019, 2, 19)).thenReturn(4);
        
        Ihmissusi iSusi = new Ihmissusi(calc,cal);
        
        boolean isHirvio = iSusi.isHirvio();
        
        verify(calc).phaseName(eq(4));
        
        assertTrue(isHirvio);
    }

    @Test
    public void testIsNotHirvio() {
        MoonCalcInterface calc = mock(MoonCalcInterface.class);
        Calendar cal = mock(Calendar.class);
        when(cal.get(Calendar.MONTH)).thenReturn(1);
        when(cal.get(Calendar.DAY_OF_MONTH)).thenReturn(19);
        when(cal.get(Calendar.YEAR)).thenReturn(2019);
        
        when(calc.phaseName(0)).thenReturn("New");
        when(calc.moonPhase(2019, 8, 30)).thenReturn(1);
        
        Ihmissusi iSusi = new Ihmissusi(calc,cal);
        
        boolean isHirvio = iSusi.isHirvio();
        
        verify(calc).phaseName(eq(0));
        
        assertFalse(isHirvio);
    }
    
    
}
