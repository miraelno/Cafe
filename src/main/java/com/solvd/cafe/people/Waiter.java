package com.solvd.cafe.people;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;

public class Waiter extends Employee{
    private static final Logger waiterLogger = LogManager.getLogger(Waiter.class);
    private boolean speaksEnglish;

    public Waiter (){
    }

    public Waiter(String firstName, String lastName, String mobile, double salary,
                  int vacationsDay, boolean speaksEnglish) {
        super(firstName,lastName,mobile,salary,vacationsDay);
        this.speaksEnglish = speaksEnglish;
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
        return speaksEnglish == waiter.speaksEnglish;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(),speaksEnglish);
    }

    @Override
    public String toString() {
        return "Waiter{" +
                ", speaksEnglish=" + speaksEnglish +
                '}';
    }
}
