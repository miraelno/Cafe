package com.solvd.cafe.interfaces;

import com.solvd.cafe.people.Employee;

@FunctionalInterface
public interface IVacation {
    boolean approve (Employee employee);
}
