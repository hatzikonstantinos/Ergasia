# Ergasia
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.school;

/**
 *
 * @author User
 */
public class School {

    public static void main(String[] args) {
        Subject subject1=new Subject("Math");
        Subject subject2=new Subject("Literature");
        Subject subject3=new Subject("Essay");
        Subject subject4=new Subject("Physics");
        Subject subject5=new Subject("Chemistry);
        
        Class class1=new Class(A1);
        Class class2=new Class(B2);
        Class class3=new Class(G3);
        Class class4=new Class(A2);
        Class class5=new Class(B1);
        
        Teacher teacher1=new Teacher("Spyros", "Avlonitis");
        Teacher teacher2=new Teacher("George", "Galonikos");
        Teacher teacher3=new Teacher("Spyros", "Avlonitis");
        Teacher teacher4=new Teacher("George", "Galonikos");
        Teacher teacher5=new Teacher("Spyros", "Avlonitis");
        
        Student student1=new Student("Dhmhtris", "Dhmopoulos");
        Student student2=new Student("Katerina", "Axrhkia");
        Student student3=new Student("Kwnstantinos", "Gewrghzas");
        Student student4=new Student("Dhmhtris", "Dhmopoulos");
        Student student5=new Student("Katerina", "Axrhkia");
        Student student6=new Student("Kwnstantinos", "Gewrghzas");
        Student student7=new Student("Dhmhtris", "Dhmopoulos");
        Student student8=new Student("Katerina", "Axrhkia");
        Student student9=new Student("Kwnstantinos", "Gewrghzas");
        Student student10=new Student("Dhmhtris", "Dhmopoulos");
        Student student11=new Student("Katerina", "Axrhkia"");
        Student student12=new Student("Kwnstantinos", "Gewrghzas");
        Student student13=new Student("Dhmhtris", "Dhmopoulos");
        Student student14=new Student("Katerina", "Axrhkia");
        Student student15=new Student("Kwnstantinos", "Gewrghzas");
        Student student16=new Student("Dhmhtris", "Dhmopoulos");
        Student student17=new Student("Katerina", "Axrhkia");
        Student student18=new Student("Kwnstantinos", "Gewrghzas");
        Student student19=new Student("Dhmhtris", "Dhmopoulos");
        Student student20=new Student("Katerina", "Axrhkia");
        
        System.out.println("Hello World!");
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.school;

/**
 *
 * @author User
 */
public class Class {
    
    private String CLASS_CODE;

    private String DESCRIPTION;


    /**
     * Get the value of DESCRIPTION
     *
     * @return the value of DESCRIPTION
     */
    public String getDESCRIPTION() {
        return DESCRIPTION;
    }

    /**
     * Set the value of DESCRIPTION
     *
     * @param DESCRIPTION new value of DESCRIPTION
     */
    public void setDESCRIPTION(String DESCRIPTION) {
        this.DESCRIPTION = DESCRIPTION;
    }

    /**
     * Get the value of CLASS_CODE
     *
     * @return the value of CLASS_CODE
     */
    public String getCLASS_CODE() {
        return CLASS_CODE;
    }

    /**
     * Set the value of CLASS_CODE
     *
     * @param CLASS_CODE new value of CLASS_CODE
     */
    public void setCLASS_CODE(String CLASS_CODE) {
        this.CLASS_CODE = CLASS_CODE;
    }

}

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
     private String FIRST_NAME;

    private String LAST_NAME;

    private int AMKA;

    private String SUBJECT;

    /**
     * Get the value of SUBJECT
     *
     * @return the value of SUBJECT
     */
    public String getSUBJECT() {
        return SUBJECT;
    }

    /**
     * Set the value of SUBJECT
     *
     * @param SUBJECT new value of SUBJECT
     */
    public void setSUBJECT(String SUBJECT) {
        this.SUBJECT = SUBJECT;
    }


    /**
     * Get the value of AMKA
     *
     * @return the value of AMKA
     */
    public int getAMKA() {
        return AMKA;
    }

    /**
     * Set the value of AMKA
     *
     * @param AMKA new value of AMKA
     */
    public void setAMKA(int AMKA) {
        this.AMKA = AMKA;
    }

    /**
     * Get the value of LAST_NAME
     *
     * @return the value of LAST_NAME
     */
    public String getLAST_NAME() {
        return LAST_NAME;
    }

    /**
     * Set the value of LAST_NAME
     *
     * @param LAST_NAME new value of LAST_NAME
     */
    public void setLAST_NAME(String LAST_NAME) {
        this.LAST_NAME = LAST_NAME;
    }

    /**
     * Get the value of FIRST_NAME
     *
     * @return the value of FIRST_NAME
     */
    public String getFIRST_NAME() {
        return FIRST_NAME;
    }

    /**
     * Set the value of FIRST_NAME
     *
     * @param FIRST_NAME new value of FIRST_NAME
     */
    public void setFIRST_NAME(String FIRST_NAME) {
        this.FIRST_NAME = FIRST_NAME;
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.school;

/**
 *
 * @author User
 */
public class Student {
    
    private String FIRST_NAME;

    private String LAST_NAME;

    private int REGISTRATION_NUMBER;

    private static String SUBJECT;

    /**
     * Get the value of SUBJECT
     *
     * @return the value of SUBJECT
     */
    public static String getSUBJECT() {
        return SUBJECT;
    }

    /**
     * Set the value of SUBJECT
     *
     * @param SUBJECT new value of SUBJECT
     */
    public static void setSUBJECT(String SUBJECT) {
        Student.SUBJECT = SUBJECT;
    }


    /**
     * Get the value of REGISTRATION_NUMBER
     *
     * @return the value of REGISTRATION_NUMBER
     */
    public int getREGISTRATION_NUMBER() {
        return REGISTRATION_NUMBER;
    }

    /**
     * Set the value of REGISTRATION_NUMBER
     *
     * @param REGISTRATION_NUMBER new value of REGISTRATION_NUMBER
     */
    public void setREGISTRATION_NUMBER(int REGISTRATION_NUMBER) {
        this.REGISTRATION_NUMBER = REGISTRATION_NUMBER;
    }

    /**
     * Get the value of LAST_NAME
     *
     * @return the value of LAST_NAME
     */
    public String getLAST_NAME() {
        return LAST_NAME;
    }

    /**
     * Set the value of LAST_NAME
     *
     * @param LAST_NAME new value of LAST_NAME
     */
    public void setLAST_NAME(String LAST_NAME) {
        this.LAST_NAME = LAST_NAME;
    }

    /**
     * Get the value of FIRST_NAME
     *
     * @return the value of FIRST_NAME
     */
    public String getFIRST_NAME() {
        return FIRST_NAME;
    }

    /**
     * Set the value of FIRST_NAME
     *
     * @param FIRST_NAME new value of FIRST_NAME
     */
    public void setFIRST_NAME(String FIRST_NAME) {
        this.FIRST_NAME = FIRST_NAME;
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.school;

/**
 *
 * @author User
 */
public class Subject {
    
    private String CODE;

    private String DESCRIPTION;

    private String CLASS;

    /**
     * Get the value of CLASS
     *
     * @return the value of CLASS
     */
    public String getCLASS() {
        return CLASS;
    }

    /**
     * Set the value of CLASS
     *
     * @param CLASS new value of CLASS
     */
    public void setCLASS(String CLASS) {
        this.CLASS = CLASS;
    }

    /**
     * Get the value of DESCRIPTION
     *
     * @return the value of DESCRIPTION
     */
    public String getDESCRIPTION() {
        return DESCRIPTION;
    }

    /**
     * Set the value of DESCRIPTION
     *
     * @param DESCRIPTION new value of DESCRIPTION
     */
    public void setDESCRIPTION(String DESCRIPTION) {
        this.DESCRIPTION = DESCRIPTION;
    }

    /**
     * Get the value of CODE
     *
     * @return the value of CODE
     */
    public String getCODE() {
        return CODE;
    }

    /**
     * Set the value of CODE
     *
     * @param CODE new value of CODE
     */
    public void setCODE(String CODE) {
        this.CODE = CODE;
    }

}
