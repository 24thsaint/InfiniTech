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
package Settings;

import Utility.ObjectSerializer;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author Rave Noren Gidor-Sambo Villavicencio-Arevalo
 */
public class SettingsTest {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        Settings settings = new Settings();
        settings.addKeyword("SHIRTSIZE", "LARGE");
        settings.addKeyword("SHIRTSIZE", "EXTRA LARGE");
        
        ObjectSerializer.serializeObject("src/Utility/settingsdata.cfg", settings);
        
        Object object = ObjectSerializer.deserializeObject("src/Utility/settingsdata.cfg");
        
        if (object instanceof Settings) {
            settings = (Settings) object;
        }
        
        System.out.println(settings.getKeywords().get("SHIRTSIZE"));
        
    }
}
