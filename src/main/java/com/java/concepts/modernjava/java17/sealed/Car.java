package com.java.concepts.modernjava.java17.sealed;

public final class Car extends Vehicle implements SmartMediaPlayer {
    @Override
    public String drive() {
        return "car";
    }

    @Override
    public void playMusic() {
        System.out.println("playing music");
    }

    @Override
    public void connectCall() {
        System.out.println("connecting call");
    }
}
