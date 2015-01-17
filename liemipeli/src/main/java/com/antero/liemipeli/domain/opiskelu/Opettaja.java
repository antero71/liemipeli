/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.antero.liemipeli.domain.opiskelu;

import com.antero.liemipeli.domain.ElavaOlio;
import com.antero.liemipeli.domain.opiskelu.Kurssi;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Antero Oikkonen
 */
public class Opettaja extends ElavaOlio{
    //  opettaja voi olla pätevä opettamaan erilaisia opettavia aineita
    private Collection <Kurssi> opAineet;
    private String oppiarvo;

    public Collection<Kurssi> getOpAineet() {
        return opAineet;
    }

    public void setOpAineet(Collection<Kurssi> opAineet) {
        this.opAineet = opAineet;
    }


    public String getOppiarvo() {
        return oppiarvo;
    }

    public void setOppiarvo(String oppiarvo) {
        this.oppiarvo = oppiarvo;
    }

    public void addKurssi(Kurssi kurssi) {
        if(opAineet==null)
            opAineet=new ArrayList<Kurssi>();
        
        opAineet.add(kurssi);
    }

    
}
