/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.antero.liemipeli.domain.test;

import java.util.Random;

/**
 *
 * @author Antero Oikkonen
 */
public class DeterministicRandom extends Random {

    double[] luvut;
    int indeksi = 0;

    public void setLuvut(double[] luvut) {
        this.luvut = luvut;
    }

    @Override
    public double nextDouble() {
        double d = luvut[indeksi];
        if (indeksi == (luvut.length - 1)) {
            indeksi = 0;
        } else {
            indeksi++;
        }

        return d;
    }

}
