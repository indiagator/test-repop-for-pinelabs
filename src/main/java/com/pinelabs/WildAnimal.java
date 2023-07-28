package com.pinelabs;

import com.mylabs.Speakable;

public class WildAnimal extends Animal implements Speakable
{

    public String speak()
    {
        return "I am wild";
    }

    public String speakLikeYourParent()
    {
        return super.speak();
    }

}
