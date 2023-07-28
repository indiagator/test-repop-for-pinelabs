package com.pinelabs.exceptions;

public class PaymentFailedException extends Exception
{
    @Override
    public String getMessage() {
        return "user has insufficient balance in the wallet";
    }
}
