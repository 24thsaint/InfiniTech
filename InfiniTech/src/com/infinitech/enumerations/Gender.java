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
package com.infinitech.enumerations;

/**
 *
 * @author Rave Noren Gidor-Sambo Villavicencio-Arevalo
 */
public enum Gender {

    MALE, FEMALE, GAY, BISEXUAL, LESBIAN, TRANSGENDER;

    @Override
    public String toString() {
        switch (this) {
            case MALE:
                return "Male";
            case FEMALE:
                return "Female";
            case GAY:
                return "Gay";
            case BISEXUAL:
                return "Bisexual";
            case LESBIAN:
                return "Lesbian";
            case TRANSGENDER:
                return "Transgender";
        }
        return "GWAPO SI Jaybee Tordesillas";
    }

}
