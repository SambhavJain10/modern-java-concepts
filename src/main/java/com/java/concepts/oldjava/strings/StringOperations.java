package com.java.concepts.oldjava.strings;

import java.util.Arrays;

public class StringOperations {

    public static void main(String[] args){

        String s1= "Cristiano";
        String s2= "Ronaldo";

        String s3 = s1.concat(" " + s2);
        String s4 = s1 + " " + s2;
        System.out.println(s1.substring(0,4));//Cris
        System.out.println(s1.substring(0));//Cristiano

        System.out.println(s3);//Cristiano Ronaldo
        System.out.println(s4);//Cristiano Ronaldo

        String[] s5 = s4.split(s1);

        for (String s : s5)
            System.out.println(s);
    }


}
