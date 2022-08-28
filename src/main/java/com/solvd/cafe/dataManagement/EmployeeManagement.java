package com.solvd.cafe.dataManagement;

import com.solvd.cafe.interfaces.IVacation;
import com.solvd.cafe.people.Employee;

public abstract class EmployeeManagement{

    IVacation approveVacation = (Employee employee)-> employee.getVacationsDay() > 0;
}
