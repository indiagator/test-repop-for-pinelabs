package com.mylabs;

import java.util.Comparator;

public class MySecondNumber implements Comparable
{

    int num;

    MySecondNumber(int num)
    {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public int compareTo(Object o) {

        if(! (o instanceof Integer))
        {

        }

        return 0;
    }


}
