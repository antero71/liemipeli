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
public class Kauppa implements KauppaInterface {
    private Varasto varasto;
    
    public Kauppa(Varasto varasto){
        this.varasto=varasto;
    }
    
    @Override
    public HashMap<Tuote,Integer> osta(String nimi, int maksu){
        Tuote t = varasto.haeTuote(nimi);
        HashMap<Tuote,Integer>map=new HashMap();
        if(t.getHinta()<=maksu){
            int vaihtorahat = maksu-t.getHinta();
            map.put(t, vaihtorahat);
            return map;
        }          
        return null;
    }
    
    @Override
    public boolean lisaaVarastoon(Tuote t){
        return varasto.lisaaTuote(t);
    }
}
