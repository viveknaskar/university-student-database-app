package com.viveknaskar.studentdatabaseapp;

public class StudentDatabaseApp {

    public static void main(String[] args) {

        Student student1 = new Student();
        student1.enroll();
        student1.payTuition();
        System.out.println(student1.toString());

        Student student2 = new Student();
        student2.enroll();
        student2.payTuition();
        System.out.println(student2.toString());

    }
}
