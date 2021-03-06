package com.viveknaskar.studentdatabaseapp;

import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private int gradeYear;
    private int studentId;
    private String courses;
    private int tuitionBalance;
    private int costOfCourse = 600;

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

        System.out.println(firstName + " " + lastName + " " + gradeYear);
    }

    //Generate an ID

    //Enroll in courses

    //View Balance

    //Pay tuition

}
