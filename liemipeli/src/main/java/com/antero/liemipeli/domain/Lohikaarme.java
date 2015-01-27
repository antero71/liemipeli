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

    public Sisaelin getMaksa() {
        return maksa;
    }

    public void setMaksa(Sisaelin maksa) {
        this.maksa = maksa;
    }

    /**
     * jos on sopiva taika niin sisäelimen voi ottaa lohikääremeeltä taian 
     * avalla ja se pysyy hengissä (sisäelin monistetaan). Kuolleelta voi myös ottaa
     * sisäelimen, elävältä ei ilman oikeaa taikaa
     * @param taika
     * @param elin
     * @return 
     */
    
    public Sisaelin otaSisaelin(Taika taika, Sisaelin elin) {
        if (isElava() && taika != null && taika.taio()) {
            return new Maksa();
        }else if(!isElava()){
            return maksa;
        }
        return null;
    }

}
