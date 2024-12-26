package org.example.structural.adapter;

public class AdapterDemo {
    public static void main(String[] args) {

        Iphone6S phone = new Iphone6S( new Iphone16to6SAdapter());
        phone.charge();

        EmployeeClient employeeClient = new EmployeeClient();
        employeeClient.getEmployeeList().forEach(a->{
            System.out.println(String.format("Employee Detaild Id : %s , First Name: %s, Last Name : %s, Email : %s ",
                    a.getId(),a.getFname(),a.getLname(),a.getEmail() ));
        });

    }
}
