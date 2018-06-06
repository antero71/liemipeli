/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.antero.liemipeli.domain.elaimet

import com.antero.liemipeli.domain.Sisaelin
import com.antero.liemipeli.domain.taiat.SisaelinTaika
import com.antero.liemipeli.domain.taiat.Taika

/**
 *
 * @author Antero Oikkonen
 */
class Maksa : Sisaelin {

    override val taikavoima: Taika get() =
        SisaelinTaika("Maksa","taika joka lisää maksan tehoa")
    override val nimi: String get() = "Maksa"

}
