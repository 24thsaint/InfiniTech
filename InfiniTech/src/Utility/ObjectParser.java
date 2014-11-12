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
package Utility;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Rave Noren Gidor-Sambo Villavicencio-Arevalo
 */
public class ObjectParser {

    public static final List<String> parseDelimitedStringToList(String sizes, String delimiter) {        
        List<String> response = new ArrayList<>();
        Scanner scn = new Scanner(sizes);
        scn.useDelimiter(delimiter);
        while (scn.hasNext()) {
            response.add(scn.next());
        }        
        return response;
    }
    
    public static final String parseListToDelimiter(List<String> string, String delimiter) {
        StringBuilder sb = new StringBuilder();
        for (String s : string) {
            sb.append(s);
            sb.append(delimiter);
        }
        return sb.toString();
    }
}
