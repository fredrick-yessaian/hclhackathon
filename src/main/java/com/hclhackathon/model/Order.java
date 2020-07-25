package com.hclhackathon.model;

public class Order {
    private int orderId;
    private String firstName;
    private String lastName;
    private String price;

    public Order() {
    }

    public Order(int orderId, String firstName, String lastName, String name) {
        this.orderId = orderId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.lastName = name;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

}
