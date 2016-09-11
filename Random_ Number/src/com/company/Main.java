package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random r = new Random();
        System.out.println("\tRANDOM NUMBER ");
        for (int i = 0; i <3; i++) {
            int b = r.nextInt();
            System.out.println(b);
        }
    }
}
