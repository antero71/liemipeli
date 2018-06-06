/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.antero.liemipeli.ui.text.commands


/**
 *
 * @author Antero Oikkonen
 */
class LopetaKomento : Komento {

    override fun suorita() {
        System.exit(0)
    }

    override fun tulosta(): String {
        return "lopeta"
    }

}
