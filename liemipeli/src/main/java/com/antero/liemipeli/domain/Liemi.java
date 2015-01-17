/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.antero.liemipeli.domain;

import com.antero.liemipeli.domain.opiskelu.Kurssi;
import java.util.Collection;

/**
 * Liemillä on erilaisia ominaisuuksia, kuten esimerkiksi tietty liemi voidaan
 * valmistaa vain jos on käyty tietty opintokurssi ja saatu se suoritettua
 * tietyllä arvosanalla. Jotkut liemet voidaan valmistaa ilman tarvittavia
 * opintoja jos on toinen sopiva taikaliemi tehostamaan liemitaitoja
 *
 * @author Antero Oikkonen
 */
public class Liemi {

    private Collection<Aine> aineet;
    private Collection<Kurssi> vaadittavatOpinnot;
    private Liemi liemitaitojenTehostaja; 
}
