package com.java.concepts.modernjava.java17.sealed;

public sealed interface SmartMediaPlayer permits Car {
     void playMusic();
     void connectCall();
}
