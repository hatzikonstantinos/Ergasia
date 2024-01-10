/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.school;

/**
 *
 * @author User
 */
 class ClassRoom {
            private String classCode;
            private String description;

            public ClassRoom(String classCode, String description) {
                this.classCode = classCode;
                this.description = description;
            }

            public String getClassCode() {
                return classCode;
            }

            public String getDescription() {
                return description;
            }

            public void printDetails() {
                System.out.println("Classroom Details:");
                System.out.println("Class Code: " + classCode);
                System.out.println("Description: " + description);
                System.out.println();
            }
            
        }