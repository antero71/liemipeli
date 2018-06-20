/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.antero.liemipeli.domain

import com.antero.liemipeli.domain.elaimet.ElavaOlio
import com.antero.liemipeli.opiskelu.Kurssitoteutus
import com.antero.liemipeli.opiskelu.Opintosuoritus
import com.antero.liemipeli.opiskelu.Opiskelija
import java.util.ArrayList
import java.util.Random

/**
 *
 * @author Antero Oikkonen
 */
class Pelaaja(nimi: String) : ElavaOlio, Opiskelija {

    var opinnot: MutableCollection<Opintosuoritus>
    var meneillaanOlevatOpiskelut: MutableCollection<Kurssitoteutus>
    var rahat: Int = 0
    var elava = true

    override val nimi = nimi

    override fun isElava(): Boolean {
        return elava
    }

    init {

        opinnot = ArrayList()
        meneillaanOlevatOpiskelut = ArrayList()
        rahat = Random().nextInt(10000)
    }

    fun addOpinto(opinto: Opintosuoritus) {
        opinnot.add(opinto)
    }



    override fun opiskele() {
        throw UnsupportedOperationException("Not supported yet.") //To change body of generated methods, choose Tools | Templates.
    }

    override fun opiskele(kurssitoteutus: Kurssitoteutus) {
        if (!meneillaanOlevatOpiskelut.contains(kurssitoteutus)) {
            meneillaanOlevatOpiskelut.add(kurssitoteutus)
        }
    }

}

