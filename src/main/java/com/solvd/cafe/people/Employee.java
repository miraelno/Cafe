package com.solvd.cafe.people;

import java.util.Date;
import java.util.Objects;

public abstract class Employee extends Person {
    private double salary;
    private int vacationsDay;

    public Employee(){
    }
    public Employee(String firstName, String lastName, String mobile, double salary,
                    int vacationsDay){
        super(firstName,lastName,mobile);
        this.salary = salary;
        this.vacationsDay = vacationsDay;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    public int getVacationsDay() {
        return vacationsDay;
    }

    public void setVacationsDay(int vacationsDay) {
        this.vacationsDay = vacationsDay;
    }
    @Override
    public String toString() {
        return "Employee{" +
                ", salary=" + salary +
                ", vacationsDay=" + vacationsDay +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.salary, salary) == 0 && vacationsDay == employee.vacationsDay;
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(),salary, vacationsDay);
    }
}


