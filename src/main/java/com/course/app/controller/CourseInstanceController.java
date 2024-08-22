package com.course.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.course.app.entities.CourseInstance;
import com.course.app.service.CourseInstanceService;

import java.util.List;

@RestController
@RequestMapping("/api/instances")
@CrossOrigin("http://localhost:3000")
public class CourseInstanceController {

    @Autowired
    private CourseInstanceService courseInstanceService;

    @PostMapping
    public CourseInstance createCourseInstance(@RequestBody CourseInstance instance) {
        return courseInstanceService.createCourseInstance(instance);
    }

    @GetMapping("/{year}/{semester}")
    public List<CourseInstance> getInstancesByYearAndSemester(@PathVariable int year, @PathVariable int semester) {
        return courseInstanceService.getCourseInstancesByYearAndSemester(year, semester);
    }

    @GetMapping("/{year}/{semester}/{id}")
    public CourseInstance getInstanceById(@PathVariable int year, @PathVariable int semester, @PathVariable Long id) {
        return courseInstanceService.getCourseInstanceById(id);
    }

    @DeleteMapping("/{year}/{semester}/{id}")
    public void deleteCourseInstance(@PathVariable int year, @PathVariable int semester, @PathVariable Long id) {
    	courseInstanceService.deleteCourseInstance(id);
    }
}
