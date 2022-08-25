package com.solvd.cafe.people;

import com.solvd.cafe.exceptions.VacationException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;

public class Administrator extends Employee{
    Logger adminLogger = LogManager.getLogger(Administrator.class);
    private String workMobileNumber;

    public Administrator() {
    }

    public Administrator(String firstName, String lastName, String mobile, double salary,
                         int vacationsDay, String workMobileNumber) {
        super(firstName,lastName,mobile,salary,vacationsDay);
        this.workMobileNumber = workMobileNumber;
    }

    public String getWorkMobileNumber() {
        return workMobileNumber;
    }

    public void setWorkMobileNumber(String workMobileNumber) {
        this.workMobileNumber = workMobileNumber;
    }

    public boolean approve(Employee employee) {
        try {
            if (employee.getVacationsDay() > 0) {
                adminLogger.info("Have a good vacation!");
            } else {
                throw new VacationException();
            }
        } catch (VacationException e) {
            adminLogger.error(e.getMessage());
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Administrator that = (Administrator) o;
        return workMobileNumber.equals(that.workMobileNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), workMobileNumber);
    }

}
