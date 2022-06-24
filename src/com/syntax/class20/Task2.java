package com.syntax.class20;

public class Task2 {
    public static void main(String[] args) {
        E.printF();
    }
}

class G{
    public static void printF(){
        System.out.println("Mehtod printF in class G");
    }
}
class E extends G{

}