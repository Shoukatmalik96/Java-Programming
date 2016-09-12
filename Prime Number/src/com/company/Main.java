package com.company;

import java.util.Scanner;

public class Main {

    static int  isprime=0;
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        System.out.print("ENTER ANY NUMBER :");
         int  i=s.nextInt();
         isprime=i%2;
        if(isprime==0){

            System.out.println(i+"is Even Number");
        }else {

            System.out.println(i+"is Odd Number");
        }


    }
}
