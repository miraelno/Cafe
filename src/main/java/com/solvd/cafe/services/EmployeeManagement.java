package com.solvd.cafe.services;

import com.solvd.cafe.interfaces.IVacation;
import com.solvd.cafe.people.Employee;

public abstract class EmployeeManagement{

    IVacation approveVacation = (Employee employee)-> employee.getVacationsDay() > 0;
}
