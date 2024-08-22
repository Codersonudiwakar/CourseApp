package com.course.app.service;

import java.util.List;

import com.course.app.entities.Course;
import com.course.app.entities.CourseInstance;

public interface CourseService {
	public Course createCourse(Course course);

	public List<Course> getAllCourses();

	public Course getCourseById(Long id);

	public void deleteCourse(Long id);

}
