package com.company;

/**
 * Created by Shoukat Malik on 9/24/2016.
 */
public class DbConnection {
    private String Name ;
    private int  Age ;
    private String Gender ;

    /*
     Now we creater setter for all variables
     */

    public  void setName(String name){
        Name=name;

    }
    public  void setAge(int  age){
        Age=age;
    }
    public void setGender(String gender){
        Gender=gender;
    }

    /*
    Now we create getter for all instance variables
     */
    public  String getName(){
        return Name;
    }
    public  int  getAge(){
        return  Age;
    }
    public String getGender(){
        return Gender;
    }

    public void StudentInfo(){
        System.out.println("Database Connectivity");
        System.out.println("--------------------------------");
        System.out.println("Name :"+this.Name);
        System.out.println("Age  :"+this.Age);
        System.out.println("Gender :"+this.Gender);
    }
}
