package com.syntax.class26;
import java.util.ArrayList;
public class ArrayListTask3 {
    public static void main(String[] args) {
        ArrayList<String> veggies=new ArrayList<String>();
        veggies.add("Cucumber");
        veggies.add("Tomato");
        veggies.add("Potato");
        veggies.add("Onion");

        for (int a=0;a<veggies.size();a++){
            if(veggies.get(a).endsWith("o")){
                veggies.remove(a);
                a--;
            }

        }
        System.out.println(veggies);

    }
}
