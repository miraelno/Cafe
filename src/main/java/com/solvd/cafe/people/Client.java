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


public class Client{
    private static Logger clientLogger = LogManager.getLogger(Client.class);
    private int clientId;
    private String name;
    private String mobileNumber;
    private boolean isHaveDiscount;

    public Client() {

    }

    public Client(int clientId, String name, String mobileNumber, boolean isHaveDiscount) {
        this.clientId = clientId;
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.isHaveDiscount = isHaveDiscount;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
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
        return clientId == client.clientId && isHaveDiscount == client.isHaveDiscount && name.equals(client.name) &&
                mobileNumber.equals(client.mobileNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientId, name, mobileNumber, isHaveDiscount);
    }

    @Override
    public String toString() {
        return "Client{" +
                "clientId=" + clientId +
                ", name='" + name + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", isHaveDiscount=" + isHaveDiscount +
                '}';
    }
}
