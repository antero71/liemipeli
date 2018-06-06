package com.antero.liemipeli.opiskelu

import com.antero.liemipeli.domain.elaimet.ElavaOlio


/**
 *
 * @author Antero Oikkonen
 */
class Opettaja : ElavaOlio() {
    //  opettaja voi olla pätevä opettamaan erilaisia opettavia aineita
    private var opAineet: MutableList<Kurssi>? = null
    var oppiarvo: String? = null

    fun getOpAineet(): List<Kurssi>? {
        return opAineet
    }

    fun setOpAineet(opAineet: MutableList<Kurssi>) {
        this.opAineet = opAineet
    }

    fun addKurssi(kurssi: Kurssi) {
        if (opAineet == null)
            opAineet = ArrayList()

        opAineet!!.add(kurssi)
    }

    override fun toString(): String {
        return "\nOpettajan nimi: ${nimi}\nOppiarvo: ${oppiarvo}\nOppiaineet: ${opAineet}"
    }


}
