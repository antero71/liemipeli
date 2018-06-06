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
public class ListaaKoulut implements Komento{

    private Liemipeli peli;

    public ListaaKoulut(Liemipeli peli) {
        this.peli = peli;
    }
    
    
    
    @Override
    public void suorita() {
        peli.listaaKoulut();
    }

    @Override
    public String tulosta() {
       return "listaa koulut";
    }
    
}
