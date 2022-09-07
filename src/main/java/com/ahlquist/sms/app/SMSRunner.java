package com.ahlquist.sms.app;

import java.util.Scanner;

import com.ahlquist.sms.jpa.service.CourseService;
import com.ahlquist.sms.jpa.service.StudentService;
/*
 * This is a project created by Alexander Ahlquist
 * as part of the Per Scholas Full-Stack Developer Program.
 * This is the main method of the program.
 */
public class SMSRunner {

	public static void main(String[] args) {
		StudentService ss = new StudentService();
		CourseService cs = new CourseService();
		ss.getAllStudents();
		cs.getAllCourses();
		Scanner input = new Scanner(System.in);
		int courseId;

		System.out.println("Hello! Welcome the the School Management System.");
		System.out.printf("Are you a\n1. Student\n2. Quit\n");
		int answer = input.nextInt();
		switch (answer) {
		case 1:
			System.out.println("Enter your Email");
			String email = input.next();
			System.out.println("Enter your Password");
			String password = input.next();
			
			if (ss.validateStudent(email, password) == true) {
				ss.getStudentCourses(email);
				cs.displayAllCourses();
				System.out.println("What course ID would you like to register for?");
				courseId = input.nextInt();
				ss.registerStudentToCourse(email, courseId);
				input.nextLine();
				ss.getStudentCourses(email);
				System.out.println("You have been logged out!");
			} else {
				System.out.println("Invalid credentials, goodbye!");
			}
			break;
		case 2:
			System.out.println("Goodbye!");
			input.close();
			break;
		default:
			System.out.println("I didn't understand that, the program is ending!");
			input.close();
			break;
		}

	}

}
