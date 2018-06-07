/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.antero.liemipeli.domain.paikat

import com.antero.liemipeli.domain.Tuote
import com.antero.liemipeli.domain.TuoteImpl
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import java.util.*


/**
 *
 * @author Antero Oikkonen
 */
class KauppaTest {

    private var kauppa: Kauppa? = null

    @BeforeEach
    fun setUp() {
        kauppa = Kauppa(Varasto(10))
    }

    @Test
    fun testOsta() {
        val nimi = "Vehnä"
        assertTrue(kauppa!!.lisaaVarastoon(TuoteImpl(nimi, 10, Properties())))
        val m = kauppa!!.osta(nimi, 100)
        val keys = m.keys
        val iter = keys.iterator()
        var vaihtorahat: Int? = null
        var t: Tuote? = null
        while (iter.hasNext()) {
            t = iter.next()
            vaihtorahat = m[t] as Int
        }

        assertEquals(10, t?.hinta)
        assertEquals(90, vaihtorahat!!.toInt())

    }

    @Test
    fun testLisaaVarastoon() {
        assertTrue(kauppa!!.lisaaVarastoon(TuoteImpl("Vehnä", 10, Properties())))
    }

    @Test
    fun testVarastosaldo() {
        kauppa!!.lisaaVarastoon(TuoteImpl("kivääri", 1000, Properties()))
        kauppa!!.lisaaVarastoon(TuoteImpl("haarniska", 1200, Properties()))
        kauppa!!.lisaaVarastoon(TuoteImpl("reppu", 100, Properties()))
        assertEquals(3, kauppa!!.montaTuotettaOnVarastossa())
    }

}
