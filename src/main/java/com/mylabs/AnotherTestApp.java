package com.mylabs;

import com.pinelabs.Dog;
import com.pinelabs.exceptions.OrderCancelledException;
import com.pinelabs.exceptions.PaymentFailedException;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AnotherTestApp
{

    public void createOrder()
    {
        throw new OrderCancelledException();

    }

    public void createPayment() throws PaymentFailedException {


            throw new PaymentFailedException();



    }

    int takeInput() throws IOException, NullPointerException, NumberFormatException, PaymentFailedException {
        BufferedReader reader = Files.newBufferedReader(Paths.get("C:\\Users\\PRATEEK\\IdeaProjects\\testpinecore\\data\\info.csv"));

        try
        {
            System.out.println("please enter a number");
            Scanner in = new Scanner(System.in);
            int i = 0;
            i = in.nextInt();


           createPayment();
           createOrder();

            return i;
        }
        catch(InputMismatchException e)
        {
            System.out.println(e.getCause());
            return this.takeInput();
        }
        finally
        {
            System.out.println("this is the finally block");
        }
    }

    public static void main(String[] args) throws IOException, PaymentFailedException {
        System.out.println("this is another main ");

        int input=0;

        AnotherTestApp app = new AnotherTestApp();
        try
        {
            input = app.takeInput();
        }
        catch (Exception exception)
        {
            app.takeInput();
        }

        Dog d = null;

        System.out.println(d.speak());

        System.out.println(input);
    }
}
