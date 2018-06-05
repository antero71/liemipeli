package com.antero.liemipeli.opiskelu

/**
 *
 * @author Antero Oikkonen
 */
class Kurssi {
    var kurssinNimi: String? = null
    var opintopisteet: Int = 0
    var kurssinHinta: Int = 0

    override fun toString(): String {
        return "\nKurssin nimi: $kurssinNimi\nkurssin hinta: $kurssinHinta\nopintopisteet $opintopisteet"
    }
}

