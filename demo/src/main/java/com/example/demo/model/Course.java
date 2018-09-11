package com.example.demo.model;

public class Course {

    int courseid;
    String coursename;
    String coursedescription;

    public void setCourseid(int courseid) {
        this.courseid = courseid;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public void setCoursedescription(String coursedescription) {
        this.coursedescription = coursedescription;
    }

    public int getCourseid() {
        return courseid;
    }

    public String getCoursename() {
        return coursename;
    }

    public String getCoursedescription() {
        return coursedescription;
    }

    public Course(int courseid, String coursename, String coursedescription) {
        this.courseid = courseid;
        this.coursename = coursename;
        this.coursedescription = coursedescription;
    }
}
