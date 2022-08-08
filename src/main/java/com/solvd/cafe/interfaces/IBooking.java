package com.solvd.cafe.interfaces;

import com.solvd.cafe.cafeStructure.Branch;
import com.solvd.cafe.order.Booking;
import com.solvd.cafe.people.Client;

public interface IBooking {
    void createBook(Client client, Branch branch);
    void canselBook(Client client, Booking booking);
}
