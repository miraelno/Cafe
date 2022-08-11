package com.solvd.cafe.services;

import com.solvd.cafe.cafeStructure.Branch;
import com.solvd.cafe.cafeStructure.Kitchen;
import com.solvd.cafe.cafeStructure.Table;
import com.solvd.cafe.order.Menu;
import com.solvd.cafe.order.Order;
import com.solvd.cafe.people.Waiter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeMap;

public abstract class OrderManagement {
    private static final Logger orderLogger = LogManager.getLogger(OrderManagement.class);

    public static Order takeOrder(Table table, Waiter waiter) {
        Scanner scan = new Scanner(System.in);
        TreeMap<String, Integer> menuItems = new TreeMap<>();
        orderLogger.info("Hello!\n");
        String item;
        do {
            orderLogger.info("What do you want to order?");
            item = scan.nextLine();
            orderLogger.info("How much of this?");
            int qua = scan.nextInt();
            menuItems.put(item, qua);
            orderLogger.info("Anything else? Type 'No' to end ordering or 'Yes' to order more.");
            scan.nextLine();
            item = scan.nextLine();
        } while (item.equals("Yes"));
        orderLogger.info("Okay, your order is "+ menuItems);
        return new Order(new Random().nextInt(),new Branch() ,new Kitchen(), waiter, menuItems, new Date());
    }

    public static Order updateOrder(Order order, TreeMap<Menu, Integer> menuItems) {
        return null;
    }
}
