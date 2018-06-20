package com.antero.liemipeli.opiskelu

import com.antero.liemipeli.domain.elaimet.ElavaOlio


/**
 *
 * @author Antero Oikkonen
 */
class Opettaja(nimi: String) : ElavaOlio {

    val eleva: Boolean

    override fun isElava(): Boolean {
       return this.eleva
    }

    init {
        eleva = true
    }


    //  opettaja voi olla pätevä opettamaan erilaisia opettavia aineita
    private var opAineet: MutableList<Kurssi>? = null
    var oppiarvo: String? = null
    override val nimi = nimi

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
