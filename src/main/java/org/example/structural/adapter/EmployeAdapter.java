package org.example.structural.adapter;

public class EmployeAdapter implements Employee {
    private EmployeeLdap employeeLdap;

    public EmployeAdapter(EmployeeLdap employeeLdap) {
        this.employeeLdap = employeeLdap;
    }

    @Override
    public String getId() {
        return employeeLdap.getCn();
    }

    @Override
    public String getFname() {
        return employeeLdap.getSurname();
    }

    @Override
    public String getLname() {
        return employeeLdap.getLastname();
    }

    @Override
    public String getEmail() {
        return employeeLdap.getEmail();
    }
}
