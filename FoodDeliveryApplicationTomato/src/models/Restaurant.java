package models;

import java.util.*;

public class Restaurant {
    
    private static int nextRestaurantId = 0;
    
    private int restaurantId = 0;
    private String name;
    private String location;
    private List<MenuItem> menuItemList;

    public Restaurant(String name, String location) {
        this.location = location;
        this.name = name;
        this.restaurantId = ++nextRestaurantId;
        menuItemList=new ArrayList<>();
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    
    public void addMenuItem(MenuItem item){
        menuItemList.add(item);
    }
    
    public List<MenuItem> getMenu(){
        return menuItemList;
    }
}