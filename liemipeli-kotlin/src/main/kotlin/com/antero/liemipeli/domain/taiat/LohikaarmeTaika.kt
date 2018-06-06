/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.antero.liemipeli.domain.taiat

import com.antero.liemipeli.domain.Aine
import com.antero.liemipeli.domain.Valmistusaineet
import java.util.*

/**
 *
 * @author Antero Oikkonen
 */
class LohikaarmeTaika(r: Random) : Taika {

    private var r = Random()
    var aine1 = Aine(nimi="Kuusenkerkkä",selostus = "kuuden nuori kasvuosa",hinta = 10,vahvuus = 100)
    var aine2 = Aine(nimi="Variksen sulka",selostus = "variksen poikasen ensimmäinen höyden",hinta = 10,vahvuus = 9)
    var aine3 = Aine(nimi="Aamu-usvaa",selostus = "Vettä, joka on kerätty aamu-usvan aikaan",hinta = 100,vahvuus = 89)
    val valmistusaineet = Valmistusaineet("Lohikäärmeen tyrmäystipat",listOf(aine1,aine2,aine3))

    init {
        this.r = r


    }


    override fun taio(): Boolean {
        return 0.5 > r.nextDouble()
    }

    override val seloste: String get()=
        "Lohikäärmeen taikomis taika"


    override val nimi: String get()=
        "Lohikäärmetaika"

}
