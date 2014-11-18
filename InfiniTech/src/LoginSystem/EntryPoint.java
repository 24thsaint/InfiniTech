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
package LoginSystem;

import Controllers.CouncilJpaController;
import Controllers.EMFactory;
import Controllers.LogJpaController;
import Controllers.ShirtJpaController;
import Controllers.StudentJpaController;
import Settings.Settings;
import Utility.ObjectSerializer;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author Rave Noren Gidor-Sambo Villavicencio-Arevalo
 */
public class EntryPoint {

    private final static CouncilJpaController COUNCIL_CONTROL = new CouncilJpaController(EMFactory.getEMF());
    private final static LogJpaController LOG_CONTROL = new LogJpaController(EMFactory.getEMF());
    private final static ShirtJpaController SHIRT_CONTROL = new ShirtJpaController(EMFactory.getEMF());
    private final static StudentJpaController STUDENT_CONTROL = new StudentJpaController(EMFactory.getEMF());    

    public static CouncilJpaController getCouncilControl() {
        return COUNCIL_CONTROL;
    }

    public static LogJpaController getLogControl() {
        return LOG_CONTROL;
    }

    public static ShirtJpaController getShirtControl() {
        return SHIRT_CONTROL;
    }

    public static StudentJpaController getStudentControl() {
        return STUDENT_CONTROL;
    }
    
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file = new File(Settings.SETTINGS_LOCATION);
        if (file.exists()) {
            new LoginInterface().setVisible(true);
        } else {
            new GodInterface().setVisible(true);
        }
    }
}
