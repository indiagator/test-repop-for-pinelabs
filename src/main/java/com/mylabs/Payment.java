package com.mylabs;

public class Payment
{
    String email;
    String payment_id;

    Payment(String email, String payment_id)
    {
        this.email = email;
        this.payment_id = payment_id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPayment_id(String payment_id) {
        this.payment_id = payment_id;
    }

    public String getEmail() {
        return email;
    }

    public String getPayment_id() {
        return payment_id;
    }
}
