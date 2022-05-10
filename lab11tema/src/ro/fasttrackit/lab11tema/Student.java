package ro.fasttrackit.lab11tema;

import java.util.*;

public class Student {
    private final Map<String, Integer> students;

    public Student(Map<String, Integer> students) {
        this.students = students;
    }


    public static void main(String[] args) {
        Map<String, Integer> students = new HashMap<>();

        students.put("student1", 10);
        students.put("student2", 9);
        students.put("student3", 8);
        System.out.println(students);

        //Student studenti = new Student(students);

        //studenti.findStud(students);
        System.out.println();

        int maxValueInMap=(Collections.max(students.values()));
        for (Map.Entry<String, Integer> entry : students.entrySet()) {
            if (entry.getValue() == maxValueInMap) {
                System.out.println("Studentul cu cea mai mare nota: " + entry.getKey());
            }
        }




    }
}
