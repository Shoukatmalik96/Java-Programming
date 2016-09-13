package com.company;

/**
 * Created by Shoukat Malik on 9/13/2016.
 */
public class Myclass {

    public double mymethod(int a, int b){
        System.out.println("First method of the class");
        return a+b;
    }
      public double mymethod( double a, int b) {
          if(a>b){
              System.out.println("a is grater than b");
          } else {
              System.out.println("b is greater than a ");
          }
          return a/b ;
      }
      public double  mymethod(int  x, double y){
          return  x + y;
      }


}
