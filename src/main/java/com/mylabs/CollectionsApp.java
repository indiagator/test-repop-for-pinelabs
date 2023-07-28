package com.mylabs;

import com.pinelabs.MyNumber;

import java.util.ArrayList;
import java.util.List;

public class CollectionsApp
{

    public static void main(String[] args)
    {
         List<Integer> numbers = new ArrayList<Integer>();
         List<MySecondNumber> secondList = new ArrayList<>();

         secondList.add(new MySecondNumber(78));
         secondList.add(new MySecondNumber(97));
         secondList.add(new MySecondNumber(67));

         secondList.sort(new MySecNumComparator());

        for (MySecondNumber num: secondList)
        {
            System.out.println(num.getNum());
        }

        List<UserDetail> userDetailList = new ArrayList<>();

        userDetailList.add(new UserDetail("prateek","indiagator@gmail.com"));
        userDetailList.add(new UserDetail("rajan","rajan@gmail.com"));
        userDetailList.add(new UserDetail("suzy","suzy@gmail.com"));

        userDetailList.stream().filter(userDetail ->
                                    userDetail.getEmail().
                                            equals("rajan@gmail.com") ).
                                                    forEach(System.out::println);

    }
}
