package org.softwaretechnologies;

import org.softwaretechnologies.employee.Employee;
import org.softwaretechnologies.employee.EmployeeType;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private final String name;
    private final List<Employee> employeeList;

    public Company(String name) {
        this.name = name;
        this.employeeList = new ArrayList<>();
    }

    public void addEmployee(String name, int baseSalary, EmployeeType type) {
employeeList.add(EmployeeFactory.createEmployee(name, baseSalary, type));
    }


    public int getMonthSalary(int month) {

    int res=0;
    for(Employee employee:employeeList){
        res+=employee.getMonthSalary(month);}
        return res;
    }

    public String getName() {
        return name;
    }
}
