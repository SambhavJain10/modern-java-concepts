package com.java.concepts.designPatterns.singletonPatttern;

public class Browser {

    //1. private static instance of the class
    private static Browser browser;

    //2. private contractor to prevent instantiation/object
    private Browser(){} //this will block object creation outside this class

    //3. public static method to provide access to the instance/object
    public static Browser getInstance() {

        if(browser == null){
            browser = new Browser();
        }

        return browser;
    }
    public void displayMsg(){
        System.out.println("browser info");
    }

    //usage:

}
