/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.antero.liemipeli.domain.paikat;

import com.antero.liemipeli.domain.Tuote;

/**
 *
 * @author Antero Oikkonen
 */
public interface VarastoInterface {

    Tuote haeTuote(String nimi);
    boolean lisaaTuote(Tuote tuote);
    void asetaVarastonKoko(int koko);
    
}
