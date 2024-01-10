/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.school;

class Lesson {
            private String code;
            private String description;
            private ClassRoom classRoom;

            public Lesson(String code, String description, ClassRoom classRoom) {
                this.code = code;
                this.description = description;
                this.classRoom = classRoom;
            }

            public String getCode() {
                return code;
            }

            public String getDescription() {
                return description;
            }

            public ClassRoom getClassRoom() {
                return classRoom;
            }

            public void printDetails() {
                System.out.println("Lesson Details:");
                System.out.println("Code: " + code);
                System.out.println("Description: " + description);
                System.out.println("Classroom: " + classRoom.getDescription());
                System.out.println();
            }
        }