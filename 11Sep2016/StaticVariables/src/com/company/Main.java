package com.company;

  /*
   Q: What is static variables in java ?
   Static variable’s value is same for all the object(or instances) of the class
   or in other words you can say that all instances(objects)
   of the same class share a single copy of static variables
   1- A single copy to be shared by all instances of the class
   2- A static variable can be accessed directly by the class name and doesn’t need any object
    Syntax : <class-name>.<variable-name>
 */
public class Main {

    public static void main(String[] args) {
        VariableDemo obj1=new VariableDemo();
        VariableDemo obj2=new VariableDemo();
        VariableDemo obj3=new VariableDemo();
        VariableDemo obj4=new VariableDemo();
        obj1.increment();
        obj2.increment();
        System.out.println("Obj1: count is="+obj1.count);
        System.out.println("Obj2: count is="+obj2.count);
        System.out.println("Obj2: count is="+obj3.count);
        System.out.println("Obj2: count is="+obj4.count);
    }
}
