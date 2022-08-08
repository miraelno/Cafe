package com.solvd.cafe.people;


import com.solvd.cafe.cafeStructure.Branch;
import com.solvd.cafe.cafeStructure.Kitchen;

import java.util.Objects;

public class Cook extends Employee {
    private Branch branch;
    private Kitchen kitchen;
    private boolean isChef;

    public Cook(){
    }

    public Cook(Branch branch, Kitchen kitchen, boolean isChef) {
        this.branch = branch;
        this.kitchen = kitchen;
        this.isChef = isChef;
    }

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    public Kitchen getKitchen() {return kitchen;}

    public void setKitchen(Kitchen kitchen) {
        this.kitchen = kitchen;
    }

    public boolean isChef() {
        return isChef;
    }

    public void setChef(boolean chef) {
        isChef = chef;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cook cook = (Cook) o;
        return isChef == cook.isChef && branch.equals(cook.branch) && kitchen.equals(cook.kitchen);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), branch, kitchen, isChef);
    }

    @Override
    public String toString() {
        return "Cook{" +
                "branch=" + branch +
                ", kitchen=" + kitchen +
                ", isChef=" + isChef +
                '}';
    }
}
