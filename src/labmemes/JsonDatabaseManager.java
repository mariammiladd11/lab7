/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labmemes;

/**
 *
 * @author CYBER-TECH
 */
import org.json.JSONArray;
import org.json.JSONObject;
import java.nio.file.*;
import java.io.*;

public class JsonDatabaseManager {

    private static final String USERS_FILE = "users.json";

    public static JSONArray loadUsers() {
        try {
            String content = new String(Files.readAllBytes(Paths.get(USERS_FILE)));
            return new JSONArray(content);
        } catch (Exception e) {
            return new JSONArray(); // file not found → return empty
        }
    }

    public static void saveUsers(JSONArray usersArray) {
        try (FileWriter fw = new FileWriter(USERS_FILE)) {
            fw.write(usersArray.toString(4));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static JSONObject findUserByEmail(String email) {
        JSONArray users = loadUsers();
        for (int i = 0; i < users.length(); i++) {
            JSONObject u = users.getJSONObject(i);
            if (u.getString("email").equalsIgnoreCase(email)) {
                return u;
            }
        }
        return null;
    }
}

