package com.syntax.class23;

public class PolyMorphismDemo1 {
    void doSomething(String name){
        System.out.println("downloading a movie from internet "+name);
    }
    void doSimething(int num){
        System.out.println("downloading the text based on new rules");
    }
}
class PolyTester{
    public static void main(String[] args) {
        PolyMorphismDemo1 p=new PolyMorphismDemo1();
        p.doSimething(10);
    }
}