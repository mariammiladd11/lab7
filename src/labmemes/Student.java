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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student extends User {
    private ArrayList<String> enrolledCourses = new ArrayList<>();
 // progress: courseId → list of completed lessonIds
    private Map<String, List<String>> progress = new HashMap<>();
    public Student(String userId, String username, String email, String passwordHash) {
        super(userId, "student", username, email, passwordHash);
    }
    public Map<String, List<String>> getProgress() {
    return progress;
}

    public ArrayList<String> getEnrolledCourses() { return enrolledCourses; }
    // -----------------------------
    // Enrollment Features (Q3)
    // -----------------------------

    // Enroll in a course
    public void enrollCourse(String courseId) {
        if (!enrolledCourses.contains(courseId)) {
            enrolledCourses.add(courseId);
            progress.put(courseId, new ArrayList<>()); // start blank progress
        }
    }

    

    // -----------------------------
    // Lesson Progress Features
    // -----------------------------

    // Mark a lesson as completed
    public void markLessonCompleted(String courseId, String lessonId) {
        if (!progress.containsKey(courseId)) {
            progress.put(courseId, new ArrayList<>());
        }

        List<String> completedLessons = progress.get(courseId);

        if (!completedLessons.contains(lessonId)) {
            completedLessons.add(lessonId);
        }
    }

    // Retrieve completed lessons for a course
    public List<String> getCompletedLessons(String courseId) {
        return progress.getOrDefault(courseId, new ArrayList<>());
    }

    // -----------------------------
    // POLYMORPHISM (Q3 Requirement)
    // -----------------------------
   
    public void openDashboard() {
        // This will open the student dashboard UI in Swing
        // Example: new StudentDashboardFrame(this).setVisible(true);
        System.out.println("Opening Student Dashboard for " + getUsername());
    }

    @Override
    public String toString() {
        return "Student: " + username + " (ID: " + userId + ")";
    }
}
