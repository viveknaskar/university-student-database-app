package com.viveknaskar.studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {

    public static void main(String[] args) {

        //How many students need to be added?
        System.out.print("Enter the number of students to be enrolled:");
        Scanner in = new Scanner(System.in);
        int numOfStudents = in.nextInt();
        Student[] students = new Student[numOfStudents];

        //Create number of students
        for(int n=0; n < numOfStudents; n++) {

            students[n] = new Student();
            students[n].enroll();
            students[n].payTuition();
            System.out.println(students[n].toString());

        }

    }
}
