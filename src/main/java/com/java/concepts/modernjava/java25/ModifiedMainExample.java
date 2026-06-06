package com.java.concepts.modernjava.java25;

public class ModifiedMainExample {

    void main(){
        System.out.println("This is the modified main method without static keyword.");
    }

    static void main(String[] args){
        System.out.println("This is the original main method with static keyword.");
    } // priority to this main method as it is the entry point of the program

    //launched in java25 ease of using method without constrained contract- main can be without static keyword too.
}