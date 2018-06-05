package com.antero.liemipeli.opiskelu

import java.util.*

/**
 *
 * @author Antero Oikkonen
 */
class Harjoitus(var kysymys: String?, vastaus: String) {
    var vastaus: String? = null
        private set

    init {
        this.vastaus = vastaus
    }

    fun vastaa(vastaus: String): Boolean {
        return this.vastaus == vastaus

    }

    fun setOikeaVastaus(vastaus: String) {
        this.vastaus = vastaus
    }
}
