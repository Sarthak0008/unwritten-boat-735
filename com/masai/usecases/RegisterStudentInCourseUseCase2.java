package com.masai.usecases;

import java.util.Scanner;

import com.masai.bean.Student;
import com.masai.exceptions.CourseException;
import com.masai.exceptions.StudentException;
import com.masai.dao.StudentDao;
import com.masai.dao.StudentDaoImpl;

public class RegisterStudentInCourseUseCase2 {

public static void registerStudentInCourse2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Authentication Required!!!");
		
		System.out.println("Enter Username");
		String name = sc.next();
		
		System.out.println("Enter password");
		String pass = sc.next();
		
		StudentDao st = new StudentDaoImpl();
		
		
		try {
			Student student = st.loginStudent(name, pass);
			
			int roll = student.getRoll();
			
			System.out.println("Enter CouseID");
			
			int id = sc.nextInt();
			
			try {
				String result = st.registerStudentInsideCourse2(id, roll);
				System.out.println(result);
			} catch (CourseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (StudentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
}
