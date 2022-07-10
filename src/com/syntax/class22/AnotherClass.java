package com.syntax.class22;

class Main {

    String schoolName;
    int batch;
    int year;
    String lastDayOfClass;

    public Main (String schoolName, int batch, int year, String lastDayOfClass){
        this.schoolName=schoolName;
        this.batch=batch;
        this.year=year;
        this.lastDayOfClass=lastDayOfClass;
    }
    void printInfo1(){
        System.out.println (schoolName+" "+batch+" "+year+" "+lastDayOfClass);
    }
}


