package com.antero.liemipeli.domain

import com.antero.liemipeli.opiskelu.Koulu
import com.antero.liemipeli.opiskelu.Kurssitoteutus
import com.antero.liemipeli.opiskelu.Opettaja
import java.util.ArrayList



/**
 *
 * @author Antero Oikkonen
 */
class Liemipeli {

    private var koulut: MutableCollection<Koulu>? = null

    fun alustaPeli() {
        val opettajat = alustaOpettajat()
        val k1 = Koulu()
        k1.opettaja=opettajat
        k1.lukukausimaksu=10000
        k1.nimi="Walesin velhokoulu"

        for (o in opettajat) {

                for (k in o.getOpAineet()!!.toList()) {
                    val ktot = Kurssitoteutus()
                    ktot.kurssi = k
                    ktot.opettaja = o
                    k1.addKurssitoteutus(ktot)
                }

        }

        if (koulut == null) {
            koulut = ArrayList()
        }

        koulut!!.add(k1)

    }

    private fun alustaOpettajat(): Collection<Opettaja> {
        val o1 = luoOpettaja("opettajaSysimetsa")
        val o2 = luoOpettaja("opettajaTaikanen")

        val opettajat = ArrayList<Opettaja>()
        opettajat.add(o1)
        opettajat.add(o2)

        return opettajat
    }

    private fun luoOpettaja(nimi: String): Opettaja {
        //beanFactory
        //return beanfactory.getBean(nimi) as Opettaja
        return Opettaja(nimi)
    }

    fun listaaKoulut() {
        for (k in koulut!!) {
            println(k)
        }
    }
}

