/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.antero.liemipeli.ui.text.commands;

import com.antero.liemipeli.domain.Liemipeli;

/**
 *
 * @author Antero Oikkonen
 */
public class ValitseKoulu implements Komento{

    private Liemipeli peli;

    public ValitseKoulu(Liemipeli peli) {
        this.peli = peli;
    }
    
    
    
    @Override
    public void suorita() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String tulosta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
