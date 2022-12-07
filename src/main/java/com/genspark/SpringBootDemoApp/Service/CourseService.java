package com.genspark.SpringBootDemoApp.Service;

import com.genspark.SpringBootDemoApp.Entity.Course;

import java.util.List;

public interface CourseService {

    List<Course> getAllCourse();
   // Course getCourse();

   // List<Course> getAllCourses();

    Course getCourseById(int courseId);
}
