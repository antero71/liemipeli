/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.antero.liemipeli.domain;

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

}
