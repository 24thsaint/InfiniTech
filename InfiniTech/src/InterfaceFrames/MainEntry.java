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
package InterfaceFrames;

import InterfaceFrames.LoginSystem.GodInterface;
import InterfaceFrames.LoginSystem.LoginInterface;
import Objects.Council;
import java.util.List;

/**
 *
 * @author Rave Noren Gidor-Sambo Villavicencio-Arevalo
 */
public class MainEntry {

    public static void main(String[] args) {
        List<Council> council = Council.getCouncilFinder().findAll();
        if (council.isEmpty()) {
            GodInterface godInterface = new GodInterface();
            godInterface.setVisible(true);
        } else {
            LoginInterface loginInterface = new LoginInterface();
            loginInterface.setVisible(true);
        }
    }
}
