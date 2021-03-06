package com.viveknaskar.studentdatabaseapp;

import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentId;
    private String courses = null;
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1000;

    //Constructor: prompt user to enter Student's name and year
    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter student first name: ");
        this.firstName = in.nextLine();
        System.out.println("Enter student last name: ");
        this.lastName = in.nextLine();
        System.out.println("1 - First year\n2 - Second year\n3 - Third year\n4 - Final year\n" +
                "Enter student grade year: ");
        this.gradeYear = in.nextInt();

        setStudentId();
        System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentId);

    }

    //Generate a unique student ID
    private void setStudentId() {
        // StudentId = Grade level + Id
        id++;
        this.studentId =  gradeYear + " " + id;
    }

    //Enroll in courses
    public void enroll() {
        // Get inside the loop, user hits 0
        do {
            System.out.print("Enter course to enroll (Q to quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();

            if (!course.equals("Q")) {
                courses += "\n" + course;
                tuitionBalance += costOfCourse;
            } else {
                break;
            }
        } while (1 != 0);
        System.out.println("Enrolled in " + courses);
        System.out.println("Tuition Balance is " + tuitionBalance);
    }

    //View Balance

    //Pay tuition

}
