package com.java.concepts.oldjava.strings;

public class StringReferenceTest {

    public static void main(String[] args){

        String s1= new String("sachin");
        //two objects are created one in Heap another in SCP.
        String s2= s1.toUpperCase(); //object created in HEAP- s2 ==> "SACHIN"
        String s3= s1.toLowerCase(); //no change so s3 points to s1 only in HEAP.
        String s4 = s2.toLowerCase(); //observed a change new object created in HEAP- s4 ==> "sachin"

        System.out.println(s1==s2); //false
        System.out.println(s1==s3); //true
        System.out.println(s1==s4); //false
    }
}
