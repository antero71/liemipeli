/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.antero.liemipeli.domain.elaimet

import com.antero.liemipeli.domain.Sisaelin
import com.antero.liemipeli.domain.taiat.Taika

/**
 *
 * @author Antero Oikkonen
 */
class Lohikaarme : ElavaOlio() {

    /**
     * jos lohikäärme on kuollut, palauttaa maksan (jos ei ole jo otettu),
     * muuten null:in
     */
    var maksa: Sisaelin? = null
        get() {
            if (!isElava) {
                val s = field
                this.maksa = null
                return s
            } else {
                return null
            }
        }

    init {
        this.maksa = Maksa()
    }

    /**
     * jos on sopiva taika niin sisäelimen voi ottaa lohikääremeeltä taian
     * avulla ja se pysyy hengissä (sisäelin monistetaan). Kuolleelta voi myös
     * ottaa sisäelimen, elävältä ei ilman oikeaa taikaa
     *
     * @param taika
     * @param elin
     * @return
     */
    fun otaSisaelin(taika: Taika?, elin: Sisaelin): Sisaelin? {
        if (isElava && taika != null && taika.taio()) {
            return Maksa()
        } else if (!isElava) {
            if (elin is Maksa) {
                return maksa
            }
        }
        return null
    }

}
