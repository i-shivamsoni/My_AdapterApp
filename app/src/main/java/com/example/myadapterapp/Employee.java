package com.example.myadapterapp;

public class Employee {
    private int eid;
    private String ename;
    private double esalary;

    public Employee(int eid, String ename, double esalary) {
        this.eid = eid;
        this.ename = ename;
        this.esalary = esalary;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public double getEsalary() {
        return esalary;
    }

    public void setEsalary(double esalary) {
        this.esalary = esalary;
    }


}
