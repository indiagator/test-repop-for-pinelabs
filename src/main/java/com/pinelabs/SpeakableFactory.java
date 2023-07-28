package com.pinelabs;

import com.mylabs.Speakable;

public class SpeakableFactory
{

    public static Speakable creatSpeakable(String type)
    {
        switch (type)
        {
            case "lion": return new Lion();
            case "dog": return new Dog();
            default: return new Animal();
        }
    }
}
