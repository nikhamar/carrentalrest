package com.example.demo.model;

public class Appointment {

    int doctorid;
    String doctordate;
    String doctorspecialization;
    String doctorname;

    public Appointment(int doctorid, String doctordate, String doctorspecialization, String doctorname) {
        this.doctorid = doctorid;
        this.doctordate = doctordate;
        this.doctorspecialization = doctorspecialization;
        this.doctorname = doctorname;
    }

    public void setDoctorid(int doctorid) {
        this.doctorid = doctorid;
    }

    public void setDoctordate(String doctordate) {
        this.doctordate = doctordate;
    }

    public void setDoctorspecialization(String doctorspecialization) {
        this.doctorspecialization = doctorspecialization;
    }

    public void setDoctorname(String doctorname) {
        this.doctorname = doctorname;
    }

    public int getDoctorid() {
        return doctorid;
    }

    public String getDoctordate() {
        return doctordate;
    }

    public String getDoctorspecialization() {
        return doctorspecialization;
    }

    public String getDoctorname() {
        return doctorname;
    }
}
