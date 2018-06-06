/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.antero.liemipeli.ui.text.commands

import com.antero.liemipeli.domain.Liemipeli

/**
 *
 * @author Antero Oikkonen
 */
class ListaaKoulut(private val peli: Liemipeli) : Komento {


    override fun suorita() {
        peli.listaaKoulut()
    }

    override fun tulosta(): String {
        return "listaa koulut"
    }

}
