/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.antero.liemipeli.domain

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test

/**
 *
 * @author Antero Oikkonen
 */
class MoonCalculationTest {

    lateinit var calc: MoonCalculation

    @BeforeAll
    fun setUp() {
        calc = MoonCalculation()
    }

    @Test
    fun testFullMoon() {
        var vaihe = calc.moonPhase(2016, 4, 22)
        assertEquals("Full", calc.phaseName(vaihe))

        vaihe = calc.moonPhase(2016, 4, 7)
        assertEquals("New", calc.phaseName(vaihe))

        vaihe = calc.moonPhase(2019, 2, 19)

        assertEquals("Full", calc.phaseName(vaihe))

        vaihe = calc.moonPhase(2020, 10, 31)

        assertEquals("Full", calc.phaseName(vaihe))

    }

    @Test
    fun testFirstQuarter() {
        var vaihe = calc.moonPhase(2016, 8, 10)
        assertEquals("First quarter", calc.phaseName(vaihe))

        vaihe = calc.moonPhase(2017, 6, 1)
        assertEquals("First quarter", calc.phaseName(vaihe))

        vaihe = calc.moonPhase(2018, 12, 15)
        assertEquals("First quarter", calc.phaseName(vaihe))

    }

    @Test
    fun testViimeinenNeljannes() {
        var vaihe = calc.moonPhase(2016, 5, 29)
        assertEquals("Third quarter", calc.phaseName(vaihe))
        vaihe = calc.moonPhase(2018, 3, 9)
        assertEquals("Third quarter", calc.phaseName(vaihe))

        vaihe = calc.moonPhase(2020, 8, 11)
        assertEquals("Third quarter", calc.phaseName(vaihe))

    }

    @Test
    fun testNewMoon() {
        var vaihe = calc.moonPhase(2016, 4, 7)
        assertEquals("New", calc.phaseName(vaihe))

        vaihe = calc.moonPhase(2019, 8, 30)

        assertEquals("New", calc.phaseName(vaihe))

    }
}
