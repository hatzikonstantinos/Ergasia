
package com.mycompany.school;

public class School {
    public static void main(String[] args) {
        

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