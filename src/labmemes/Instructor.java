/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labmemes;

/**
 *
 * @author CYBER-TECH
 */
import java.util.ArrayList;

public class Instructor extends User {
    private ArrayList<String> createdCourses = new ArrayList<>();

    public Instructor(String userId, String username, String email, String passwordHash) {
        super(userId, "instructor", username, email, passwordHash);
    }

    public ArrayList<String> getCreatedCourses() { return createdCourses; }
}
