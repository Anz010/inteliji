package com.syntax.class26;
import java.util.ArrayList;
public class ArrayListDemo4 {
    public static void main(String[] args) {
        ArrayList<String>drinks=new ArrayList<String>();
        drinks.add("Bloody Mary");
        drinks.add("Moscow Mule");
        drinks.add("Coke");
        drinks.add("Sprite");
        drinks.add("Fanta");
        drinks.add("milk");
        drinks.add("Shake");

        for(int b=1;b<drinks.size();b++){
            if(drinks.get(b).contains("a")||drinks.get(b).contains("e")){
                drinks.remove(b);
                drinks.add("water");
            }
        }
        System.out.println(drinks);
    }
}
