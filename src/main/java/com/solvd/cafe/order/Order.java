package com.solvd.cafe.order;

import com.solvd.cafe.cafeStructure.Branch;
import com.solvd.cafe.cafeStructure.Kitchen;
import com.solvd.cafe.people.Waiter;

import java.util.Arrays;
import java.util.Date;
import java.util.Objects;
import java.util.TreeMap;

public class Order {
    private int orderId;
    private Branch branch;
    private Kitchen kitchen;
    private Waiter waiter;
    private TreeMap<String, Integer> menuItems;
    private Date dateOrder;

    public Order() {

    }
    public Order(int orderId, Branch branch, Kitchen kitchen, TreeMap<String, Integer> menuItems,
                 Date dateOrder) {
        this.orderId = orderId;
        this.branch = branch;
        this.kitchen = kitchen;
        this.menuItems = menuItems;
        this.dateOrder = dateOrder;
    }
    public Order(int orderId, Branch branch, Kitchen kitchen, Waiter waiter, TreeMap<String, Integer> menuItems,
                 Date dateOrder) {
        this.orderId = orderId;
        this.branch = branch;
        this.kitchen = kitchen;
        this.waiter = waiter;
        this.menuItems = menuItems;
        this.dateOrder = dateOrder;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    public Kitchen getKitchen() {
        return kitchen;
    }

    public void setKitchen(Kitchen kitchen) {
        this.kitchen = kitchen;
    }

    public Waiter getWaiter() {
        return waiter;
    }

    public void setWaiter(Waiter waiter) {
        this.waiter = waiter;
    }

    public TreeMap<String, Integer> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(TreeMap<String, Integer> menuItems) {
        this.menuItems = menuItems;
    }

    public Date getDateOrder() {
        return dateOrder;
    }

    public void setDateOrder(Date dateOrder) {
        this.dateOrder = dateOrder;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return orderId == order.orderId && branch.equals(order.branch) && kitchen.equals(order.kitchen) &&
                waiter.equals(order.waiter) && menuItems.equals(order.menuItems) && dateOrder.equals(order.dateOrder);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, branch, kitchen, waiter, menuItems, dateOrder);
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", branch=" + branch +
                ", kitchen=" + kitchen +
                ", waiter=" + waiter +
                ", menuItems=" + menuItems +
                ", dateOrder=" + dateOrder +
                '}';
    }
}
