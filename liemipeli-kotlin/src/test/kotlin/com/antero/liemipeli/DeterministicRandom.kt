/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.antero.liemipeli

import java.util.Random

/**
 *
 * @author Antero Oikkonen
 */
class DeterministicRandom(val luvut: DoubleArray) : Random() {

    internal var indeksi = 0

    override fun nextDouble(): Double {
        val d = luvut[indeksi]
        if (indeksi == luvut.size - 1) {
            indeksi = 0
        } else {
            indeksi++
        }
        return d
    }
}
