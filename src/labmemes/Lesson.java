package labmemes;

import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sarahkhaled
 */
public class Lesson {
    private String lessonId;
    private String title;
    private String content;
     private List<String> resources; // optional resources
    private boolean completed; // track if lesson is completed

    public Lesson(String lessonId, String title, String content, List<String> resources) {
        this.lessonId = lessonId;
        this.title = title;
        this.content = content;
        this.resources = resources;
        this.completed = false;
    }

    // Getters and setters
    public String getLessonId() { return lessonId; }
    public String getTitle() { return title; }
    public String getContent() { return content; }
    public List<String> getResources() { return resources; }
    public boolean isCompleted() { return completed; }
    public void setCompleted(boolean completed) { this.completed = completed; }

    @Override
    public String toString() {
        return title + (completed ? " ✅" : "");
    }
    
    
    
}
