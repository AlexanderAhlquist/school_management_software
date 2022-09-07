package com.ahlquist.sms.jpa.dao;

import java.util.List;

import com.ahlquist.sms.jpa.entitymodels.Course;
/*
 * This is the Course DAO which provides a skeleton for the CourseService class.
 */
public interface CourseDAO {
	List<Course> getAllCourses();
}
