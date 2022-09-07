package com.ahlquist.sms.jpa.dao;

import java.util.List;

import com.ahlquist.sms.jpa.entitymodels.Course;
import com.ahlquist.sms.jpa.entitymodels.Student;

/*
 * This is the Student DAO which provides a skeleton for the StudentService class. 
 */
public interface StudentDAO {
	List<Student> getAllStudents();
	Student getStudentByEmail(String sEmail);
	boolean validateStudent(String sEmail, String sPassword);
	void registerStudentToCourse(String sEmail, int cId);
	List<Course> getStudentCourses(String sEmail);
}
