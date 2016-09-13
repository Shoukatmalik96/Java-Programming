package com.company;

public class Main {

    public static void main(String[] args) {
        Myclass obj=new Myclass();
        System.out.println(obj.mymethod(2,3));
        obj.mymethod(1.0,3);
        System.out.println(obj.mymethod(5,8.00));
    }
}
