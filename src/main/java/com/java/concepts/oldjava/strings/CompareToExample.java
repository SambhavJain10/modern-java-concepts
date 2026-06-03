package com.java.concepts.oldjava.strings;

public class CompareToExample {

    public static void main(String[] args){

        String s1= "hello";
        String s2 = "hello";
        String s3 = "meklo";
        String s4 = "hemlo";
        String s5 = "";

        System.out.println(s1.compareTo(s2));// 0
        System.out.println(s1.compareTo(s3)); //-5 that means s1 is lesser than s3
        System.out.println(s1.compareTo(s5));
    }
}
