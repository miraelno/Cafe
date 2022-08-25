package com.solvd.cafe.cafeStructure;

import com.solvd.cafe.people.Client;
import com.solvd.cafe.people.Employee;

import java.util.List;
import java.util.Objects;

public class Cafe {
    private String nameCafe;
    private String nameOwner;
    private List<Employee> employee;
    private List<Branch> branch;
    private List<Client> client;

    public Cafe() {
    }

    public Cafe(String nameCafe, String nameOwner, List<Employee> employee, List<Branch> branch, List<Client> client) {
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

    public List<Employee> getEmployee() {
        return employee;
    }

    public void setEmployee(List<Employee> employee) {
        this.employee = employee;
    }

    public List<Branch> getBranch() {
        return branch;
    }

    public void setBranch(List<Branch> branch) {
        this.branch = branch;
    }

    public List<Client> getClient() {
        return client;
    }

    public void setClient(List<Client> client) {
        this.client = client;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cafe cafe = (Cafe) o;
        return nameCafe.equals(cafe.nameCafe) && nameOwner.equals(cafe.nameOwner) && employee.equals(cafe.employee) && branch.equals(cafe.branch) && client.equals(cafe.client);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameCafe, nameOwner, employee, branch, client);
    }

    @Override
    public String toString() {
        return "Cafe{" +
                "nameCafe='" + nameCafe + '\'' +
                ", nameOwner='" + nameOwner + '\'' +
                ", employee=" + employee +
                ", branch=" + branch +
                ", client=" + client +
                '}';
    }
}
