/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.antero.liemipeli.domain

import java.util.*

/**
 *
 * @author Antero Oikkonen
 */
class TuoteImpl(override var nimi: String, override var hinta: Int, override var ominaisuudet: Properties) : Tuote
