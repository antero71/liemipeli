package com.antero.liemipeli.domain

import java.util.*

/**
 *
 * @author Antero Oikkonen
 */
class Ihmissusi(private val moonCalc: MoonCalcInterface) : ElavaOlio() {
    // täydenkuun aikaan muuttuu hirviöksi

    private val fullMoon = "Full"
    private var cal: Calendar? = null

    val isHirvio: Boolean
        get() {
            if (cal == null)
                cal = Calendar.getInstance()
            val paiva = cal!!.get(Calendar.DAY_OF_MONTH)
            val kuukausi = cal!!.get(Calendar.MONTH) + 1
            val vuosi = cal!!.get(Calendar.YEAR)

            val vaihe = moonCalc.moonPhase(vuosi, kuukausi, paiva)
            return fullMoon == moonCalc.phaseName(vaihe)
        }

    constructor(calc: MoonCalcInterface, cal: Calendar) : this(calc) {
        this.cal = cal
    }
}
