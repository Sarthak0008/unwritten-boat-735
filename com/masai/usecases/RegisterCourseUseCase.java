package com.masai.usecases;

import java.util.Scanner;

import com.masai.bean.Course;

import com.masai.dao.AdminDAO;
import com.masai.dao.AdminImplDAO;

public class RegisterCourseUseCase {
	
public static void courseRegistration() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Course Name");
		String cs = sc.next();
		
		System.out.println("Enter Fees Required");
		int fees = sc.nextInt();
		
		System.out.println("Enter duration of the Course");
		String dur = sc.next();
		
		AdminDAO ad = new AdminImplDAO();
		
		Course course = new Course();
		
		course.setCname(cs);
		course.setFees(fees);
		course.setDuration(dur);
		
		String result = ad.registerNewCourse(course);
		System.out.println(result);
		
		
	}

}
