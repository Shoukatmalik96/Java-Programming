package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1); // [0]
        list.add(2);  // [1]
        list.add(4); // [2]

        // Set index 0 to a new String.
        list.set(0, 100);

        for (Integer index : list) {
            System.out.println(index);
        }



      /*
        ArrayList<String> list=new ArrayList<>(5);
        list.add("Nauman");
        list.add("Saqib");
        list.add("Shoukat");
        list.add("Hamza");
        list.add("Awais");
        for(int j=0;j<list.size();j++){
            System.out.println(list.get(j));
        }

      */
    }

}
