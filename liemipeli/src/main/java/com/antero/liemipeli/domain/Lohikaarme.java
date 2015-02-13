/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.antero.liemipeli.domain;

/**
 *
 * @author Antero Oikkonen
 */
public class Lohikaarme extends ElavaOlio {

    private Sisaelin maksa;

    public Lohikaarme() {
        maksa = new Maksa();
    }

    
    
    
    /**
     * jos lohikäärme on kuollut, palauttaa maksan (jos ei ole jo otettu),
     * muuten null:in
     */
    public Sisaelin getMaksa() {
        if (!isElava()) {
            Sisaelin s = maksa;
            maksa = null;
            return s;
        } else {
            return null;
        }
    }

    public void setMaksa(Sisaelin maksa) {
        this.maksa = maksa;
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
    public Sisaelin otaSisaelin(Taika taika, Sisaelin elin) {
        if (isElava() && taika != null && taika.taio()) {
            return new Maksa();
        } else if (!isElava()) {
            if (elin instanceof Maksa) {
                return getMaksa();
            }
        }
        return null;
    }

}
