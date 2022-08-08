package com.solvd.cafe.cafeStructure;

import com.solvd.cafe.people.Client;
import com.solvd.cafe.people.Employee;

import java.util.Arrays;
import java.util.Objects;

public class Cafe {
    private String nameCafe;
    private String nameOwner;
    private Employee[] employee;
    private Branch[] branch;
    private Client[] client;

    public Cafe(){
    }
    public Cafe(String nameCafe, String nameOwner, Employee[] employee, Branch[] branch, Client[] client){
        this.nameCafe = nameCafe;
        this.nameOwner = nameOwner;
        this.employee = employee;
        this.branch = branch;
        this.client = client;
    }

    public String getNameCafe() {
        return nameCafe;
    }

    public void setNameCafe(String nameCafe) {
        this.nameCafe = nameCafe;
    }

    public String getNameOwner() {
        return nameOwner;
    }

    public void setNameOwner(String nameOwner) {
        this.nameOwner = nameOwner;
    }

    public Employee[] getEmployee() {
        return employee;
    }

    public void setEmployee(Employee[] employee) {
        this.employee = employee;
    }

    public Branch[] getBranch() {
        return branch;
    }

    public void setBranch(Branch[] branch) {
        this.branch = branch;
    }

    public Client[] getClient() {
        return client;
    }

    public void setClient(Client[] client) {
        this.client = client;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cafe cafe = (Cafe) o;
        return nameCafe.equals(cafe.nameCafe) && nameOwner.equals(cafe.nameOwner) &&
                Arrays.equals(employee, cafe.employee) && Arrays.equals(branch, cafe.branch) &&
                Arrays.equals(client, cafe.client);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(nameCafe, nameOwner);
        result = 31 * result + Arrays.hashCode(employee);
        result = 31 * result + Arrays.hashCode(branch);
        result = 31 * result + Arrays.hashCode(client);
        return result;
    }

    @Override
    public String toString() {
        return "Cafe{" +
                "nameCafe='" + nameCafe + '\'' +
                ", nameOwner='" + nameOwner + '\'' +
                ", employee=" + Arrays.toString(employee) +
                ", branch=" + Arrays.toString(branch) +
                ", client=" + Arrays.toString(client) +
                '}';
    }
}
