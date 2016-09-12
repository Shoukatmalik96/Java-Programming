package com.company;

import java.util.Scanner;

public class Main {



    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        System.out.print("How many number do you want to print in array :");
        int n=s.nextInt();

        for(int i=1;i<=n;i++){
            System.out.print("ENTER NO "+i+" :");
            n=s.nextInt();
            System.out.println("The number "+i+"is :"+n);

        }
        System.out.println("Thanks for practice");
    }
}
