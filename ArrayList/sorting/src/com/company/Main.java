package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<String>  countries=new ArrayList<String>();
        countries.add("PAkistan");
        countries.add("Iran");
        countries.add("india");
        countries.add("Kuiat");
       countries.add("china");
        System.out.println("\t\tBefore Sorting");
        System.out.println("--------------------------------------");
        for( String index  : countries) {
            System.out.println(index);
        }
        //now sorting array
        Collections.sort(countries);
        System.out.println("-------------------------------------");
        System.out.println("After sortin");
        for(String index :countries)
            System.out.println(index);

    }
}
