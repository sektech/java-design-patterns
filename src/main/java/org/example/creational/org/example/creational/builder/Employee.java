package org.example.creational.org.example.creational.builder;

public class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(EmployeeBuilder builder){
        this.id = builder.id;
        this.name= builder.name;
        this.salary= builder.salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public static class EmployeeBuilder {

        private int id;
        private String name;
        private double salary;

        public EmployeeBuilder(){}

        public EmployeeBuilder addId(int _id){
            this.id = _id;
            return this;
        }
        public EmployeeBuilder addName(String _name){
            this.name = _name;
            return this;
        }
        public EmployeeBuilder addSalary(Double _salary){
            this.salary = _salary;
            return this;
        }
        public Employee build(){
            return new Employee(this);
        }

    }

}
