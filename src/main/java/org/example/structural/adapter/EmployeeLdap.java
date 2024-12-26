package org.example.structural.adapter;

public class EmployeeLdap {
    private String cn;
    private String surname;
    private String lastname;
    private String email;

    public EmployeeLdap(String cn, String surname, String lastname,String email) {
        this.cn = cn;
        this.surname = surname;
        this.lastname = lastname;
        this.email = email;
    }

    public String getCn() {
        return cn;
    }

    public String getSurname() {
        return surname;
    }

    public String getLastname() {
        return lastname;
    }
    public String getEmail(){
        return email;
    }
}
