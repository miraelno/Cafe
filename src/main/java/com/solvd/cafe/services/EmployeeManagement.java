package com.solvd.cafe.services;

import com.solvd.cafe.interfaces.IApproveVacation;
import com.solvd.cafe.people.Employee;

public abstract class EmployeeManagement{

    IApproveVacation approveVacation = (Employee employee)-> employee.getVacationsDay() > 0;
}
