/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.antero.liemipeli.domain.opiskelu;

import java.util.Objects;

/**
 *
 * @author Antero Oikkonen
 */
public class Harjoitus {
    private String kysymys;
    private String vastaus;

    public Harjoitus(String kysymys, String vastaus) {
        this.kysymys = kysymys;
        this.vastaus = vastaus;
    }
    
    public boolean vastaa(String vastaus){
        return this.vastaus.equals(vastaus);
         
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

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + Objects.hashCode(this.kysymys);
        hash = 47 * hash + Objects.hashCode(this.vastaus);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Harjoitus other = (Harjoitus) obj;
        if (!Objects.equals(this.kysymys, other.kysymys)) {
            return false;
        }
        if (!Objects.equals(this.vastaus, other.vastaus)) {
            return false;
        }
        return true;
    }
    
    
}
