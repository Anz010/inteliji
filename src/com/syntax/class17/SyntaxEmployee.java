package com.syntax.class17;
/*Create a Class called SyntaxEmployee:
Create three  variables  empID , salary and set the CEO to “Sumair”
Create two objects of the class SyntaxEmployee
Set the value of eID, salary for each of the objects
Print out the eID , salary and  CEO for each of the objects
 */


import java.sql.SQLOutput;

public class SyntaxEmployee {
    int eid;
    double salary;
    static String ceo="Sumair";
    void print(){
        System.out.println("Employee ID is "+eid+" salary is "+salary+" CEO is "+ceo);
    }

    public static void main(String[] args) {
        SyntaxEmployee emp=new SyntaxEmployee();
        emp.eid=123;
        emp.salary=123000;
        emp.print();

        SyntaxEmployee emp1=new SyntaxEmployee();
        emp1.eid=124;
        emp1.salary=125000;
        emp1.print();
    }
}
