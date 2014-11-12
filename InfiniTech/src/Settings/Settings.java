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

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Rave Noren Gidor-Sambo Villavicencio-Arevalo
 */
public class Settings implements Serializable{
    private Map<String, List<String>> keywords;

    public Settings() {
        keywords = new HashMap<>();
    }

    public Map<String, List<String>> getKeywords() {
        return keywords;
    }

    public void addKeyword(String name, String value) {
        if(keywords.containsKey(name)) {
            keywords.get(name).add(value);
        } else {
            List<String> data = new ArrayList<>();
            data.add(value);
            keywords.put(name, data);
        }
    }
    
    
    
}
