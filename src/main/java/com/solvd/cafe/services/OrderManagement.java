package com.solvd.cafe.services;

import com.solvd.cafe.cafeStructure.Branch;
import com.solvd.cafe.menu.Menu;
import com.solvd.cafe.order.Booking;
import com.solvd.cafe.order.Order;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;
import java.util.stream.Collectors;

public abstract class OrderManagement{
    private static final Logger orderLogger = LogManager.getLogger(OrderManagement.class);

    public static Order addOrder(List<Branch> branches, Menu menu) {
        Scanner scan = new Scanner(System.in);
        TreeMap<String, Integer> menuItems = new TreeMap<>();

        System.out.println("In witch cafe you want to add an order?");
        branches.forEach((x)-> System.out.println(x.getCity()));
        String branchString  = scan.nextLine().toLowerCase();
        Branch branch = branches.stream().filter((x)->x.getCity().toString().toLowerCase().
                equals(branchString)).collect(Collectors.toList()).stream().findFirst().get();
        String item;
        orderLogger.info("What do you want to add?");
        item = scan.nextLine();
        do {
            orderLogger.info("How much of this?");
            int qua = scan.nextInt();
            menuItems.put(item, qua);
            orderLogger.info("Anything else? Type 'No' to finish.");
            scan.nextLine();
            item = scan.nextLine();
        } while (!item.equals("No"));
        Order order = new Order(new Random().nextInt(), branches.get(0), branches.get(0).getKitchen(), menuItems,
                new Date());
        orderLogger.info("Success! Order "+ order.getOrderId() + " is:\n");
        showOrderItems(order);
        return order;
    }

    public static Order updateOrder(Order order) {

        return null;
    }

    public static void showOrderItems(Order order){
        TreeMap<String, Integer> menuItems = order.getMenuItems();
        Set set = menuItems.entrySet();
        Iterator i = set.iterator();

        while(i.hasNext()){
            Map.Entry me = (Map.Entry)i.next();
            System.out.println(me.getKey()+ "- "+ me.getValue());
        }
    }

    boolean canselOrder(Order order){
        orderLogger.info("Order: " + order.getOrderId() + " was canceled!");
        //DELETE FROM Order
        //WHERE id = order.getId();
        return true;
    }
}


