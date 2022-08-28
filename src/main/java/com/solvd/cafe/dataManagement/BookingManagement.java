package com.solvd.cafe.dataManagement;

import com.solvd.cafe.cafeStructure.Branch;
import com.solvd.cafe.data.DBMemory;
import com.solvd.cafe.exceptions.NoSuchBranchException;
import com.solvd.cafe.order.Booking;
import com.solvd.cafe.people.Client;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public abstract class BookingManagement{
    static private final Logger bookLogger = LogManager.getLogger(BookingManagement.class);

    public static Booking createBook(Client client, List<Branch> branches) {
        Random random = new Random();
        bookLogger.info("Please, choose in witch city you want to create a booking");
        branches.forEach((x) -> System.out.println(x.getCity()));
        Scanner scan = new Scanner(System.in);
        String city = scan.nextLine().toLowerCase();
        Branch branch = null;
        try {
            if (branches.stream().anyMatch((x) -> x.getCity().toString().toLowerCase().equals(city))) {
                branch = branches.stream().filter((x) -> x.getCity().toString().toLowerCase().
                        equals(city)).collect(Collectors.toList()).stream().findFirst().get();
            } else {
                throw new NoSuchBranchException();
            }

        } catch (NoSuchBranchException e) {
            bookLogger.error(e.getMessage());
        }
        bookLogger.info("How many clients?");
        int num = scan.nextInt();
        bookLogger.info("And when do you want to come? Please, enter data in this format - dd.MM.yyyy HH:mm");
        Date date = null;
        try {
            scan.nextLine();
            String stringDate = scan.nextLine();
            DateFormat format = new SimpleDateFormat("dd.MM.yyyy HH:mm");
            date = format.parse(stringDate);
            bookLogger.info("Thank you!");
        } catch (Exception e) {
            System.out.println(e);
        }
        Booking booking = new Booking(random.nextInt(101) + 1, branch.getTable().get(0), client, num, branch, date);
        List<Booking> bookingList = DBMemory.getBookings();
        bookLogger.info(bookingList);
        bookLogger.info(booking);
        bookingList.add(booking);
        bookLogger.info(bookingList);
        return booking;
    }
    boolean canselBook(Booking booking){
        bookLogger.info("Your booking: " + booking.getBookingId() + " was canceled!");
        //DELETE FROM Booking
        //WHERE id = booking.getId();
        return true;
    }
}
