package com.java.concepts.modernjava.java10beyond.textblocks;

public class MultiLineString {

    public static String multiLineStringWithParam(String name){
        var multiLineString = """
                Hello, %s!
                This is a multi-line string in Java 15.
                It preserves the formatting and line breaks.
                """;

        return String.format(multiLineString, name);
    }

    public static String useSQL(){
        return """
                SELECT id, name, email
                FROM users
                WHERE status = 'active'
                ORDER BY created_at DESC;
                """;
    }

    public static String useJSON(){

        return """
                {
                    "id": 1,
                    "name": "Sambhav",
                    "email": "abc@example.com"
                }
                """;
    }
    static void main(String[] args) {
        var multiLineString = """
                This is a multi-line string in Java 15.
                It preserves the formatting and line breaks.
                You can include "quotes" and other special characters without escaping.
                """;

        System.out.println(multiLineString);
        System.out.println(multiLineStringWithParam("Samby"));
        System.out.println(useSQL());
        System.out.println("Json: " + useJSON());
    }
}