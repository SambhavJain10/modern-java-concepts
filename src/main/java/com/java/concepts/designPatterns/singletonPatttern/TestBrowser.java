package com.java.concepts.designPatterns.singletonPatttern;

public class TestBrowser {

    public static void main(String[] args){

        //Browser br = new Browser(); // this will give compile error as its constructor is private

        Browser.getInstance().displayMsg();
    }
}
