/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.antero.liemipeli.domain

import com.antero.liemipeli.opiskelu.Harjoitus
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

/**
 *
 * @author Antero Oikkonen
 */
class HarjoitusTest {

    private var harjoitus: Harjoitus? = null

    @BeforeEach
    fun setUp() {
        harjoitus = Harjoitus("Kuka keksi suhteellisuusteorian", "Einstain")
    }

    @Test
    fun testaaVastaaOikeaVastays() {

        harjoitus?.kysymys = "Mitä on 2 * 2?"
        harjoitus!!.setOikeaVastaus("4")
        assertTrue(harjoitus!!.vastaa("4"))

    }

    @Test
    fun testaaVastaaVaaraVastaus() {
        harjoitus!!.kysymys = "Mitä on 2 * 2?"
        harjoitus!!.setOikeaVastaus("4")
        assertFalse(harjoitus!!.vastaa("5"))

    }
}
