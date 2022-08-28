package com.solvd.cafe.data;

import com.solvd.cafe.cafeStructure.Branch;
import com.solvd.cafe.menu.Menu;
import com.solvd.cafe.menu.Product;
import com.solvd.cafe.order.Booking;
import com.solvd.cafe.order.Check;
import com.solvd.cafe.order.Order;
import com.solvd.cafe.people.Client;
import com.solvd.cafe.people.Waiter;

import java.util.ArrayList;
import java.util.List;

public abstract class DBMemory {
    private static List<Booking> bookings = new ArrayList<>();
    private static List<Order> orders = new ArrayList<>();
    private static List<Product> products = new ArrayList<>();
    private static List<Check> checks = new ArrayList<>();
    private static List<Client> clients;
    private static List<Branch> branches;
    private static Menu menu;
    private static List<Waiter> waiters;

    static {
        branches = GenerateData.BranchGenerator();
        clients = GenerateData.ClientsGenerator();
        menu = GenerateData.MenuGenerator();
        waiters = GenerateData.WaiterGenerator();
    }

    public static List<Booking> getBookings() {
        return bookings;
    }

    public static List<Order> getOrders() {
        return orders;
    }

    public static List<Product> getProducts() {
        return products;
    }

    public static List<Check> getChecks() {
        return checks;
    }

    public static List<Client> getClients() {
        return clients;
    }

    public static List<Branch> getBranches() {
        return branches;
    }

    public static Menu getMenu() {
        return menu;
    }

    public static List<Waiter> getWaiters() {
        return waiters;
    }
}
