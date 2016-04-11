/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.antero.liemipeli.domain.paikat;

import com.antero.liemipeli.domain.Tuote;
import com.antero.liemipeli.domain.TuoteImpl;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Antero Oikkonen
 */
public class Varasto implements VarastoInterface {

    private Collection<Tuote> tuotteet = new ArrayList();
    private int koko;

    public Varasto(int koko) {
        this.koko = koko;
    }

    @Override
    public Tuote haeTuote(String nimi) {
        for (Tuote t : tuotteet) {
            if (t.getNimi().equals(nimi)) {
                tuotteet.remove(t);
                return t;
            }
        }
        return null;
    }

    @Override
    public boolean lisaaTuote(Tuote tuote) {
        if (tuotteet.size() == this.koko) {
            return false;
        }
        return tuotteet.add(tuote);
    }

    @Override
    public int asetaVarastonKoko(int koko) {
        if (koko < 0) {
            throw new IllegalArgumentException("koko pitää olla positiivinen");
        }
        if (koko < tuotteet.size()) {
            koko = tuotteet.size();
        }
        this.koko = koko;
        return koko;
    }

    @Override
    public int laskeVarastonArvo() {
        int arvo = 0;
        for (Tuote t : tuotteet) {
            arvo += t.getHinta();
        }
        return arvo;
    }

}
