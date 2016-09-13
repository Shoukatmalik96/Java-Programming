package com.company;

import java.lang.ref.SoftReference;
/*
 String.length();
 String.replace();

 */

public class Main {

    public static void main(String[] args) {
	String strx="My first string in java";
        System.out.println(strx);
        // this is another method to print string in java
        String string=new String();
        string="This is another method of string initialization in java";
        System.out.println(string);
        System.out.println("string length :"+strx.length());
        System.out.println("String Length :"+string.length());
        System.out.println("Actual string :"+strx);
        System.out.println("String After replacement :"+strx.replace("first","First"));
    }
}
