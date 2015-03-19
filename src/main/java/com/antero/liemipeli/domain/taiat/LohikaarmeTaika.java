/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.antero.liemipeli.domain.taiat;

import java.util.Random;

/**
 *
 * @author Antero Oikkonen
 */
public class LohikaarmeTaika implements Taika{

    private Random r = new Random();

    public LohikaarmeTaika(Random r) {
        this.r=r;
    }
    
    
    
    @Override
    public boolean taio() {
        return 0.5 > r.nextDouble();
    }

    @Override
    public String getSeloste() {
        return "Lohikäärmeen taikomis taika";
    }

    @Override
    public String getNimi() {
        return "Lohikäärmetaika";
    }
    
}
