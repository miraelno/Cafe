package com.solvd.cafe.interfaces;

import com.solvd.cafe.people.Employee;

@FunctionalInterface
public interface IApproveVacation {
    boolean approve (Employee employee);
}
