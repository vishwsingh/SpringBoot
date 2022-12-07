package com.genspark.SpringBootDemoApp.Service;

import com.genspark.SpringBootDemoApp.Entity.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    List<Course> list;

    public CourseServiceImpl() {
        list = new ArrayList<>();
        list.add(new Course(101, "Spring Framework", "Pradeep"));
        list.add(new Course(102, "Spring Boot", "Sukh"));
    }


    @Override
    public List<Course> getAllCourse() {
        return list;
    }

    @Override
    public Course getCourseById(int courseId) {

        Course c = null;

        for(Course course:list) {
            if(course.getCourseId() == courseId) {
                c = course;
                break;
            }
        }
        return c;
    }
}
