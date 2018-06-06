/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.antero.liemipeli.ui.text

import com.antero.liemipeli.domain.Liemipeli
import com.antero.liemipeli.ui.text.commands.Komento
import com.antero.liemipeli.ui.text.commands.ListaaKoulut
import com.antero.liemipeli.ui.text.commands.LopetaKomento
import java.util.Scanner
import java.util.TreeMap

/**
 *
 * @author Antero Oikkonen
 */
class Kayttoliittyma(private val lukija: Scanner) {
    private val peli: Liemipeli

    private val komennot = TreeMap<String, Komento>()

    init {
        peli = Liemipeli()
        peli.alustaPeli()
        komennot["0"] = LopetaKomento()
        komennot["1"] = ListaaKoulut(peli)

    }

    private fun aloita() {
        var komento = "0"

        while (true) {

            for (indeksi in komennot.keys) {
                println(indeksi + ") " + komennot[indeksi]?.tulosta())
            }

            komento = lukija.nextLine()

            val k = komennot[komento]

            if (k != null) {
                komennot[komento]?.suorita()
            }

        }

    }

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            val peli = Kayttoliittyma(Scanner(System.`in`))
            peli.aloita()
        }
    }

}
