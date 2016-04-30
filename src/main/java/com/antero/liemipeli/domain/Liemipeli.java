/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.antero.liemipeli.domain;

import com.antero.liemipeli.domain.opiskelu.Koulu;
import com.antero.liemipeli.domain.opiskelu.Kurssi;
import com.antero.liemipeli.domain.opiskelu.Kurssitoteutus;
import com.antero.liemipeli.domain.opiskelu.Opettaja;
import java.util.ArrayList;
import java.util.Collection;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Antero Oikkonen
 */
public class Liemipeli {

    private Collection<Koulu> koulut;

    public void valitseKoulu() {

    }

    public void alustaPeli() {
        Collection<Opettaja> opettajat = alustaOpettajat();
        Koulu k1 = new Koulu();
        k1.setOpettaja(opettajat);
        k1.setLukukausimaksu(10000);
        k1.setNimi("Walesin velhokoulu");

        for (Opettaja o : opettajat) {
            for (Kurssi k : o.getOpAineet()) {
                Kurssitoteutus ktot = new Kurssitoteutus();
                ktot.setKurssi(k);
                ktot.setOpettaja(o);
                k1.addKurssitoteutus(ktot);
            }
        }

        if (koulut == null) {
            koulut = new ArrayList<Koulu>();
        }

        koulut.add(k1);

    }

    private Collection<Opettaja> alustaOpettajat() {
        Opettaja o1 = luoOpettaja("opettajaSysimetsa");

        
        Kurssi k1 = luoKurssi("liemikurssiperusteet1");
        Kurssi k2 = luoKurssi("liemikurssiperusteet2");
        //luoKurssi("Liementeon perusteet I", 10, 1000);

        o1.addKurssi(k1);
        o1.addKurssi(k2);

        Collection<Opettaja> opettajat = new ArrayList<Opettaja>();
        opettajat.add(o1);

        return opettajat;
    }

    private Opettaja luoOpettaja(String nimi, String oppiarvo) {
        Opettaja o1 = new Opettaja();
        o1.setElava(true);
        o1.setNimi(nimi);
        o1.setOppiarvo(oppiarvo);
        return o1;
    }

    private Kurssi luoKurssi(String nimi) {
        BeanFactory beanfactory = new ClassPathXmlApplicationContext(
                "spring-context.xml");
        return (Kurssi) beanfactory.getBean(nimi);
    }
    
     private Opettaja luoOpettaja(String nimi) {
        BeanFactory beanfactory = new ClassPathXmlApplicationContext(
                "spring-context.xml");
        return (Opettaja) beanfactory.getBean(nimi);
    }
    

    public void listaaKoulut() {
        for (Koulu k : koulut) {
            System.out.println(k);
        }
    }
}
