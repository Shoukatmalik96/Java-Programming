package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int i,n = 0,k;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter number you want to print its table :");
        n = sc.nextInt();
        System.out.println(" \t\t\tTABLE");
        System.out.println("----------------------------------------------");
        for (i=1;i<=10;i++){
            k=(int)n*i;
            System.out.println(n+"X"+i+"="+k);
            
        }
        System.out.println("-----------------------------------------------");
    }
}
