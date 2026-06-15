package com.java.concepts.modernjava.java21.patternmatching.typepattern;

public class PatternMatchingExample {

    //old way
    public String patternMatching(Object o){

        if ( o instanceof String){
            String s = (String)o; // redundant cast
            return "It's a string: "+s;
        }

        if (o instanceof Integer){
            Integer i = (Integer) o; // redundant cast
            return "It's an integer: " +String.valueOf(i * 2);
        }
        return "Not a string or Integer";
    }

    // Enhanced Way- patternMatching using InstanceOf - java 16
    public String patternUsingInstanceOf(Object o){
        if (o instanceof String s){
            return "It's a string: "+s;
        }
        if (o instanceof Integer i){
            return "It's an integer: " + String.valueOf(i * 2);
        }
        return "Not a string or Integer";
    }

    // Enhanced Way- patternMatching using switch - java 21
    public String patternMatchingUsingSwitch(Object o){
        return switch(o){ // as switch is expression now so it always returns
            case String s -> "It's a string: " +s;
            case Integer i -> "It's an integer: " + String.valueOf(i * 2);
            case null, default -> "Not a string or Integer";
        };
    }

    static void main(String[] args) {

    }
}