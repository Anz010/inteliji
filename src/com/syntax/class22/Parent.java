package com.syntax.class22;

import java.sql.SQLOutput;

public class Parent {
    String name;
    void getMarried(){
        System.out.println("Hey hamid");
    }

}
class Hamid extends Parent{
   /* void getMarried(){
        System.out.println("I want to try on Tara First");
    }*/

    public static void main(String[] args) {
        Hamid hamid=new Hamid();
        hamid.getMarried();
    }
}