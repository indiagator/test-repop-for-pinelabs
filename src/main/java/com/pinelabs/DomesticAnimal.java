package com.pinelabs;

import com.mylabs.Speakable;

public class DomesticAnimal implements Speakable
{

    @Override
    public String speak() {
        return null;
    }

    @Override
    public String anotherSpeak() {
        return Speakable.super.anotherSpeak();
    }
}
