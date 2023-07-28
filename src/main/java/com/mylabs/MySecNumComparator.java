package com.mylabs;

import java.util.Comparator;

public class MySecNumComparator implements Comparator
{

    @Override
    public int compare(Object o1, Object o2)
    {
        if( ((MySecondNumber)o1).getNum() ==  ((MySecondNumber)o1).getNum() )
        {
            return 0;
        }
        else if ( ((MySecondNumber)o1).getNum() <  ((MySecondNumber)o1).getNum())
        {
            return -1;
        }
        else if (((MySecondNumber)o1).getNum() >  ((MySecondNumber)o1).getNum())
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
}
