/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.antero.liemipeli.domain;

import java.util.Properties;

/**
 *
 * @author Antero Oikkonen
 */
public interface Tuote {
    int getHinta();
    void setHinta(int hinta);
    String getNimi();
    void setNimi(String nimi);
    Properties getOminaisuudet();
    void asetaOminaisuudet(Properties prop);
    
}
