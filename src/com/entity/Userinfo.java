package com.entity;

// Generated 2013-8-23 15:06:50 by Hibernate Tools 3.4.0.CR1

/**
 * Userinfo generated by hbm2java
 */
public class Userinfo implements java.io.Serializable {

    private String empId;
    private Employeeinfo employeeinfo;
    private String pwd;
    private int empRight;

    public Userinfo() {
    }

    public Userinfo(Employeeinfo employeeinfo, String pwd, int empRight) {
        this.employeeinfo = employeeinfo;
        this.pwd = pwd;
        this.empRight = empRight;
    }

    public String getEmpId() {
        return this.empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public Employeeinfo getEmployeeinfo() {
        return this.employeeinfo;
    }

    public void setEmployeeinfo(Employeeinfo employeeinfo) {
        this.employeeinfo = employeeinfo;
    }

    public String getPwd() {
        return this.pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public int getEmpRight() {
        return this.empRight;
    }

    public void setEmpRight(int empRight) {
        this.empRight = empRight;
    }

}