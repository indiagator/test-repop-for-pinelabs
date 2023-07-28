package com.mylabs;

public class PaymentDetail {

    String payment_id;

    String order_id;

    String merchant_id;

    int amnt;

    PaymentDetail(String payment_id, String order_id, String merchant_id, int amnt)
    {
        this.payment_id = payment_id;
        this.order_id = order_id;
        this.merchant_id = merchant_id;
        this.amnt = amnt;
    }

    public void setPayment_id(String payment_id) {
        this.payment_id = payment_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public void setAmnt(int amnt) {
        this.amnt = amnt;
    }

    public void setMerchant_id(String merchant_id) {
        this.merchant_id = merchant_id;
    }

    public String getPayment_id() {
        return payment_id;
    }

    public int getAmnt() {
        return amnt;
    }

    public String getMerchant_id() {
        return merchant_id;
    }

    public String getOrder_id() {
        return order_id;
    }
}
