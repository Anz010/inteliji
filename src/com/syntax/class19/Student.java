package com.syntax.class19;

public class Student {
double g1Marks;
double g2Marks;
double g3Marks;
String name;
    Student(String name, double grade1Marks,double grad2Marks,double grad3Marks){
        g1Marks=grade1Marks;
        g2Marks=grad2Marks;
        g3Marks=grad3Marks;
        this.name=name;
    }
    public void calculateAvgGrade(){
        double avgGrade=(g1Marks+g2Marks+g3Marks)/3;
        System.out.println(name+avgGrade);

    }
}
