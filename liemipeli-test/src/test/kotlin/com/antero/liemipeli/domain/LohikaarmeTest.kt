/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.antero.liemipeli.domain

import com.antero.liemipeli.domain.taiat.LohikaarmeTaika
import com.antero.liemipeli.domain.test.DeterministicRandom
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNull
import org.junit.jupiter.api.Test


/**
 *
 * @author Antero Oikkonen
 */
class LohikaarmeTest {

    private val lohikaarme: Lohikaarme

    init {
        lohikaarme = Lohikaarme()
    }



    @Test
    fun testGetMaksaJosLohikaarmeKuollut() {
        lohikaarme.isElava = false
        val m = Maksa()

        assertEquals(m, lohikaarme.maksa)

    }

    fun testaaGetMaksaJosLohikaarmeElaa() {
        lohikaarme.isElava = true
        assertNull(lohikaarme.maksa)
    }

    fun testaaOtaSisaelinJosLohikaarmeElossaJaTaikaOk() {

        val r = DeterministicRandom()
        val luvut = doubleArrayOf(0.3)
        r.setLuvut(luvut)

        val taika = LohikaarmeTaika(r)

        assertEquals(Maksa(), lohikaarme.otaSisaelin(taika, Maksa()))
    }

    fun testaaOtaSisaelinJosLohikaarmeElossaJaTaikaEiOk() {

        val r = DeterministicRandom()
        val luvut = doubleArrayOf(0.6)
        r.setLuvut(luvut)

        val taika = LohikaarmeTaika(r)

        assertEquals(null, lohikaarme.otaSisaelin(taika, Maksa()))
    }

}
