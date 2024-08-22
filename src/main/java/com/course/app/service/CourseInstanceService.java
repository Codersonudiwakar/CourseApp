package com.course.app.service;

import java.util.List;

import com.course.app.entities.CourseInstance;

public interface CourseInstanceService {
	public CourseInstance createCourseInstance(CourseInstance instance);

	public List<CourseInstance> getCourseInstancesByYearAndSemester(int year, int semester);

	public CourseInstance getCourseInstanceById(Long id);

	public void deleteCourseInstance(Long id);

}
