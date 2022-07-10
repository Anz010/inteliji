package com.syntax.class26;

public interface MoveAble {
     void move();
}
class Car implements MoveAble{

     @Override
     public void move() {
          System.out.println("A car can move");
     }
     public void park(){
          System.out.println("You can park me");
     }

}

class Person implements MoveAble{

     @Override
     public void move() {
          System.out.println("Humans can also move");
     }
     public void park(){
          System.out.println("Humans can park ");
     }
}

class Test{
     public static void main(String[] args) {
          MoveAble moveAble=new Person();
          moveAble.move();
          ((Person)(moveAble)).park();

          MoveAble[]moveAbles={new Car(),new Person()};
     }

}