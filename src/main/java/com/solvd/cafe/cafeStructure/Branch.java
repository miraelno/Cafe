package com.solvd.cafe.cafeStructure;

import com.solvd.cafe.interfaces.IWorking;
import com.solvd.cafe.interfaces.IFindFreeTable;
import com.solvd.cafe.people.Administrator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;

public class Branch implements IWorking, IFindFreeTable {    //Café branches
    Logger branchLogger = LogManager.getLogger(Branch.class.getClass());
    private int branchId;
    private String city;
    private String address;
    private int numberOfHalls;
    private int numberOfSeats;
    private Administrator administrator;

    public Branch(){

    }
    public Branch(int branchId, String city, String address, int numberOfHalls, int numberOfSeats, Administrator administrator){

        this.branchId = branchId;
        this.city = city;
        this.address = address;
        this.numberOfHalls = numberOfHalls;
        this.numberOfSeats = numberOfSeats;
        this.administrator = administrator;
    }

    public int getBranchId() {
        return branchId;
    }

    public void setBranchId(int branchId) {
        this.branchId = branchId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumberOfHalls() {
        return numberOfHalls;
    }

    public void setNumberOfHalls(int numberOfHalls) {
        this.numberOfHalls = numberOfHalls;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public Administrator getAdministrator() {
        return administrator;
    }

    public void setAdministrator(Administrator administrator) {
        this.administrator = administrator;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Branch branch = (Branch) o;
        return branchId == branch.branchId && numberOfHalls == branch.numberOfHalls && numberOfSeats == branch.numberOfSeats && city.equals(branch.city) && address.equals(branch.address) && administrator.equals(branch.administrator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(branchId, city, address, numberOfHalls, numberOfSeats, administrator);
    }

    @Override
    public String toString() {
        return "Branch{" +
                "branchId=" + branchId +
                ", city='" + city + '\'' +
                ", address='" + address + '\'' +
                ", numberOfHalls=" + numberOfHalls +
                ", numberOfSeats=" + numberOfSeats +
                ", administrator=" + administrator +
                '}';
    }

    @Override
    public boolean work() {
    branchLogger.info("Yes, we are open!");
    return true;
    }

    @Override
    public void find(Branch branch) {
        branchLogger.info("Let me see...(Need to develop)");
    }
}
