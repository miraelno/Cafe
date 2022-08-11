package com.solvd.cafe.services;

import com.solvd.cafe.cafeStructure.Branch;
import com.solvd.cafe.cafeStructure.Table;
import com.solvd.cafe.exceptions.NoSuchBranchException;
import com.solvd.cafe.order.Booking;
import com.solvd.cafe.people.Client;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public abstract class BookingManagement {
    static private final Logger bookLogger = LogManager.getLogger(BookingManagement.class);

    public static Booking createBook(Client client, Branch branch, Table table){
        bookLogger.info("Please, choose in witch city you want to create a booking");
        Scanner scan = new Scanner(System.in);
        String city = scan.nextLine();
        try {
            if (branch.getCity().equals(city)) {
                bookLogger.info("How much guests will be?");
            } else {
                throw new NoSuchBranchException();
            }
        } catch (NoSuchBranchException e) {
            bookLogger.error(e.getMessage());
        }
        int num = scan.nextInt();
        bookLogger.info("And when do you want to come? Please, enter data in this format - dd.MM.yyyy HH:mm");
        Date date = null;
        try {
            scan.nextLine();
            String stringDate = scan.nextLine();
            DateFormat format = new SimpleDateFormat("dd.MM.yyyy HH:mm");
            date = format.parse(stringDate);
            bookLogger.info(date);
            bookLogger.info("Thank you!");
        } catch (Exception e) {
            System.out.println(e);
        }
        return new Booking(1, table, client, num, branch, date);
    }
    boolean canselBook(Booking booking){
        bookLogger.info("Your booking: " + booking.getBookingId() + " was canceled!");
        return true;
    }
}
