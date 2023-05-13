package com.driver;

public class Order {

    private String id;
    private int deliveryTime;

    public Order(String id, String deliveryTime) {
        this.deliveryTime = TimeConv.convertTime(deliveryTime);
        this.id = id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDeliveryTime(int deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public String getId() {
        return id;
    }

    public int getDeliveryTime() {return deliveryTime;}
}
