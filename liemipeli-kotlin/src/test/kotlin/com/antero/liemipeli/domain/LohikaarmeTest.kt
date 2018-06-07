/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.antero.liemipeli.domain

import com.antero.liemipeli.DeterministicRandom
import com.antero.liemipeli.domain.elaimet.Lohikaarme
import com.antero.liemipeli.domain.elaimet.Maksa
import com.antero.liemipeli.domain.taiat.LohikaarmeTaika
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

        assertEquals(m.nimi, lohikaarme.maksa?.nimi)

    }

    @Test
    fun testaaGetMaksaJosLohikaarmeElaa() {
        lohikaarme.isElava = true
        assertNull(lohikaarme.maksa)
    }

    fun testaaOtaSisaelinJosLohikaarmeElossaJaTaikaOk() {

        val r = DeterministicRandom(doubleArrayOf(0.3))

        val taika = LohikaarmeTaika(r)

        assertEquals(Maksa(), lohikaarme.otaSisaelin(taika, Maksa()))
    }

    fun testaaOtaSisaelinJosLohikaarmeElossaJaTaikaEiOk() {

        val r = DeterministicRandom(doubleArrayOf(0.6))

        val taika = LohikaarmeTaika(r)

        assertEquals(null, lohikaarme.otaSisaelin(taika, Maksa()))
    }

}
