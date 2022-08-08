package com.solvd.cafe.cafeStructure;

import java.util.Objects;

public class Table {
    private int tableId;
    private int numberOfSeats;
    private Branch branch;
    private Hall hall;

    public Table(){

    }
    public Table(int tableId, int numberOfSeats, Branch branch, Hall hall) {
        this.tableId = tableId;
        this.numberOfSeats = numberOfSeats;
        this.branch = branch;
        this.hall = hall;
    }

    public int getTableId() {
        return tableId;
    }

    public void setTableId(int tableId) {
        this.tableId = tableId;
    }

    public int getNumberOfSeats() {return numberOfSeats;}

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    public Hall getHall() {
        return hall;
    }

    public void setHall(Hall hall) {this.hall = hall;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Table table = (Table) o;
        return tableId == table.tableId && numberOfSeats == table.numberOfSeats && branch.equals(table.branch) && hall.equals(table.hall);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tableId, numberOfSeats, branch, hall);
    }

    @Override
    public String toString() {
        return "Table{" +
                "tableId=" + tableId +
                ", numberOfSeats=" + numberOfSeats +
                ", branch=" + branch +
                ", hall=" + hall +
                '}';
    }
}
