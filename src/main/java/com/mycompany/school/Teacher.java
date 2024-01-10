/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.school;

/**
 *
 * @author User
 */
public class Teacher {

            private String firstName;
            private String lastName;
            private String amka;
            private Lesson lesson;

            public Teacher(String firstName, String lastName, String amka, Lesson lesson) {
                this.firstName = firstName;
                this.lastName = lastName;
                this.amka = amka;
                this.lesson = lesson;
            }

            public String getFirstName() {
                return firstName;
            }

            public String getLastName() {
                return lastName;
            }

            public String getAmka() {
                return amka;
            }

            public Lesson getLesson() {
                return lesson;
            }

            public void printDetails() {
                System.out.println("Teacher Details:");
                System.out.println("Name: " + firstName + " " + lastName);
                System.out.println("AMKA: " + amka);
                System.out.println("Teaching Subject: " + lesson.getDescription());
                System.out.println();
            }
        }

