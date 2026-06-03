package com.java.concepts.modernjava.java25.unnamedvariables;

public class UnnamedVariables {

    private static Integer getInteger(String s){

        try {
            return Integer.parseInt(s);
        }
        catch (Exception _){
            System.out.println("Exception occurred while parsing integer: " + s);
            return null;
        }
    }
    static void main() {
        System.out.print("Parsed integer: " + getInteger("123"));
    }
}
