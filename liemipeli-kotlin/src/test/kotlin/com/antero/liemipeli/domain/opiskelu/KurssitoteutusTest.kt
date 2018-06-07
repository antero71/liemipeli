/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.antero.liemipeli.domain.opiskelu

import com.antero.liemipeli.opiskelu.Harjoitus
import com.antero.liemipeli.opiskelu.Kurssi
import com.antero.liemipeli.opiskelu.Kurssitoteutus
import com.antero.liemipeli.opiskelu.Opettaja
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.fail
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.TestInstance.Lifecycle


/**
 *
 * @author Antero Oikkonen
 */
@TestInstance(Lifecycle.PER_CLASS)
class KurssitoteutusTest {

    internal var toteutus: Kurssitoteutus? = null

    @BeforeAll
    fun setUp() {
        toteutus = Kurssitoteutus()
        toteutus?.kurssi = luoKurssi("Liementeon perusteet I")
        toteutus?.kurssinKokonaisPisteet = 100
        toteutus?.kurssinEteneminen = 0
    }

    @Test
    fun testGetHarjoitukset() {
        println("getHarjoitukset")
        val instance = Kurssitoteutus()
        val expResult = ArrayList<Harjoitus>()
        val h = Harjoitus("Mitä on 15/3", "5")
        expResult.add(h)
        instance.harjoitukset = expResult
        val result = instance.harjoitukset

        assertEquals(expResult, result)
        assertEquals(1, result?.size)
        assertEquals("5", (result?.iterator()?.next() as Harjoitus).vastaus)
    }

    @Test
    fun testPuuttuvatPisteet() {
        println("PuuttuvatPisteet")

        toteutus!!.opiskele()
        toteutus!!.opiskele()
        assertEquals(80, toteutus!!.montaPistettaPuuttuu())
    }

    @Test
    fun testOnkoKurssiSuoritettuJosEiOle() {
        println("OnkoKurssiSuoritettuJosEiOle")
        val k = luoKurssi("Taiat I")

        val instance = Kurssitoteutus()
        instance.kurssi = k
        instance.kurssinKokonaisPisteet = 100
        instance.opiskele()

        assertEquals(false, instance.isSuoritettu)
    }

    @Test
    fun testOnkoKurssiSuoritettuJosOn() {
        println("OnkoKurssiSuoritettuJosEiOle")
        val k = luoKurssi("Taiat I")

        val instance = Kurssitoteutus()
        instance.kurssi = k
        instance.kurssinKokonaisPisteet = 100
        for (i in 0..9) {
            instance.opiskele()
        }

        assertEquals(true, instance.isSuoritettu)
    }

    @Test
    fun testOpiskele() {
        println("opiskele")
        val k = luoKurssi("Taiat I")

        val instance = Kurssitoteutus()
        instance.kurssi = k
        instance.kurssinKokonaisPisteet = 100
        instance.opiskele()

        assertEquals(10, instance.kurssinEteneminen)

    }

    @Test
    fun testGetOpettaja() {
        println("getOpettaja")
        val instance = Kurssitoteutus()
        val expResult = Opettaja()
        expResult.oppiarvo = "Liementeon mestari"
        instance.opettaja = expResult
        val result = instance.opettaja
        assertEquals(expResult, result)
        //fail("The test case is a prototype.");
    }

    @Test
    fun testSetKurssi() {
        println("setKurssi")
        val kurssinNimi = "Liementeko I"
        val kurssi = luoKurssi(kurssinNimi)

        val instance = Kurssitoteutus()
        instance.kurssi = kurssi
        val k = instance.kurssi
        assertEquals(10, k?.opintopisteet)
        assertEquals(1000, k?.kurssinHinta)
        assertEquals(kurssinNimi, k?.kurssinNimi)
        //fail("The test case is a prototype.");
    }

    private fun luoKurssi(kurssinNimi: String): Kurssi {

        val kurssi = Kurssi()
        kurssi.kurssinHinta = 1000
        kurssi.kurssinNimi = kurssinNimi
        kurssi.opintopisteet = 10
        return kurssi
    }

}
