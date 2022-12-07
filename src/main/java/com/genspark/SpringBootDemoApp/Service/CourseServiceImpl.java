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
    public Course addCourse(Course course) {
        this.list.add(course);
        return course;
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

    @Override
    public Course updateCourse(Course course) {

        String title = course.getTitle();
        String instructor = course.getInstructor();
        Course c = null;
        for(Course course1:list) {
            if(course1.getCourseId() == course.getCourseId()) {
                course1.setTitle(course.getTitle());
                course1.setInstructor(course.getInstructor());
                c = course1;
                break;
            }
        }
        return null;
    }

    @Override
    public String deleteCourse(int courseId) {

        for(Course course:list) {
            if(course.getCourseId() == courseId) {
                list.remove(course);
                break;
            }
        }
        return "Deleted Successfully";
    }
}
