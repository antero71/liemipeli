/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.antero.liemipeli.domain.paikat

import com.antero.liemipeli.domain.Tuote
import java.util.HashMap

/**
 *
 * @author Antero Oikkonen
 */
class Kauppa(private val varasto: Varasto) : KauppaInterface {

    override fun osta(nimi: String, maksu: Int): HashMap<Tuote, Int> {
        val haettuTuote = varasto.haeTuote(nimi)
        val map = HashMap<Tuote,Int>()
        // TODO korjaa, haettu tuote voi olla null

        if (haettuTuote!= null && haettuTuote.hinta <= maksu) {
            val vaihtorahat = maksu - haettuTuote.hinta
            map.put(haettuTuote, vaihtorahat)
            return map
        }

        return HashMap()
    }

    override fun lisaaVarastoon(t: Tuote): Boolean {
        return varasto.lisaaTuote(t)
    }

    override fun montaTuotettaOnVarastossa(): Int {
        return varasto.varastoSaldo()
    }


}
