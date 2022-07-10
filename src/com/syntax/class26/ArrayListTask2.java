package com.syntax.class26;
import java.sql.SQLOutput;
import java.util.ArrayList;

public class ArrayListTask2 {
    public static void main(String[] args) {
        ArrayList<String>cars=new ArrayList<String>();
        cars.add("BMW");
        cars.add("Mercedes");
        cars.add("Ferrari");
        cars.add("Bugatti");
        cars.add("Maseratti");
    for (int i=0;i<cars.size();i++){
        System.out.println(cars.get(i));
    }
        System.out.println("_____________");
    for(String car:cars){
        System.out.println("List "+car);
    }
        System.out.println(cars);
        System.out.println("____________________");




    }
}
