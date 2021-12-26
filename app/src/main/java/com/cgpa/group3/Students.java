package com.cgpa.group3;

public class Students {

    String reg_no,name,dob;

    public Students() {

    }

    public Students(String reg_no, String name, String dob) {
        this.reg_no = reg_no;
        this.name = name;
        this.dob = dob;
    }

    public String getReg_no() {
        return reg_no;
    }

    public void setReg_no(String reg_no) {
        this.reg_no = reg_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
}
