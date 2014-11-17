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
public enum ShirtSize {

    TS, TM, TL, TXL, S, M, L, XL, CUSTOM;

    @Override
    public String toString() {
        switch (this) {
            case TS:
                return "Teen Small";
            case TM:
                return "Teen Medium";
            case TL:
                return "Teen Large";
            case TXL:
                return "Teen Extra Large";
            case S:
                return "Small";
            case M:
                return "Medium";
            case L:
                return "Large";
            case XL:
                return "Extra Large";
            case CUSTOM:
                return "Custom Size";
        }
        return "Tristan";
    }

}
