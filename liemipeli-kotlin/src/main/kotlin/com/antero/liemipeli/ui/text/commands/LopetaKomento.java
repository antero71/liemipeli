/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.antero.liemipeli.ui.text.commands;


/**
 *
 * @author Antero Oikkonen
 */
public class LopetaKomento implements Komento{

    @Override
    public void suorita() {
        System.exit(0);
    }

    @Override
    public String tulosta() {
        return "lopeta";
    }
    
}
