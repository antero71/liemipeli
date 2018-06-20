package com.antero.liemipeli.domain

import com.antero.liemipeli.domain.elaimet.ElavaOlio


/**
 *
 * @author Antero Oikkonen
 */
class Norsu : ElavaOlio, Viisas {


    override val nimi: String?
        get() = "Elephant"

    var elava = true

    override fun isElava(): Boolean {
        return elava
    }

    override fun neuvo(kysymys: String): String {

        return ""
    }

}