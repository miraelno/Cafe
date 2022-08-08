package com.solvd.cafe.people;

import com.solvd.cafe.cafeStructure.Branch;
import com.solvd.cafe.cafeStructure.Table;
import com.solvd.cafe.interfaces.IOrdering;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Waiter extends Employee implements IOrdering {
    private static Logger waiterLogger = LogManager.getLogger(Waiter.class.getClass());
    private Branch branch;
    private boolean speaksEnglish;

    public Waiter (){
    }

    public Waiter(Branch branch, boolean speaksEnglish) {
        this.branch = branch;
        this.speaksEnglish = speaksEnglish;
    }

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    public boolean isSpeaksEnglish() {
        return speaksEnglish;
    }

    public void setSpeaksEnglish(boolean speaksEnglish) {
        this.speaksEnglish = speaksEnglish;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Waiter waiter = (Waiter) o;
        return speaksEnglish == waiter.speaksEnglish && branch.equals(waiter.branch);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), branch, speaksEnglish);
    }

    @Override
    public String toString() {
        return "Waiter{" +
                "branch=" + branch +
                ", speaksEnglish=" + speaksEnglish +
                '}';
    }

    @Override
    public void takeOrder(Table table, Waiter waiter, ArrayList menuItems) {
        waiterLogger.info("Okay, you ordered" + menuItems);
    }
}
