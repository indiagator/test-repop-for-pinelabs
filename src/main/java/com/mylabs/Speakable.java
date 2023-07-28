package com.mylabs;

public interface Speakable
{
    String speak();
     default String anotherSpeak()
    {
        return "test string";
    }

     static String yetAnotherSpeak()
    {
        return "test string";
    }
}
