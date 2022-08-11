package com.solvd.cafe.order;

import com.solvd.cafe.cafeStructure.Branch;
import com.solvd.cafe.cafeStructure.Table;
import com.solvd.cafe.people.Client;

import java.util.Date;
import java.util.Objects;

public class Booking {
    private int bookingId;
    private Table table;
    private Client client;
    private int numOfClients;
    private Branch branch;
    private Date dateBooking;

    public Booking() {

    }

    public Booking(int bookingId, Table table, Client client, int numOfClients, Branch branch, Date dateBooking) {
        this.bookingId = bookingId;
        this.table = table;
        this.client = client;
        this.numOfClients = numOfClients;
        this.branch = branch;
        this.dateBooking = dateBooking;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public int getNumOfClients() {
        return numOfClients;
    }

    public void setNumOfClients(int numOfClients) {
        this.numOfClients = numOfClients;
    }

    public Client getClient() {
        return client;
    }

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    public Date getDateBooking() {
        return dateBooking;
    }

    public void setDateBooking(Date dateBooking) {
        this.dateBooking = dateBooking;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Booking booking = (Booking) o;
        return bookingId == booking.bookingId && numOfClients == booking.numOfClients && table.equals(booking.table) && client.equals(booking.client) && branch.equals(booking.branch) && dateBooking.equals(booking.dateBooking);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookingId, table, client, numOfClients, branch, dateBooking);
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingId=" + bookingId +
                ", table=" + table +
                ", client=" + client +
                ", numOfClients=" + numOfClients +
                ", branch=" + branch +
                ", dateBooking=" + dateBooking +
                '}';
    }
}
