/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.antero.liemipeli.domain;

import com.antero.liemipeli.domain.taiat.Taika;

/**
 *
 * @author Antero Oikkonen
 */
public class Maksa implements Sisaelin {

    private Taika taika;

    public void setTaika(Taika taika) {
        this.taika = taika;
    }

    @Override
    public String getNimi() {
        return "maksa";
    }

    @Override
    public Taika getTaikavoima() {
        return taika;
    }

    @Override
    public int hashCode() {
        int hash = 7;
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
        final Maksa other = (Maksa) obj;
        return true;
    }
    
    

}
