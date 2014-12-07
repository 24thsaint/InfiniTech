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
public enum LogType {

    NORMAL, LOGIN, LOGOUT, REGISTRATION;

    @Override
    public String toString() {
        switch (this) {
            case NORMAL:
                return "Normal";
            case LOGIN:
                return "Login";
            case LOGOUT:
                return "Logout";
            case REGISTRATION:
                return "Register Transaction";
        }
        return "hahahaha";
    }

}
