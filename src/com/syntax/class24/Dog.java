package com.syntax.class24;

class Dog{
    String dogName;
    double dogWeight;
    static String dogBreed="Mutt";

    Dog(String name, int weight){
        this.dogName=name;
        this.dogWeight=weight;}

    void display(){
        System.out.println(dogName+" "+dogBreed+" "+dogWeight);
    }



}