/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.antero.liemipeli.domain

import com.antero.liemipeli.domain.elaimet.Ihmissusi
import com.antero.liemipeli.util.MoonCalcInterface
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.TestInstance.Lifecycle
import org.mockito.Mockito.*
import java.util.*


/**
 *
 * @author Antero Oikkonen
 */
@TestInstance(Lifecycle.PER_CLASS)
class IhmissusiTest {

    internal var iSusi: Ihmissusi? = null

    @Test
    fun testIsHirvio() {

        val calc = mock(MoonCalcInterface::class.java)
        val cal = mock(Calendar::class.java)
        `when`(cal.get(Calendar.MONTH)).thenReturn(1)
        `when`(cal.get(Calendar.MONTH)).thenReturn(1)
        `when`(cal.get(Calendar.DAY_OF_MONTH)).thenReturn(19)
        `when`(cal.get(Calendar.YEAR)).thenReturn(2019)

        `when`(calc.phaseName(4)).thenReturn("Full")
        `when`(calc.moonPhase(2019, 2, 19)).thenReturn(4)

        val iSusi = Ihmissusi(calc, cal)

        val isHirvio = iSusi.isHirvio

        verify(calc).phaseName(eq(4))

        assertTrue(isHirvio)
    }

    @Test
    fun testIsNotHirvio() {
        val calc = mock(MoonCalcInterface::class.java)
        val cal = mock(Calendar::class.java)
        `when`(cal.get(Calendar.MONTH)).thenReturn(1)
        `when`(cal.get(Calendar.DAY_OF_MONTH)).thenReturn(19)
        `when`(cal.get(Calendar.YEAR)).thenReturn(2019)

        `when`(calc.phaseName(0)).thenReturn("New")
        `when`(calc.moonPhase(2019, 8, 30)).thenReturn(1)

        val iSusi = Ihmissusi(calc, cal)

        val isHirvio = iSusi.isHirvio

        verify(calc).phaseName(eq(0))

        assertFalse(isHirvio)
    }


}
