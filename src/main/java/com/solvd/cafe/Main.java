package com.solvd.cafe;


import com.solvd.cafe.cafeStructure.Branch;
import com.solvd.cafe.cafeStructure.Hall;
import com.solvd.cafe.cafeStructure.Kitchen;
import com.solvd.cafe.cafeStructure.Table;
import com.solvd.cafe.order.Booking;
import com.solvd.cafe.people.Administrator;
import com.solvd.cafe.people.Client;
import com.solvd.cafe.people.Waiter;
import com.solvd.cafe.services.BookingManagement;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Main {
    public static void main(String[] args) {
        Logger mainLogger = LogManager.getLogger(Main.class);

        Client cli = new Client(1, "Tanya", "0936290182", false);
        Administrator adm = new Administrator(1, "0826549125");
        Branch branch = new Branch(1, "Odessa", "Aleksandrovskiy avenue, 27", 2,
                50, adm);
        Hall hall = new Hall(1, branch, false);
        Table table = new Table(1, 2, branch, hall);
        Kitchen kit = new Kitchen();
        Waiter waiter = new Waiter();
        Booking bk = BookingManagement.createBook(cli, branch, table);
        mainLogger.info(bk);
        //Order order = OrderManagement.takeOrder(table, waiter);
        //kit.addOrder(order);

    }
}
