package com.antero.liemipeli.domain

import com.antero.liemipeli.opiskelu.Kurssi


/**
 * Liemillä on erilaisia ominaisuuksia, kuten esimerkiksi tietty liemi voidaan
 * valmistaa vain jos on käyty tietty opintokurssi ja saatu se suoritettua
 * tietyllä arvosanalla. Jotkut liemet voidaan valmistaa ilman tarvittavia
 * opintoja jos on toinen sopiva taikaliemi tehostamaan liemitaitoja
 *
 * @author Antero Oikkonen
 */
class Liemi {

    val aineet: Collection<Aine>? = null
    val vaadittavatOpinnot: Collection<Kurssi>? = null
    val liemitaitojenTehostaja: Liemi? = null
}
