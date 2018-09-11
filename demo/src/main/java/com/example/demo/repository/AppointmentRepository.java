package com.example.demo.repository;

import com.example.demo.model.Account;
import com.example.demo.model.Appointment;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AppointmentRepository {

    public List<Appointment> getAppointments(){

        List<Appointment> list= new ArrayList<>();
        list.add(new Appointment(123,"10/22","Dermatology","raj"));
        list.add(new Appointment(234,"11/22","Neurology","vikranth"));
        list.add(new Appointment(345,"12/22","Psychiatrist","raviteja"));
        list.add(new Appointment(456,"09/22","Podiatrist","prabhas"));
        return list;

    }

    public Account createAccount(){
        return  new Account(2013,4578,"checking","primaryaccount");

    }
}
