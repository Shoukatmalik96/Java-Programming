package com.company;

public class Main {

    public static void main(String[] args) {
        Math math1=new Math();
        math1.min(12,3);
        Math math2=new Math();
        math1.max(15,3);

        Math obj;
        obj = new Math();
        System.out.println(obj.ciel(4.00));

        Math obj2=new Math();
        System.out.println(obj2.abs(5));
    }
}
