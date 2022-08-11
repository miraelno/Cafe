package com.solvd.cafe.interfaces;

import com.solvd.cafe.cafeStructure.Branch;
import com.solvd.cafe.cafeStructure.Table;
import com.solvd.cafe.order.Booking;
import com.solvd.cafe.people.Client;

public interface IBooking {
    Booking createBook(Client client, Branch branch, Table table);
    boolean canselBook(Booking booking);
}
