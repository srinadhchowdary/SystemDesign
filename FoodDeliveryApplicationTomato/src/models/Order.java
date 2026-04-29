package models;

import strategies.PaymentStrategy;

import java.util.*;

public abstract class Order {
    
    private static int nextOrderId = 0;
    
    protected int orderId;
    protected User user;
    protected Restaurant restaurant;
    protected List<MenuItem> items;
    protected double total;
    protected PaymentStrategy paymentStrategy;
    protected String scheduled;
    
    public Order(){
        this.user = null;
        this.restaurant = null;
        this.paymentStrategy  = null;
        this.total = 0.0;
        this.scheduled = "";
        this.orderId = ++nextOrderId;
    }
    
    public boolean processPayment(){
        if(paymentStrategy != null){
            paymentStrategy.pay(total);
            return true;
        }
        else{
            System.out.println("Please choose a payment mode first");
            return false;
        }
    }
    
    public abstract String getType();


    public int getOrderId() {
        return orderId;
    }

    public void setUser(User user) {
        this.user = user;
    }
    
    public User getUser() {
        return user;
    }
    
    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }
    
    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setItems(List<MenuItem> items) {
        this.items = items;
        total = 0;
        for(MenuItem i : items){
            total += i.getPrice();
        }
    }
    
    public List<MenuItem> getItems() {
        return items;
    }


    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void setScheduled(String scheduled) {
        this.scheduled = scheduled;
    }
    
    public String getScheduled() {
        return scheduled;
    }
    
    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
