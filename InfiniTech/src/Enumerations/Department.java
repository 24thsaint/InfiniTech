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
public enum Department {

    ChE, EE, ECE, CE, SE, PkgE, ME;

    @Override
    public String toString() {
        switch (this) {
            case ChE:
                return "Chemical Engineering";
            case EE:
                return "Electrical Engineering";
            case ECE:
                return "Elec'&Comm' Engineering";
            case CE:
                return "Civil Engineering";
            case SE:
                return "Software Engineering <3";
            case PkgE:
                return "Packaging Engineering";
            case ME:
                return "Mechanical Engineering";
        }
        return "Gwapa si Violet";
    }

}
