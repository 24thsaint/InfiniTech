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

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Rave Noren Gidor-Sambo Villavicencio-Arevalo
 */
public class Settings implements Serializable {

    private Map<String, List<String>> interests;
    private Map<String, String> settings;
    private List<String> shirtSizes;
    public final static String SETTINGS_LOCATION = "src/Settings/settings.cfg";
    private static boolean firstRun = true;

    public final static void programActivated() {
        firstRun = false;
    }

    public final static boolean isFirstRun() {
        return firstRun;
    }

    public Settings() {
        interests = new HashMap<>();
        shirtSizes = new ArrayList<>();
        settings = new HashMap<>();
    }

    public Map<String, List<String>> getInterests() {
        return interests;
    }

    public void updateInterest(String name, List<String> values) {
        String n = name.toUpperCase();
        if (interests.containsKey(n)) {
            interests.get(name).clear();
            interests.get(name).addAll(values);
        } else {
            List<String> data = values;
            interests.put(n, data);
        }
    }

    public void matchInterest(String interest) {
        for (String i : interests.keySet()) {
            List<String> categoryList = interests.get(i);
            for (String s : categoryList) {
                if (s.equals(interest.toUpperCase()));
            }
        }
    }

    public List<String> getShirtSizes() {
        return shirtSizes;
    }

    public void setShirtSizes(List<String> shirtSizes) {
        this.shirtSizes = shirtSizes;
    }

    public Map<String, String> getSettings() {
        return settings;
    }

    public void addSetting(String name, String value) {
        if (settings.containsKey(name)) {
            settings.replace(name, value);
        } else {
            settings.put(name, value);
        }
    }

}
