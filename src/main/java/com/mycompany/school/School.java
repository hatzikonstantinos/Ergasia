
package com.mycompany.school;

public class School {
    public static void main(String[] args) {
        

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

        class Teacher {
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

        
        ClassRoom classRoom1 = new ClassRoom("E1", "Laboratory 1");
        ClassRoom classRoom2 = new ClassRoom("E2", "Laboratory 2");

        Lesson lesson1 = new Lesson("M1", "Mathematics I", classRoom1);
        Lesson lesson2 = new Lesson("M2", "Mathematics II", classRoom2);

        Teacher teacher1 = new Teacher("John", "Doe", "1234567890", lesson1);
        Teacher teacher2 = new Teacher("Jane", "Smith", "0987654321", lesson2);

        Lesson[] student1Lessons = {lesson1, lesson2};
        Lesson[] student2Lessons = {lesson1};
        Lesson[] student3Lessons = {lesson2};

        Student student1 = new Student("Alice", "Johnson", "S12345", student1Lessons);
        Student student2 = new Student("Bob", "Williams", "S67890", student2Lessons);
        Student student3 = new Student("Charlie", "Davis", "S54321", student3Lessons);

       
        teacher1.printDetails();
        lesson1.printDetails();
        classRoom1.printDetails();
        student1.printDetails();
    }
}