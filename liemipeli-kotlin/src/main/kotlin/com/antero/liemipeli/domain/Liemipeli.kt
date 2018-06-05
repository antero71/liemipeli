package com.antero.liemipeli.domain

import com.antero.liemipeli.opiskelu.Koulu
import com.antero.liemipeli.opiskelu.Kurssitoteutus
import com.antero.liemipeli.opiskelu.Opettaja
import org.springframework.beans.BeansException
import org.springframework.beans.factory.BeanFactory
import org.springframework.context.support.ClassPathXmlApplicationContext
import java.util.ArrayList



/**
 *
 * @author Antero Oikkonen
 */
class Liemipeli {

    internal var beanfactory: BeanFactory? = null
    private var koulut: MutableCollection<Koulu>? = null

    private val beanFactory: BeanFactory
        @Throws(BeansException::class)
        get() {
            if (beanfactory == null) {
                beanfactory = ClassPathXmlApplicationContext(
                        "spring-context.xml")
            }
            return beanfactory
        }



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
        beanFactory
        return beanfactory!!.getBean(nimi) as Opettaja
    }

    fun listaaKoulut() {
        for (k in koulut!!) {
            println(k)
        }
    }
}

