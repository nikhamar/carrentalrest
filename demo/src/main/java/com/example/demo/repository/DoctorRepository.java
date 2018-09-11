package com.example.demo.repository;

import com.example.demo.model.Doctor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class DoctorRepository {

    public List<Doctor> getDoctors(){

        List<Doctor> list=new ArrayList<>();

        list.add(new Doctor("prasad","Heart Surgeon"));
        list.add(new Doctor("Harish","Orthopedic"));
        list.add(new Doctor("Srikanth","pediatrist"));
        return list;

    }
}
