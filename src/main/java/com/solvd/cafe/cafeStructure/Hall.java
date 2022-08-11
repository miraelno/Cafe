package com.solvd.cafe.cafeStructure;

import com.solvd.cafe.interfaces.IWorking;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;

public class Hall implements IWorking {
    Logger hallLogger = LogManager.getLogger(Hall.class);
    private int hallId;
    private Branch branch;
    private boolean isForSmokers;

    public Hall(){
    }

    public Hall(int hallId, Branch branch, boolean isForSmokers) {
        this.hallId = hallId;
        this.branch = branch;
        this.isForSmokers = isForSmokers;
    }

    public int getHallId() {
        return hallId;
    }

    public void setHallId(int hallId) {
        this.hallId = hallId;
    }

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    public boolean isForSmokers() {
        return isForSmokers;
    }

    public void setForSmokers(boolean forSmokers) {isForSmokers = forSmokers;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hall hall = (Hall) o;
        return hallId == hall.hallId && isForSmokers == hall.isForSmokers && branch.equals(hall.branch);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hallId, branch,  isForSmokers);
    }

    @Override
    public String toString() {
        return "Hall{" +
                "hallId=" + hallId +
                ", branch=" + branch +
                ", isForSmokers=" + isForSmokers +
                '}';
    }

    @Override
    public boolean work() {
        hallLogger.info("Yes, we are open!");
        return true;
    }
}
