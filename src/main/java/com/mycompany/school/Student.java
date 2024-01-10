/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.school;

/**
 *
 * @author User
 * */
 class Student {
            private String firstName;
            private String lastName;
            private String studentId;
            private Lesson[] enrolledLessons = new Lesson[5];

            public Student(String firstName, String lastName, String studentId, Lesson[] enrolledLessons) {
                this.firstName = firstName;
                this.lastName = lastName;
                this.studentId = studentId;
                this.enrolledLessons = enrolledLessons;
            }

            public String getFirstName() {
                return firstName;
            }

            public String getLastName() {
                return lastName;
            }

            public String getStudentId() {
                return studentId;
            }

            public Lesson[] getEnrolledLessons() {
                return enrolledLessons;
            }

            public void printDetails() {
                System.out.println("Student Details:");
                System.out.println("Name: " + firstName + " " + lastName);
                System.out.println("Student ID: " + studentId);
                System.out.println("Enrolled Lessons:");
                for (Lesson lesson : enrolledLessons) {
                    if (lesson != null) {
                        System.out.println("- " + lesson.getCode() + ": " + lesson.getDescription());
                    }
                }
                System.out.println();
            }
        }