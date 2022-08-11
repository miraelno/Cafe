package com.solvd.cafe.order;

import java.util.Objects;

public class Menu {
    private String name;
    private String foodType;        //Desert, meal ect.
    private double price;
    private int weight;

    public Menu(){

    }
    public Menu( String name, String foodType, double price, int weight) {
        this.name = name;
        this.foodType = foodType;
        this.price = price;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {this.weight = weight;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Menu menu = (Menu) o;
        return Double.compare(menu.price, price) == 0 && weight == menu.weight && name.equals(menu.name) && foodType.equals(menu.foodType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, foodType, price, weight);
    }

    @Override
    public String toString() {
        return "Menu{" +
                ", name='" + name + '\'' +
                ", foodType='" + foodType + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                '}';
    }
}
