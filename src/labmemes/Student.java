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

public class Student extends User {
    private ArrayList<String> enrolledCourses = new ArrayList<>();

    public Student(String userId, String username, String email, String passwordHash) {
        super(userId, "student", username, email, passwordHash);
    }

    public ArrayList<String> getEnrolledCourses() { return enrolledCourses; }
}
