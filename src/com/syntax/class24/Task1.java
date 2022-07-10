package com.syntax.class24;

public class Task1 {
}
class Student {
    void study(){
        System.out.println("Students must study");
    }
    void doHomework(){
        System.out.println("Students should do homework");
    }
    void practice(){
        System.out.println("Students must practice");
    }
}
class SyntaxStudent extends Student{
    @Override
    void study(){
        System.out.println("Syntax student must learn programming");
    }
    void doHomework(){
        System.out.println("Syntax students must solve the repels to get a good job");
    }
    @Override
    void practice(){
        System.out.println("Syntax students must practice to get a good job");
    }

}
class CollegeStudent extends Student{
    @Override
    void study(){
        System.out.println("College student must learn programming");
    }
    void doHomework(){
        System.out.println("College students must solve the repels to get a good job");
    }
    @Override
    void practice(){
        System.out.println("College students must practice to get a good job");
    }
}
class SchoolStudent extends Student{

    }


