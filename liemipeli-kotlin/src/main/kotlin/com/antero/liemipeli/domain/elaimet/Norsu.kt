package com.antero.liemipeli.domain

import com.antero.liemipeli.domain.elaimet.ElavaOlio


/**
 *
 * @author Antero Oikkonen
 */
class Norsu : ElavaOlio(), Viisas {

    override fun neuvo(kysymys: String): String {

        return ""
    }

}