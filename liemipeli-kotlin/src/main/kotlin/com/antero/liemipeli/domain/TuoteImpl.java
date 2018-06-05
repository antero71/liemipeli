/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.antero.liemipeli.domain;

import java.util.Objects;
import java.util.Properties;

/**
 *
 * @author Antero Oikkonen
 */
public class TuoteImpl implements Tuote{

    private int hinta;
    private String nimi;
    private Properties prop;

    public TuoteImpl( String nimi,int hinta,Properties prop) {
        this.hinta = hinta;
        this.nimi = nimi;
        this.prop=prop;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + this.hinta;
        hash = 67 * hash + Objects.hashCode(this.nimi);
        hash = 67 * hash + Objects.hashCode(this.prop);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final TuoteImpl other = (TuoteImpl) obj;
        if (this.hinta != other.hinta) {
            return false;
        }
        if (!Objects.equals(this.nimi, other.nimi)) {
            return false;
        }
        if (!Objects.equals(this.prop, other.prop)) {
            return false;
        }
        return true;
    }
    
    
    
    
    @Override
    public int getHinta() {
        return hinta;
    }

    @Override
    public void setHinta(int hinta) {
        this.hinta=hinta;
    }

    @Override
    public String getNimi() {
        return nimi;
    }

    @Override
    public Properties getOminaisuudet() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void asetaOminaisuudet(Properties prop) {
       this.prop=prop;
    }

    @Override
    public void setNimi(String  nimi) {
        this.nimi=nimi;
    }
    
}
