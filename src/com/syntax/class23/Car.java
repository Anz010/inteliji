package com.syntax.class23;

public class Car {
    void start(){
        System.out.println("use keys to start me");
    }
    void stop(){
       System.out.println("Use breaks to stop me");}

    void park(){
        System.out.println("you can park manually");
    }
}
class Bmw extends Car {
    @Override
    void start() {
        System.out.println("you can use push start button to start me");
    }
@Override
    void stop() {
        System.out.println("you can use autoparking to stop me");
    }

}
class Tesla extends Car{
    @Override
    void start() {
        System.out.println("You can use mobile app to start me");
    }

    @Override
    void stop() {
        System.out.println("you can use auto braking to stop me ");
    }

    @Override
    void park() {
        System.out.println("I can park myself");
    }
}
class Toyota extends Car{

}