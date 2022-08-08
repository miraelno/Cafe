package com.solvd.cafe.order;

import java.util.Arrays;
import java.util.Date;
import java.util.Objects;

public class Check {
    private int checkId;
    private int clientId;
    private int waiterId;
    private Date date;
    private Menu[] items;
    private double total;

    public Check(){

    }
    public Check(int checkId, int clientId, int waiterId, Date date, Menu[] items, double total) {
        this.checkId = checkId;
        this.clientId = clientId;
        this.waiterId = waiterId;
        this.date = date;
        this.items = items;
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

    public Menu[] getItems() {
        return items;
    }

    public void setItems(Menu[] items) {
        this.items = items;
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
        return checkId == check.checkId && clientId == check.clientId && waiterId == check.waiterId && Double.compare(check.total, total) == 0 && date.equals(check.date) && Arrays.equals(items, check.items);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(checkId, clientId, waiterId, date, total);
        result = 31 * result + Arrays.hashCode(items);
        return result;
    }

    @Override
    public String toString() {
        return "Check{" +
                "checkId=" + checkId +
                ", clientId=" + clientId +
                ", waiterId=" + waiterId +
                ", date=" + date +
                ", items=" + Arrays.toString(items) +
                ", total=" + total +
                '}';
    }
}
