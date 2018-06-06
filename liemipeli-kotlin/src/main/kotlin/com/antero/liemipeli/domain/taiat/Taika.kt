/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.antero.liemipeli.domain.taiat

/**
 *
 * @author Antero Oikkonen
 */
interface Taika {
    val nimi: String
    val seloste: String

    /**
     * palauttaa true jos taika onnistuu, muuten false
     * @return
     */
    fun taio(): Boolean
    fun kehita(raja: Double): Double {
        if(raja < 1.0 && raja > -0.1) {
            return raja + 0.05
        }
        return 0.5
    }
}
