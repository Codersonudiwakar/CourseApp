package com.course.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.course.app.entities.Course;
import com.course.app.entities.CourseInstance;
import com.course.app.repo.CourseInstanceRepository;
import com.course.app.repo.CourseRepository;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
    private CourseRepository courseRepository;

    public Course createCourse(Course course) {
        return courseRepository.save(course);
    }

    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    public Course getCourseById(Long id) {
    	System.out.println("thi is not running");
        return courseRepository.findById(id).orElseThrow(() -> new RuntimeException("Course not found"));
    }

    public void deleteCourse(Long id) {
        courseRepository.deleteById(id);
    }

  

}
