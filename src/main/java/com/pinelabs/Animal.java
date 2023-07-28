package com.pinelabs;

import com.mylabs.Speakable;

public class Animal implements Speakable
{
    private String id;

    public String name;
    String cell_location; // default access modifier

    protected Integer age;

    //public String speak()
    //{
     //  return "I am an Animal";

    //}

    public void setCell_location(String cell_location) {
        this.cell_location = cell_location;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCell_location() {
        return cell_location;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String speak()
    {
        return "I am an animal";
    }
}
