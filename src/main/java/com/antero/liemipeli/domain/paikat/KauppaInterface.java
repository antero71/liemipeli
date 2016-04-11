/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.antero.liemipeli.domain.paikat;

import com.antero.liemipeli.domain.Tuote;
import java.util.HashMap;

/**
 *
 * @author Antero Oikkonen
 */
public interface KauppaInterface {

    boolean lisaaVarastoon(Tuote t);
    int montaTuotettaOnVarastossa();
    HashMap<Tuote, Integer> osta(String nimi, int maksu);
    
}
