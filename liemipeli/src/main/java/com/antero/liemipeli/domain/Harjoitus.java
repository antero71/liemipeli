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
public class Harjoitus {
    private String kysymys;
    private String vastaus;

    public String vastaa(String vastaus){
        if(this.vastaus.equals(vastaus))
            return "Oikea vastaus";
        else
            return "Väärä vastaus";
    }
    
    public String getKysymys() {
        return kysymys;
    }

    public void setKysymys(String kysymys) {
        this.kysymys = kysymys;
    }

    public String getVastaus() {
        return vastaus;
    }

    public void setOikeaVastaus(String vastaus) {
        this.vastaus = vastaus;
    }
    
    
}
