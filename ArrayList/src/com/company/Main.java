package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList myArray=new ArrayList(5);
        myArray.add(1);
        myArray.add("shoukat Malik");
        myArray.add('N');
        myArray.add(2.5);
        myArray.add(234.55);
        for(int i=0;i<myArray.size();i++){

            System.out.println(myArray.get(i));

        }

    }
}

