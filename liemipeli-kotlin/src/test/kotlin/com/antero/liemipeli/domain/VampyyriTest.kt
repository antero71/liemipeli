/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.antero.liemipeli.domain

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

/**
 *
 * @author Antero Oikkonen
 */
class VampyyriTest {

    internal var v = Vampyyri("Darren")

    @Test
    fun testSetNimi() {
        assertEquals("Darren", v.nimi)
    }

}
