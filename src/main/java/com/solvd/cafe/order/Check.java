package com.solvd.cafe.order;

import java.util.Arrays;
import java.util.Date;
import java.util.Objects;
import java.util.TreeMap;

public class Check {
    private int checkId;
    private int clientId;
    private int waiterId;
    private Date date;
    private TreeMap<Menu, Integer> menuItems;
    private double total;

    public Check(){};
    public Check(int checkId, int clientId, int waiterId, Date date, TreeMap<Menu, Integer> menuItems, double total) {
        this.checkId = checkId;
        this.clientId = clientId;
        this.waiterId = waiterId;
        this.date = date;
        this.menuItems = menuItems;
        this.total = total;
    }

    public int getCheckId() {
        return checkId;
    }

    public void setCheckId(int checkId) {
        this.checkId = checkId;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public int getWaiterId() {
        return waiterId;
    }

    public void setWaiterId(int waiterId) {
        this.waiterId = waiterId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public TreeMap<Menu, Integer> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(TreeMap<Menu, Integer> menuItems) {
        this.menuItems = menuItems;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {this.total = total;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Check check = (Check) o;
        return checkId == check.checkId && clientId == check.clientId && waiterId == check.waiterId &&
                Double.compare(check.total, total) == 0 && date.equals(check.date) && menuItems.equals(check.menuItems);
    }
    @Override
    public int hashCode() {
        return Objects.hash(checkId, clientId, waiterId, date, menuItems, total);
    }
    @Override
    public String toString() {
        return "Check{" +
                "checkId=" + checkId +
                ", clientId=" + clientId +
                ", waiterId=" + waiterId +
                ", date=" + date +
                ", menuItems=" + menuItems +
                ", total=" + total +
                '}';
    }
}
