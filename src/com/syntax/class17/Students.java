package com.syntax.class17;
/*
Create three  variables  Name , ID  and  numberOfStudents
Create three objects of the Students Class
Set the value for  studentName , studentID and increment  the numberOfStudents for each object
Print out  total number of students
 */

public class Students {
    String name;
    int id;
    static int numberOfStudents;



    public static void main(String[] args) {
        Students stu1=new Students();
        stu1.name="Jason";
        stu1.id=123;
        numberOfStudents++;

        Students stu2=new Students();
        stu2.name="Peter";
        stu2.id=124;
        numberOfStudents++;

        Students stu3=new Students();
        stu3.name="Jim";
        stu3.id=125;
        numberOfStudents++;

        System.out.println("Number of students is "+numberOfStudents);
    }
}