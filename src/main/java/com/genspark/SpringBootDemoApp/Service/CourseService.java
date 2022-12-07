package com.genspark.SpringBootDemoApp.Service;

import com.genspark.SpringBootDemoApp.Entity.Course;

import java.util.List;

public interface CourseService {

    List<Course> getAllCourse();
   // Course getCourse();

   // List<Course> getAllCourses();

    Course addCourse(Course course);
    Course getCourseById(int courseId);
    Course updateCourse(Course course);
    String deleteCourse(int courseId);
}
