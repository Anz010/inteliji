package com.syntax.class26;
import java.util.ArrayList;
public class ArrayListTask1 {
    public static void main(String[] args) {
        ArrayList<String >fruits=new ArrayList<String>();
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Oranges");
        fruits.add("Strawberry");
        fruits.add("Lemon");
        if(!fruits.isEmpty()){
            System.out.println("ArrayList is not empty");
        }
        if(fruits.contains("Mango")){
            System.out.println("the array list contains mango");
        }else{
            System.out.println("Check your input");
        }
        System.out.println(fruits.size());
    }

}
