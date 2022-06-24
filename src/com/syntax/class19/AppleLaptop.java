package com.syntax.class19;

import com.syntax.class20.Laptop;

public class AppleLaptop extends Laptop {
    void printMake(){
        //can not acces because we are in the different package
        System.out.println(make);
    }
}
