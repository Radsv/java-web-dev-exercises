package org.launchcode.java.RestaurantPractice;

import java.util.ArrayList;

public class MenuP {
    private ArrayList<MenuItemP> food;
    private String lastUpdated;

    public MenuP(String lastUpdated){
        this.food = new ArrayList<MenuItemP>();
        this.lastUpdated = lastUpdated;
    }

    public ArrayList<MenuItemP> getFood() {
        return food;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
    public void addFood(MenuItemP food1){
        this.food.add(food1);
    }
}
