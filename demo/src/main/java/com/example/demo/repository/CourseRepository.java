package com.example.demo.repository;

import com.example.demo.model.Course;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CourseRepository {

    public List<Course> getCourse(){

        List<Course> list=new ArrayList<>();
        list.add(new Course(12,"spring","begining level"));
        list.add(new Course(13,"springMVC","Advanced Level"));
        list.add(new Course(14,"Hibernate","Intermediate Level"));
        return list;
    }

}
