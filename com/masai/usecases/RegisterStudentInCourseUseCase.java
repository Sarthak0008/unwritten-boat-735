package com.masai.usecases;
import java.util.Scanner;

import com.masai.exceptions.CourseException;
import com.masai.exceptions.StudentException;
import com.masai.dao.StudentDao;
import com.masai.dao.StudentDaoImpl;



public class RegisterStudentInCourseUseCase {

public static void registerStudentinCourse() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Roll Number");
		int roll = sc.nextInt();
		
		System.out.println("Enter the course ID");
		int id = sc.nextInt();
		
		StudentDao st = new StudentDaoImpl();
		
		try {
			String result = st.registerStudentInsideCourse(id, roll);
			
			System.out.println(result);
		} catch (StudentException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		
		} catch (CourseException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
	
}
