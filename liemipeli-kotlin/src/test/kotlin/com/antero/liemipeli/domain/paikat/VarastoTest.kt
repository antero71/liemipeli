package com.antero.liemipeli.domain.paikat

import com.antero.liemipeli.domain.TuoteImpl
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import java.util.*


/**
 *
 * @author Antero Oikkonen
 */
class VarastoTest {

    lateinit var varasto: Varasto

    @BeforeEach
    fun setUp() {
        varasto = Varasto(1)
    }

    @Test
    fun testHaeTuote() {
        val nimi = "jäkälä"
        varasto.lisaaTuote(TuoteImpl(nimi, 10, Properties()))
        val t = varasto.haeTuote(nimi)
        assertTrue(t?.nimi == nimi)
    }

    @Test
    fun testHaeTuoteJotaeiole() {
        assertNull(varasto.haeTuote("Musketti"))
    }

    @Test
    fun testLisaaTuoteTayteenVarastoon() {
        assertTrue(varasto.lisaaTuote(TuoteImpl("yritti", 10, Properties())))
        assertFalse(varasto.lisaaTuote(TuoteImpl("jäkälä", 10, Properties())))
    }

    @Test
    fun testKokoaEivoiasettaaPienemmaksiKuinVarastosaldo() {
        varasto.asetaVarastonKoko(10)
        varasto.lisaaTuote(TuoteImpl("sokeri", 10, Properties()))
        varasto.lisaaTuote(TuoteImpl("vehnä", 2, Properties()))
        varasto.lisaaTuote(TuoteImpl("maito", 10, Properties()))
        assertEquals(3, varasto.asetaVarastonKoko(2))

    }

    @org.junit.jupiter.api.Test
    fun testVarastonArvo() {
        varasto.asetaVarastonKoko(5)
        varasto.lisaaTuote(TuoteImpl("Vehna", 25, Properties()))
        varasto.lisaaTuote(TuoteImpl("sokeri", 15, Properties()))
        varasto.lisaaTuote(TuoteImpl("ruuti", 100, Properties()))

        assertEquals(140, varasto.laskeVarastonArvo())

    }

    @Test
    fun testVarastonArvoHaeTuote() {
        varasto.asetaVarastonKoko(5)
        varasto.lisaaTuote(TuoteImpl("Vehna", 25, Properties()))
        varasto.lisaaTuote(TuoteImpl("sokeri", 15, Properties()))
        varasto.lisaaTuote(TuoteImpl("ruuti", 100, Properties()))
        val t = varasto.haeTuote("ruuti")
        assertEquals("ruuti", t?.nimi)
        assertEquals(40, varasto.laskeVarastonArvo())
        assertEquals(100, t?.hinta
        )

    }

    @Test
    fun testAsetaVarastonKokoNegatiiviseksi() {

        val exception = assertThrows(IllegalArgumentException::class.java) {
            varasto.asetaVarastonKoko(-10) }
        assertEquals("koko pitää olla positiivinen", exception.message)
    }

    @Test
    fun asetaVarastonKoko100() {
        assertEquals(100, varasto.asetaVarastonKoko(100))
    }

    @Test
    fun testVarastoSaldo() {
        varasto.asetaVarastonKoko(10)

        varasto.lisaaTuote(TuoteImpl("miekka", 1000, Properties()))
        varasto.lisaaTuote(TuoteImpl("haarniska", 2000, Properties()))
        varasto.lisaaTuote(TuoteImpl("kypärä", 1000, Properties()))

        assertEquals(3, varasto.varastoSaldo())

        varasto.haeTuote("miekka")

        assertEquals(2, varasto.varastoSaldo())
    }

}
