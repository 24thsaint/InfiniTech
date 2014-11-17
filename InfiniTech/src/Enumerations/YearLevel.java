/*
 *  ==++++++++++++++++++++++++++++++++++++++++++++++++++++==
 *  |      CENTRAL PHILIPPINE UNIVERSITY                   |
 *  |      Bachelor of Science in Software Engineering     |
 *  |      Jaro, Iloilo City, Philippines                  |
 *  |                                                      |
 *  |          This program is written by Rave, ©2014.     |
 *  |          You are free to use and distribute this.    |
 *  |          Reach me at: admin@blackout.biz.tm          |
 *  |                                                      |
 *  |               ~~~"CODE the FUTURE"~~~                |
 *  ==++++++++++++++++++++++++++++++++++++++++++++++++++++==
 */
package Enumerations;

/**
 *
 * @author Rave Noren Gidor-Sambo Villavicencio-Arevalo
 */
public enum YearLevel {

    FIRST_YEAR, SECOND_YEAR, THIRD_YEAR, FOURTH_YEAR, FIFTH_YEAR, SIXTH_YEAR;

    @Override
    public String toString() {
        switch (this) {
            case FIRST_YEAR:
                return "First Year";
            case SECOND_YEAR:
                return "Second Year";
            case THIRD_YEAR:
                return "Third Year";
            case FOURTH_YEAR:
                return "Fourth Year";
            case FIFTH_YEAR:
                return "Fifth Year";
            case SIXTH_YEAR:
                return "Sixth Year";
        }
        return null;
    }

}
