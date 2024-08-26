package com.course.app.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class CourseInstance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int deliveryYear;
    private int semester;

  
    @ManyToOne
    @JoinColumn(name = "course_id", nullable = false)    
    private Course course;

	public CourseInstance() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getDeliveryYear() {
		return deliveryYear;
	}

	public void setDeliveryYear(int deliveryYear) {
		this.deliveryYear = deliveryYear;
	}

	public int getSemester() {
		return semester;
	}

	public void setSemester(int semester) {
		this.semester = semester;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public CourseInstance(Long id, int deliveryYear, int semester, Course course) {
		super();
		this.id = id;
		this.deliveryYear = deliveryYear;
		this.semester = semester;
		this.course = course;
	}

    
}

