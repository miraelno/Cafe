package com.solvd.cafe.cafeStructure;

import java.util.Objects;

public class Table {
    private int tableId;
    private int numberOfSeats;

    public Table() {
    }

    public Table(int tableId, int numberOfSeats) {
        this.tableId = tableId;
        this.numberOfSeats = numberOfSeats;
    }

    public int getTableId() {
        return tableId;
    }

    public void setTableId(int tableId) {
        this.tableId = tableId;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Table table = (Table) o;
        return tableId == table.tableId && numberOfSeats == table.numberOfSeats;
    }

    @Override
    public int hashCode() {
        return Objects.hash(tableId, numberOfSeats);
    }

    @Override
    public String toString() {
        return "Table{" +
                "tableId=" + tableId +
                ", numberOfSeats=" + numberOfSeats +
                '}';
    }
}
