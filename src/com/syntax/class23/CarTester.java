package com.syntax.class23;

public class CarTester {
    public static void main(String[] args) {
        Car car =new Tesla();
        car=new Toyota();
        car.start();
        //Tesla tesla=new Car();

        Bmw bmw=new Bmw();
        bmw.start();
        bmw.stop();
        bmw.park();

        Tesla tesla=new Tesla();
        tesla.start();
        tesla.stop();
        tesla.park();

        Toyota toyota=new Toyota();
        toyota.start();
        toyota.stop();
        toyota.park();
    }

}


