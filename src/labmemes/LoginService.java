/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labmemes;

import org.json.JSONObject;

/**
 *
 * @author CYBER-TECH
 */
public class LoginService {

    public static User login(String email, String password) {
        JSONObject obj = JsonDatabaseManager.findUserByEmail(email);
        if (obj == null) return null;

        String hash = SignupService.hashPassword(password);
        if (!obj.getString("passwordHash").equals(hash)) {
            return null; // wrong password
        }

        // Create object based on role
        if (obj.getString("role").equals("student")) {
            return new Student(
                obj.getString("userId"),
                obj.getString("username"),
                obj.getString("email"),
                obj.getString("passwordHash")
            );
        } else {
            return new Instructor(
                obj.getString("userId"),
                obj.getString("username"),
                obj.getString("email"),
                obj.getString("passwordHash")
            );
        }
    }
}

