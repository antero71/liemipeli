/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.antero.liemipeli.domain

import com.antero.liemipeli.opiskelu.Kurssi
import com.antero.liemipeli.opiskelu.Kurssitoteutus
import com.antero.liemipeli.opiskelu.Opintosuoritus
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.TestInstance.Lifecycle

/**
 *
 * @author Antero Oikkonen
 */

class PelaajaTest {

    lateinit var pelaaja: Pelaaja

    @BeforeEach
    fun setUp() {
        pelaaja = Pelaaja("Liisa")
    }

    @Test
    fun testaaGetOpinnotJosEiOleOpintoja() {
        assertTrue(pelaaja.opinnot.isEmpty())
    }

    @Test
    fun testaaAddOpinto() {
        val k = Kurssi()
        k.kurssinNimi = "Liemienteon peruskurssi I"
        val suoritus = Opintosuoritus()
        val toteutus = Kurssitoteutus()
        toteutus.kurssi = k
        suoritus.kurssiToteutus = toteutus
        suoritus.arvosana = 5
        pelaaja.addOpinto(suoritus)
        assertTrue(pelaaja.opinnot.size == 1)
    }

    @Test
    fun testaaGetJaSetNimi() {
        pelaaja.nimi = "Antero"
        assertEquals("Antero", pelaaja.nimi)
    }

    @Test
    fun testaaOpiskeleJaKurssinLisays() {

        val kurssinNimi = "Liemien perusteet I"

        val k1 = Kurssi()
        k1.kurssinNimi = kurssinNimi

        val tot = Kurssitoteutus()
        tot.kurssi = k1
        pelaaja.opiskele(tot)

        assertTrue(pelaaja.meneillaanOlevatOpiskelut?.size == 1)

        pelaaja.opiskele(tot)
        assertTrue(pelaaja.meneillaanOlevatOpiskelut?.size == 1)

        val k2 = Kurssi()
        k2.kurssinNimi = kurssinNimi

        val tot2 = Kurssitoteutus()
        tot2.kurssi = k2

        pelaaja.opiskele(tot2)
        assertTrue(pelaaja.meneillaanOlevatOpiskelut.size == 2)

    }

}
