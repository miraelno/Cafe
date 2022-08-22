package com.solvd.cafe.people;

import com.solvd.cafe.cafeStructure.Branch;
import com.solvd.cafe.cafeStructure.Table;
import com.solvd.cafe.exceptions.NoSuchBranchException;
import com.solvd.cafe.interfaces.IBooking;
import com.solvd.cafe.order.Booking;
import org.apache.logging.log4j.*;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;
import java.util.Scanner;


public class Client extends Person{
    private static Logger clientLogger = LogManager.getLogger(Client.class);
    private int clientId;
    private boolean isHaveDiscount;

    public Client() {

    }

    public Client(String firstName, String lastName, String mobile,int clientId,boolean isHaveDiscount) {
        super(firstName,lastName,mobile);
        this.clientId = clientId;
        this.isHaveDiscount = isHaveDiscount;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public boolean isHaveDiscount() {
        return isHaveDiscount;
    }

    public void setHaveDiscount(boolean haveDiscount) {
        isHaveDiscount = haveDiscount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return clientId == client.clientId && isHaveDiscount == client.isHaveDiscount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientId,isHaveDiscount);
    }

    @Override
    public String toString() {
        return "Client{" +
                "clientId=" + clientId +
                ", isHaveDiscount=" + isHaveDiscount +
                '}';
    }
}
