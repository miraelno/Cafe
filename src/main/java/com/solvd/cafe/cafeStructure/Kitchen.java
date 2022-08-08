package com.solvd.cafe.cafeStructure;

import com.solvd.cafe.interfaces.IWorking;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;

public class Kitchen implements IWorking {
    Logger kitchenLogger = LogManager.getLogger(Kitchen.class.getClass());
    private int branchId;
    private int maxNumberOfCooks;
    private boolean isTakesOrders;
    private String chef;

    public Kitchen(){

    }
    public Kitchen(int branchId, int maxNumberOfCooks, boolean isTakesOrders, String chef) {
        this.branchId = branchId;
        this.maxNumberOfCooks = maxNumberOfCooks;
        this.isTakesOrders = isTakesOrders;
        this.chef = chef;
    }

    public int getBranchId() {
        return branchId;
    }

    public void setBranchId(int branchId) {
        this.branchId = branchId;
    }

    public int getMaxNumberOfCooks() {
        return maxNumberOfCooks;
    }

    public void setMaxNumberOfCooks(int maxNumberOfCooks) {
        this.maxNumberOfCooks = maxNumberOfCooks;
    }

    public boolean isTakesOrders() {
        return isTakesOrders;
    }

    public void setTakesOrders(boolean takesOrders) {
        isTakesOrders = takesOrders;
    }

    public String getChef() {
        return chef;
    }

    public void setChef(String chef) {this.chef = chef;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Kitchen kitchen = (Kitchen) o;
        return branchId == kitchen.branchId && maxNumberOfCooks == kitchen.maxNumberOfCooks && isTakesOrders == kitchen.isTakesOrders && chef.equals(kitchen.chef);
    }

    @Override
    public int hashCode() {
        return Objects.hash(branchId, maxNumberOfCooks, isTakesOrders, chef);
    }

    @Override
    public String toString() {
        return "Kitchen{" +
                "branchId=" + branchId +
                ", maxNumberOfCooks=" + maxNumberOfCooks +
                ", isTakesOrders=" + isTakesOrders +
                ", chef='" + chef + '\'' +
                '}';
    }

    @Override
    public boolean work() {
        kitchenLogger.info("Yes, we are open!");
        return true;
    }
}
