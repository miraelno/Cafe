package com.solvd.cafe.order;

import com.solvd.cafe.enums.MenuItemType;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Menu {
    private List<Product> product;

    public Menu (){

    }
    public Menu(List<Product> product) {
        this.product = product;
    }

    public List<Product> getProduct() {
        return product;
    }

    public void setProduct(List<Product> product) {
        this.product = product;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Menu menu = (Menu) o;
        return product.equals(menu.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(product);
    }

    @Override
    public String toString() {
        return "Our menu:\n" +
                product;
    }
}
