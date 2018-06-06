/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.antero.liemipeli.domain.paikat

import com.antero.liemipeli.domain.Tuote
import java.util.HashMap

/**
 *
 * @author Antero Oikkonen
 */
interface KauppaInterface {

    fun lisaaVarastoon(t: Tuote): Boolean
    fun montaTuotettaOnVarastossa(): Int
    fun osta(nimi: String, maksu: Int): HashMap<Tuote, Int>

}
