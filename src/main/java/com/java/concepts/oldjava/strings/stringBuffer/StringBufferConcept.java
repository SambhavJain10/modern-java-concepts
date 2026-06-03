package com.java.concepts.oldjava.strings.stringBuffer;

public class StringBufferConcept {

    public static void main(String[] args){

        StringBuffer stringBuffer1 = new StringBuffer(); //empty string with the initial capacity of 6
        StringBuffer stringBuffer2 = new StringBuffer("Employee");
        StringBuffer stringBuffer3 = new StringBuffer(2); //empty string with the specified capacity as length

        System.out.println(stringBuffer3.length()); //0
        stringBuffer3.append("Sachin");
        System.out.println(stringBuffer3);
        System.out.println(stringBuffer3.length());

    }
}
