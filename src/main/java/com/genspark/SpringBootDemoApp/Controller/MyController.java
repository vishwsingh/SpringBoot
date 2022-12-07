package com.genspark.SpringBootDemoApp.Controller;

import com.genspark.SpringBootDemoApp.Entity.Course;
import com.genspark.SpringBootDemoApp.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    private CourseService courseService;
    @GetMapping("/")
    public String home() {
        return "<HTML><H1>Welcome to the Spring Boot Demo</H1><HTML>";
    }

    @RequestMapping("page")
    public String page(@RequestParam(value = "name", defaultValue = "world") String name) {
        return "<HTML><H1>This is beautiful</H1><HTML>" + name;
    }

    @GetMapping("/courses")
    public List<Course> getCourses() {
        return this.courseService.getAllCourse();
    }

    @GetMapping("/courses/{courseID}")
    public Course getCourse(@PathVariable String courseID) {
            return this.courseService.getCourseById(Integer.parseInt(courseID));
    }

    @PostMapping("/courses")
    public Course addCourse(@RequestBody Course course) {
        return this.courseService.addCourse(course);
    }

    @PutMapping("/courses")
    public Course updateCourse(@RequestBody Course course) {
        return this.courseService.updateCourse(course);
    }

    @DeleteMapping("/courses/{courseId}")
    public String deleteCourse(@PathVariable String courseId) {
        return this.courseService.deleteCourse(Integer.parseInt(courseId));
    }
}
