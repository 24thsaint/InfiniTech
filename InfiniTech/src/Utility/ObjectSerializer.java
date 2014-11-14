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

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Rave Noren Gidor-Sambo Villavicencio-Arevalo
 */
public class ObjectSerializer {

    public static final void serializeObject(String fileLocation, Object object) throws IOException {

        File file = new File(fileLocation);
        if (!file.exists()) {
            file.createNewFile();
        }
        FileOutputStream fos = new FileOutputStream(fileLocation);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(object);

    }

    public static final Object deserializeObject(String fileLocation) throws IOException, ClassNotFoundException {

        File file = new File(fileLocation);
        if (!file.exists()) {
            file.createNewFile();
        }
        FileInputStream fis = new FileInputStream(fileLocation);
        ObjectInputStream ois = new ObjectInputStream(fis);
        return ois.readObject();

    }

}
