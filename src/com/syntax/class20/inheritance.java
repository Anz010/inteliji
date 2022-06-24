package com.syntax.class20;

class inheritance {
    String name="Newton";
    String eyeColor="brown";
}
class Child extends inheritance{

    public void printInfo(){
        System.out.println(name+" "+eyeColor);
        }

    public static void main(String[] args) {
        Child child=new Child();
        child.printInfo();
    }
        }

