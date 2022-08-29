package com.solvd.cafe.dataManagement;

import com.solvd.cafe.cafeStructure.Branch;
import com.solvd.cafe.data.DBMemory;
import com.solvd.cafe.exceptions.EmptyCollectionException;
import com.solvd.cafe.order.Order;
import com.solvd.cafe.services.MainMenu;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;
import java.util.stream.Collectors;

public abstract class OrderManagement {
    private static final Logger orderLogger = LogManager.getLogger(OrderManagement.class);
    private static final Scanner scanner = new Scanner(System.in);

    public static void addOrder() {
        List<Branch> branches = DBMemory.getBranches();
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        TreeMap<String, Integer> menuItems = new TreeMap<>();

        System.out.println("In witch cafe you want to add an order?");
        branches.forEach((x) -> System.out.println(x.getCity()));
        String branchString = scan.nextLine().toLowerCase();
        Branch branch = branches.stream().filter((x) -> x.getCity().toString().toLowerCase().
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
        Order order = new Order(random.nextInt(101) + 1, branches.get(0), branches.get(0).getKitchen(), menuItems,
                new Date());
        orderLogger.info("Success! Order " + order.getOrderId() + " is:\n");
        showOrderItems(order);
        orderLogger.info(DBMemory.getOrders());
        DBMemory.getOrders().add(order);
        orderLogger.info(DBMemory.getOrders());
    }

    public static Order updateOrder(Order order) {

        return null;
    }

    public static void canselOrder() {
        List<Order> orders = DBMemory.getOrders();
        Iterator<Order> orderIterator = orders.iterator();
        int orderID;
        do {
            try {
                if (orders.isEmpty()) {
                    throw new EmptyCollectionException();
                } else {
                    orderLogger.info("Which order need to delete:");
                    orders.forEach((x) -> System.out.println(x.getOrderId()));
                    break;
                }
            } catch (EmptyCollectionException e) {
                orderLogger.error(e.getMessage());
            }
        } while (true);
        orderID = scanner.nextInt();
        while (orderIterator.hasNext()) {
            Order orderNext = orderIterator.next();
            if (orderNext.getOrderId() == orderID)
                orderIterator.remove();
        }
        orderLogger.info(orders);
        orderLogger.info("Order was deleted!");
    }

    public static void findOrder(){

    }
    public static void showOrderItems(Order order) {
        TreeMap<String, Integer> menuItems = order.getMenuItems();
        Set set = menuItems.entrySet();
        Iterator i = set.iterator();

        while (i.hasNext()) {
            Map.Entry me = (Map.Entry) i.next();
            System.out.println(me.getKey() + "- " + me.getValue());
        }
    }
}


