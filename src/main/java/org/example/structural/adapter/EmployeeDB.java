package org.example.structural.adapter;

public class EmployeeDB implements Employee{

    private String id;
    private String fname;
    private String lname;
    private String email;

    public EmployeeDB(String _id,String _fname,String _lname,String _email){
        this.id = _id; this.fname = _fname; this.lname=_lname;this.email=_email;
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public String getFname() {
        return this.fname;
    }

    @Override
    public String getLname() {
        return this.lname;
    }

    @Override
    public String getEmail() {
        return this.email;
    }
}
