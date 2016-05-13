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
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Antero Oikkonen
 */
public class Liemipeli {

    BeanFactory beanfactory;
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
            koulut = new ArrayList();
        }

        koulut.add(k1);

    }

    private Collection<Opettaja> alustaOpettajat() {
        Opettaja o1 = luoOpettaja("opettajaSysimetsa");
        Opettaja o2 = luoOpettaja("opettajaTaikanen");

        Collection<Opettaja> opettajat = new ArrayList<>();
        opettajat.add(o1);
        opettajat.add(o2);

        return opettajat;
    }
    
    private Opettaja luoOpettaja(String nimi) {
        getBeanFactory();
        return (Opettaja) beanfactory.getBean(nimi);
    }

    private BeanFactory getBeanFactory() throws BeansException {
        if (beanfactory == null) {
            beanfactory = new ClassPathXmlApplicationContext(
                    "spring-context.xml");
        }
        return beanfactory;
    }

    public void listaaKoulut() {
        for (Koulu k : koulut) {
            System.out.println(k);
        }
    }
}
