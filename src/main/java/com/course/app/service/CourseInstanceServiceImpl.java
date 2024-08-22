package com.course.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.course.app.entities.CourseInstance;
import com.course.app.repo.CourseInstanceRepository;


@Service
public class CourseInstanceServiceImpl implements CourseInstanceService {
	@Autowired
    private CourseInstanceRepository courseInstanceRepository;
	
	
	  public CourseInstance createCourseInstance(CourseInstance instance) {
	        return courseInstanceRepository.save(instance);
	    }

	    public List<CourseInstance> getCourseInstancesByYearAndSemester(int year, int semester) {
	        return courseInstanceRepository.findByDeliveryYearAndSemester(year, semester);
	    }

	    public CourseInstance getCourseInstanceById(Long id) {
	        return courseInstanceRepository.findById(id).orElseThrow(() -> new RuntimeException("Instance not found"));
	    }

	    public void deleteCourseInstance(Long id) {
	        courseInstanceRepository.deleteById(id);
	    }

}
