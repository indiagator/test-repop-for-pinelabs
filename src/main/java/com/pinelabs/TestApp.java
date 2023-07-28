package com.pinelabs;

//TestApp.main()

import com.mylabs.Order;
import com.mylabs.SmallOrder;
import com.mylabs.Speakable;

import java.util.Scanner;

public class TestApp
{    //body of the class

    //DATA
    //CODE
    int myNum=78; //declaration + initialization
    String myString = "my first string"; // declaration + initialization
    public static void main(String[] args)
    {
        //ENTRYPOINT
        System.out.println("Hello world!");
        MyNumber<Integer> number_1 = new MyNumber<>(); //DECLARATION | INSTANTIATION
        MyNumber number_2 = new MyNumber();

        number_1.setNum(67); // INITIALIZATION
        number_1.setNum(87); // REASSIGNMENT
        number_2.setNum("hello");  // INITIALIZATION

        System.out.println(number_1);
        System.out.println(number_2);

        //System.out.println((new MyCharacter()).hashCode());
        //System.out.println((new MyCharacter()).hashCode());

        MyTest t1 = new MyTest("random text") ;

        Animal a1 = new Animal();
        a1.setId("wer323");
        a1.setName("tommy");
        a1.setCell_location("cell_1");

        WildAnimal wa1 = new WildAnimal();
        wa1.setId("gfdg444");
        wa1.setName("johnny");
        wa1.setCell_location("cell_4");

        Animal a2 = new WildAnimal();



        System.out.println( a2 );
        a2 = new Animal();
        System.out.println( a2.speak() );
        System.out.println(a2.hashCode());

        WildAnimal wa2 = new WildAnimal();
        System.out.println("*****");
        System.out.println(wa2.speakLikeYourParent());

        a2 = wa2;
        System.out.println(a2.hashCode());

        Speakable s1 = new Animal();
        Speakable s2 = new WildAnimal();

        System.out.println("Please Create an Animal");

        Scanner in = new Scanner(System.in);
        String type = in.next();

        Speakable userPet = SpeakableFactory.creatSpeakable(type);
        System.out.println(userPet.speak());

        Speakable.yetAnotherSpeak();
        Order order = new SmallOrder();

      // System.out.println(MyTest.concatString("26 ","July"));

        //EXITPOINT
    }
}

