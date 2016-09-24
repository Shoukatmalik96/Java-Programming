package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList list=new ArrayList();
        list.add("Shoukat Malik ");
        list.add("Bilal ");
        list.add("Nauman Qureshi ");
        list.add("Hamza Saghir ");
        list.add("Saqib Javed ");

        System.out.println(list);
        /*
         Now we use for each loop here to print the Name one by one
         */
        list.remove(1);
       // list.indexOf("shoukat Malik");
        System.out.println(list);


    }
}
