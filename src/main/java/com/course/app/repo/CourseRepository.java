package com.course.app.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.course.app.entities.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
}
