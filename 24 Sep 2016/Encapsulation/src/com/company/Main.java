package com.company;

public class Main {

    public static void main(String[] args) {
	DbConnection dbc= new DbConnection();


        dbc.setName("Shoukat Malik");
        dbc.setAge(23);
        dbc.setGender("Male");
        System.out.println(dbc.getName());
        dbc.StudentInfo();
        /*
        Again set values in varaiables
         */
        dbc.setName("Nauman Qureshi");
        System.out.println(dbc.getName());

    }
}
