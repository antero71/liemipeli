/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.antero.liemipeli.domain.paikat

import com.antero.liemipeli.domain.Tuote

/**
 *
 * @author Antero Oikkonen
 */
interface VarastoInterface {

    fun haeTuote(nimi: String): Tuote?
    fun lisaaTuote(tuote: Tuote): Boolean
    fun asetaVarastonKoko(koko: Int): Int
    fun laskeVarastonArvo(): Int
    fun varastoSaldo(): Int

}
