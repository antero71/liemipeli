package com.antero.liemipeli.opiskelu

import java.util.ArrayList



/**
 *
 * @author Antero Oikkonen
 */
class Koulu {

    var nimi: String? = null
    var opettaja: Collection<Opettaja>? = null
    private var kurssiToteutukset: MutableCollection<Kurssitoteutus>? = null
    var lukukausimaksu: Int = 0

    fun getKurssiToteutukset(): Collection<Kurssitoteutus>? {
        return kurssiToteutukset
    }

    fun setKurssiToteutukset(kurssiToteutukset: MutableCollection<Kurssitoteutus>) {
        this.kurssiToteutukset = kurssiToteutukset
    }

    /**
     * lisätään `Kurssitoteutus`
     *
     * @param ktot
     */
    fun addKurssitoteutus(ktot: Kurssitoteutus) {
        if (this.kurssiToteutukset == null) {
            kurssiToteutukset = ArrayList()
        }
        kurssiToteutukset!!.add(ktot)
    }

    override fun toString(): String {
        return "$nimi,$opettaja, lukukausimaksu $lukukausimaksu"
    }
}
