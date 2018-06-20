/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.antero.liemipeli.domain

import com.antero.liemipeli.domain.elaimet.ElavaOlio

/**
 *
 * @author Antero Oikkonen
 */
class Vampyyri(override val nimi: String) : ElavaOlio{



    var elava = true

    override fun isElava(): Boolean {
        return elava
    }

}// tarvitsee elääkseen verta säännöllisesti
