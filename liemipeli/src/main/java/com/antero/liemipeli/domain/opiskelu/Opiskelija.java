/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.antero.liemipeli.domain.opiskelu;

import com.antero.liemipeli.domain.opiskelu.Kurssitoteutus;

/**
 *
 * @author Antero Oikkonen
 */
public interface Opiskelija {
    void opiskele();
    void opiskele(Kurssitoteutus kurssitoteutus);
}
