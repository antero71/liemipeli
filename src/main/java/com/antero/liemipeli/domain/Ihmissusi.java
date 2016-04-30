/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.antero.liemipeli.domain;

import java.util.Calendar;

/**
 *
 * @author Antero Oikkonen
 */
public class Ihmissusi extends ElavaOlio{
    // täydenkuun aikaan muuttuu hirmuolioksi
    
    private String fullMoon = "Full";
    private MoonCalcInterface moonCalc;
    private Calendar cal;
    
    public Ihmissusi(MoonCalcInterface calc){
        moonCalc=calc;
    }

    public Ihmissusi(MoonCalcInterface calc, Calendar cal) {
        this(calc);
        this.cal=cal;
        
    }
    
    public boolean isHirvio(){
        if(cal==null)
            cal = Calendar.getInstance();
        int paiva=cal.get(Calendar.DAY_OF_MONTH);
        int kuukausi = cal.get(Calendar.MONTH)+1;
        int vuosi = cal.get(Calendar.YEAR);
        
        int vaihe = moonCalc.moonPhase(vuosi, kuukausi, paiva);
        return fullMoon.equals(moonCalc.phaseName(vaihe));    
    }
    
}
