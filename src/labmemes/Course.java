package labmemes;


import labmemes.Lesson;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sarahkhaled
 */
public class Course {
    private String courseId;
    private String title;
    private String description;
    private String instructorId;
    private ArrayList<Lesson> lessons = new ArrayList<>();
    private ArrayList<String> students = new ArrayList<>();
}
