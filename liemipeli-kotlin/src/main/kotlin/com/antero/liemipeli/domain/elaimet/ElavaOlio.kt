package com.antero.liemipeli.domain.elaimet

/**
 *
 * @author Antero Oikkonen
 */
interface ElavaOlio {
    val nimi: String?
    fun isElava(): Boolean
    val pituus: Double
        get() = 1.7
    val paino: Double
        get() = 62.9
}

