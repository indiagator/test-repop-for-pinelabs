package com.mylabs;

public abstract class Order
{
    Integer order_id;
    public abstract Integer getOrder_id();

    public void setOrder_id(Integer order_id) {
        this.order_id = order_id;
    }
}
