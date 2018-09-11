package com.example.demo.model;

public class Doctor {

    String doctorname;
    String specialization;

    public Doctor(String doctorname, String specialization) {
        this.doctorname = doctorname;
        this.specialization = specialization;
    }


    public void setDoctorname(String doctorname) {
        this.doctorname = doctorname;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getDoctorname() {
        return doctorname;
    }

    public String getSpecialization() {
        return specialization;
    }
}
