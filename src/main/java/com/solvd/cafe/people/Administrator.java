package com.solvd.cafe.people;


import com.solvd.cafe.exceptions.VacationException;
import com.solvd.cafe.interfaces.IApproveVacation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import java.util.Objects;

public class Administrator extends Employee implements IApproveVacation {
    Logger adminLogger = LogManager.getLogger(Administrator.class.getClass());
    private int branchId;
    private String workMobileNumber;

    public Administrator(){
    }
    public Administrator(int branchId, String workMobileNumber) {
        this.branchId = branchId;
        this.workMobileNumber = workMobileNumber;
    }

    public int getBranchId() {
        return branchId;
    }

    public void setBranchId(int branchId) {
        this.branchId = branchId;
    }

    public String getWorkMobileNumber() {
        return workMobileNumber;
    }

    public void setWorkMobileNumber(String workMobileNumber) {
        this.workMobileNumber = workMobileNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Administrator that = (Administrator) o;
        return branchId == that.branchId && workMobileNumber.equals(that.workMobileNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), branchId, workMobileNumber);
    }

    @Override
    public String toString() {
        return "Administrator{" +
                "branchId=" + branchId +
                ", workMobileNumber='" + workMobileNumber + '\'' +
                '}';
    }

    public boolean approve(Employee employee){
        try {
            if(employee.getVacationsDay() > 0){
                adminLogger.info("Have a good vacation!");
            }
            else {
                throw new VacationException();
            }
        } catch (VacationException e){
            adminLogger.error(e.getMessage());
        }
        return false;
    }
}
