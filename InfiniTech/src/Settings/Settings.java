/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Settings;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Scanner;

/**
 *
 * @author Rave
 */
public class Settings {

    private Map<String, List<String>> keywords;
    private Properties settings;
    InputStream keywordsFile;

    public Settings() throws FileNotFoundException, IOException {
        keywords = new HashMap<>();
        settings = new Properties();
        settings.load(new FileInputStream("src/Settings/settings.cfg"));
        keywordsFile = new FileInputStream("src/Settings/keywords.cfg");
        Scanner interests = new Scanner(keywordsFile);
        interests.useDelimiter(";");
        while (interests.hasNext()) {
            Scanner category = new Scanner(interests.next());
            category.useDelimiter("=");
            String parsedCategory = category.next();
            List<String> keywordCategory = new ArrayList<>();
            keywords.put(parsedCategory, keywordCategory);
            while (category.hasNext()) {
                Scanner key = new Scanner(category.next());
                key.useDelimiter(",");
                while (key.hasNext()) {
                    this.keywords.get(parsedCategory).add(key.next());
                }
            }
        }
    }

    public void addProperty(String name, String value) throws IOException {
        if (settings.containsKey(name)) {
            settings.setProperty(name, value);            
        } else {
            settings.put(name, value);
        }
        settings.store(new FileWriter("src/Settings/settings.cfg"), "Updated on: " + new Date().toString());
    }

    public Object getProperty(String name) {
        return settings.get(name);
    }

    public void addCategory(String category) {
        keywords.put(category, new ArrayList<String>());
    }

    public void addKeyword(String category, String keywords) {
        this.keywords.remove(category);
        this.keywords.put(category, new ArrayList());
        Scanner keys = new Scanner(keywords);
        keys.useDelimiter("\n");
        while (keys.hasNext()) {
            this.keywords.get(category).add(keys.next());
        }
    }

    public List<String> getKeywords() {
        List<String> words = new ArrayList<>();
        for (String s : keywords.keySet()) {
            for (String key : keywords.get(s)) {
                words.add(key);
            }
        }
        return words;
    }

    public List<String> getKeywords(String s) {
        List<String> response = keywords.get(s);
        return response;
    }

    public List<String> getCategories() {
        List<String> response = new ArrayList<>();
        for (String key : keywords.keySet()) {
            response.add(key);
        }
        return response;
    }

    public String keywordMatch(String keyword) {
        for (String s : keywords.keySet()) {
            for (String category : keywords.get(s)) {
                if (category.contains(keyword)) {
                    return s;
                }
            }
        }
        return null;
    }

    public boolean deleteCategory(String category) {
        if (keywords.containsKey(category)) {
            keywords.remove(category);
            return true;
        }
        return false;
    }

    public boolean updateKeywordFile() {
        try {

            StringBuilder sb = new StringBuilder();
            for (String category : keywords.keySet()) {
                sb.append(category);
                sb.append("=");
                for (String key : keywords.get(category)) {
                    sb.append(key);
                    sb.append(",");
                }
                sb.append(";");
            }

            String content = sb.toString();

            System.out.println(content);

            File file = new File("src/Settings/keywords.cfg");

            if (file.exists()) {
                file.delete();
            }

            file.createNewFile();

            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(content);
            bw.close();

            return true;
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

}
