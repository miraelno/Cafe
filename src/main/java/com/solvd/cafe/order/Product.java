package com.solvd.cafe.order;

import com.solvd.cafe.enums.MenuItemType;
import com.solvd.cafe.people.Provider;

import java.util.Objects;

public class Product {
    private String name;
    private MenuItemType type;
    private int price;

    public Product(){

    }
    public Product(String name, MenuItemType type, int price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MenuItemType getType() {
        return type;
    }

    public void setType(MenuItemType type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return price == product.price && name.equals(product.name) && type == product.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, price);
    }

    @Override
    public String toString() {
        return "\n'" + name +'\'' + " - " + price+ " UAH";
    }

}
