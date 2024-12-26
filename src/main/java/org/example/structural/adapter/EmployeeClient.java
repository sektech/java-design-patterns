package org.example.structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {

    private List<Employee> employeeList = new ArrayList<>();

    public List<Employee> getEmployeeList(){
        Employee employeeDB = new EmployeeDB("123","TestF","TestL", "Test@test.com");
        EmployeeLdap employeeLdap = new EmployeeLdap("321","LDapF", "LDaL","Ldap@email.com");

        employeeList.add(employeeDB);
        employeeList.add(new EmployeAdapter(employeeLdap));
        return employeeList;
    }
}
