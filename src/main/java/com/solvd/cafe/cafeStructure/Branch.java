package com.solvd.cafe.cafeStructure;

import com.solvd.cafe.enums.CityBranch;
import com.solvd.cafe.interfaces.IFindTable;
import com.solvd.cafe.interfaces.IWork;
import com.solvd.cafe.people.Administrator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Branch implements IWork, IFindTable {
    Logger branchLogger = LogManager.getLogger(Branch.class);
    private int branchId;
    private CityBranch city;
    private String address;
    private Administrator administrator;
    private Kitchen kitchen;
    private List<Table> table;

    public Branch() {

    }

    public Branch(int branchId, CityBranch city, String address, Administrator administrator, Kitchen kitchen, List<Table> table) {
        this.branchId = branchId;
        this.city = city;
        this.address = address;
        this.administrator = administrator;
        this.kitchen = kitchen;
        this.table = table;
    }

    public int getBranchId() {
        return branchId;
    }

    public void setBranchId(int branchId) {
        this.branchId = branchId;
    }

    public CityBranch getCity() {
        return city;
    }

    public void setCity(CityBranch city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Administrator getAdministrator() {
        return administrator;
    }

    public void setAdministrator(Administrator administrator) {
        this.administrator = administrator;
    }

    public Kitchen getKitchen() {
        return kitchen;
    }

    public void setKitchen(Kitchen kitchen) {
        this.kitchen = kitchen;
    }

    public List<Table> getTable() {
        return table;
    }

    public void setTable(List<Table> table) {
        this.table = table;
    }

    @Override
    public boolean work(Date date) {
        branchLogger.info("Yes, we are open!");
        return true;
    }

    @Override
    public Table findTable(Branch branch) {
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Branch branch = (Branch) o;
        return branchId == branch.branchId && city == branch.city && address.equals(branch.address) && administrator.equals(branch.administrator) && kitchen.equals(branch.kitchen) && table.equals(branch.table);
    }

    @Override
    public int hashCode() {
        return Objects.hash(branchId, city, address, administrator, kitchen, table);
    }

    @Override
    public String toString() {
        return "Branch{" +
                "branchId=" + branchId +
                ", city=" + city +
                ", address='" + address + '\'' +
                ", administrator=" + administrator +
                ", kitchen=" + kitchen +
                ", table=" + table +
                '}';
    }
}
