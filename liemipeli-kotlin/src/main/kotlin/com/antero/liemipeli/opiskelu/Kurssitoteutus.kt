package com.antero.liemipeli.opiskelu



/**
 *
 * @author Antero Oikkonen
 */
data class Kurssitoteutus (
    var opettaja: Opettaja? = null,
    var kurssi: Kurssi? = null,
    var kurssinKokonaisPisteet: Int = 0,
    var kurssinEteneminen: Int = 0,
    var harjoitukset: Collection<Harjoitus>? = null)

{
    val isSuoritettu: Boolean
        get() = kurssinEteneminen >= kurssinKokonaisPisteet

    fun montaPistettaPuuttuu(): Int {
        println("kurssinKokonaisPisteet $kurssinKokonaisPisteet:kurssinEteneminen $kurssinEteneminen")
        return kurssinKokonaisPisteet - kurssinEteneminen
    }

    fun opiskele() {
        println("opiskele,kurssinKokonaisPisteet $kurssinKokonaisPisteet:kurssinEteneminen $kurssinEteneminen")

        if (kurssinEteneminen <= kurssinKokonaisPisteet) {
            if (kurssinEteneminen + 10 < kurssinKokonaisPisteet) {
                this.kurssinEteneminen += 10
            } else {
                this.kurssinEteneminen = this.kurssinKokonaisPisteet
            }
        }
        println("kurssinEteneminen $kurssinEteneminen")
    }
}
