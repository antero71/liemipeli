package com.antero.liemipeli.domain.taiat

import java.util.*



class SisaelinTaika(override val nimi: String,override val seloste: String) : Taika{

    var raja = 0.5

    override fun taio(): Boolean {
        return (Random().nextDouble() < raja)
    }


}