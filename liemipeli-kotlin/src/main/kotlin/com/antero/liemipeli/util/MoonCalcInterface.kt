package com.antero.liemipeli.util

/**
 *
 * @author Antero Oikkonen
 */
interface MoonCalcInterface {

    // MoonPhase
    //
    // Output the phase of the moon for the given year, month, day.
    // The routine calculates the year's epact (the age of the moon on Jan 1.),
    // adds this to the number of days in the year, and calculates the phase
    // of the moon for this date.
    //
    // In the algorithm:
    //
    //      diy     Is the day of the year - 1 (i.e., Jan 1 is day 0).
    //
    //      golden  Is the number of the year in the Mentonic cycle, used to
    //              determine the position of the calender moon.
    //
    //      epact   Is the age of the calender moon (in days) at the beginning
    //              of the year.  To calculate epact, two century-based
    //              corrections are applied:
    //              Gregorian:      (3 * cent)/4 - 12
    //                      is the number of years such as 1700, 1800 when
    //                      leap year was not held.
    //              Clavian:        (((8 * cent) + 5) / 25) - 5
    //                      is a correction to the Mentonic cycle of about
    //                      8 days every 2500 years.  Note that this will
    //                      overflow 16 bits in the year 409600.  Beware.
    //
    // The algorithm is accurate for the Gregorian calender only.
    //
    // The magic numbers used in the phase calculation are as follows:
    //       29.5           The moon's period in days.
    //      177             29.5 scaled by 6
    //       22             (29.5 / 8) scaled by 6 (this gets the phase)
    //       11             ((29.5 / 8) / 2) scaled by 6
    //
    // Theoretically, this should yield a number in the range 0 .. 7.  However,
    // two days per year, things don't work out too well.
    //
    // Epact is calculated by the algorithm given in Knuth vol. 1 (calculation
    // of Easter).  See also the article on Calenders in the Encyclopaedia
    // Britannica and Knuth's algorithm in CACM April 1962, page 209.
    //
    // Arguments to the function are:
    //
    // int     year     1978 = 1978
    // int     month    Jan = 1
    // int     day      1 = 1
    fun moonPhase(year: Int, month: Int, day: Int): Int

    // phaseName
    //
    // Return the name of a given phase
    fun phaseName(phase: Int): String

}
