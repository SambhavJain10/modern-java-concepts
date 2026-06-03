package com.java.concepts.oldjava.oops.constructor;

class Emp {

    int id;
    String name;

    Emp(int id, String name){
        this.id= id;
        this.name= name;
    }

    Emp (Emp emp){
        id= emp.id;
        name= emp.name;
    }
}
public class CopyConstructorExample {

    public static void main(String[] args){

        Emp e1= new Emp(1000, "Sambhav");
        Emp e2= new Emp(e1);

        System.out.println("Emp 1 info: " +e1.id +", " +e1.name);
        System.out.println("Emp 2 info: " +e2.id +", " +e2.name);

    }
}
