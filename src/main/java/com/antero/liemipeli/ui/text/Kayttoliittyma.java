/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.antero.liemipeli.ui.text;

import com.antero.liemipeli.domain.Liemipeli;
import com.antero.liemipeli.ui.text.commands.Komento;
import com.antero.liemipeli.ui.text.commands.ListaaKoulut;
import com.antero.liemipeli.ui.text.commands.LopetaKomento;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author Antero Oikkonen
 */
public class Kayttoliittyma {

    private Scanner lukija;
    private Liemipeli peli;

    private Map<String, Komento> komennot = new TreeMap<String, Komento>();

    public Kayttoliittyma(Scanner lukija) {
        this.lukija = lukija;
        peli = new Liemipeli();
        peli.alustaPeli();
        komennot.put("0", new LopetaKomento());
        komennot.put("1", new ListaaKoulut(peli));

    }

    public static void main(String[] args) {
        Kayttoliittyma peli = new Kayttoliittyma(new Scanner(System.in));
        peli.aloita();
    }

    private void aloita() {
        String komento = "0";

        while (true) {

            for (String indeksi : komennot.keySet()) {
                System.out.println(indeksi + ") " + komennot.get(indeksi).tulosta());
            }

            komento = lukija.nextLine();

            Komento k = komennot.get(komento);

            if (k != null) {
                komennot.get(komento).suorita();
            }

        }

    }

}
