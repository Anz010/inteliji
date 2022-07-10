package com.syntax.class26;
import java.util.ArrayList;
public class ArrayListDemo5 {
    public static void main(String[] args) {
        ArrayList<Integer>numbers=new ArrayList<Integer>();
        for(int d=1;d<500;d++){
            if(d%2==0){
                numbers.add(d);
            }
        }

        for (int d=1;d<numbers.size();d++){
            if(numbers.get(d)%5==0){
                numbers.remove(d);
            }
        }
        System.out.println("Even numbers "+numbers);
    }
}
