/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.antero.liemipeli.domain.paikat

import com.antero.liemipeli.domain.Tuote
import java.util.*

/**
 *
 * @author Antero Oikkonen
 */
class Varasto(private var koko: Int) : VarastoInterface {

    private val tuotteet = ArrayList<Tuote>()


    override fun haeTuote(nimi: String): Tuote? {
        for (t in tuotteet) {
            if (t.nimi == nimi) {
                tuotteet.remove(t)
                return t
            }
        }
        return null
    }

    override fun lisaaTuote(tuote: Tuote): Boolean {
        return if (tuotteet.size == this.koko) {
            false
        } else tuotteet.add(tuote)
    }

    override fun asetaVarastonKoko(vkoko: Int): Int {

        var tempKoko = vkoko

        if (vkoko < 0) {
            throw IllegalArgumentException("koko pitää olla positiivinen")
        }
        if (vkoko < tuotteet.size) {
            tempKoko = tuotteet.size
        }
        this.koko = tempKoko
        return this.koko
    }

    /**
     * mikä on varaston arvo
     */
    override fun laskeVarastonArvo(): Int {
        var arvo = 0
        for (t in tuotteet) {
            arvo += t.hinta
        }
        return arvo
    }

    /**
     * monta tuotetta on varastossa
     * @return
     */

    override fun varastoSaldo(): Int {
        return tuotteet.size
    }

}
