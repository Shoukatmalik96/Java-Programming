package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	boolean isprime=true;
        Scanner s=new Scanner(System.in);
        System.out.print(" Enter no you want to check it :");
        int num=s.nextInt();
        for(int i=2;i<num/2;i++){
            int temp=num%2;
            if (temp==0){
                isprime=false;
                break;
            }
        }
        if(isprime){
            System.out.println(num+"is Prime Number");
        }
        else{
            System.out.println(num+"is Not a Prime");
            //System.out.println("Octal representation of 10: ");
            //System.out.println(Integer.toOctalString(10));
        }
    }

}
