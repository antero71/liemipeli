/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.antero.liemipeli.domain

import java.util.Properties

/**
 *
 * @author Antero Oikkonen
 */
interface Tuote {
    var hinta: Int
    var nimi: String
    var ominaisuudet: Properties

}
