package org.example.creational.org.example.creational.builder;

public class builderDemo {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();

        StringBuilder obj1 = builder.append("This is");
        StringBuilder obj2 = builder.append(" my string builder");
        System.out.println(builder.toString());
        System.out.println(obj1.hashCode() + "\t" + obj2.hashCode() + "\t" + builder.hashCode());
        Computer.ComputerBuilder builder1 = new Computer.ComputerBuilder();
        builder1.addHdd("500GB").addUsbC(true).addRamSize("16GB");
        Computer computer = builder1.build();
        System.out.println(computer.toString());
        Employee.EmployeeBuilder employeeBuilder = new Employee.EmployeeBuilder();
        employeeBuilder.addId(12).addName("Sekar").addSalary(2500000.00);
        Employee employee = employeeBuilder.build();
        System.out.println(employee.toString());

    }
}
