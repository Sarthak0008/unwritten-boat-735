package com.masai.usecases;

import java.util.Scanner;

import com.masai.bean.Student;
import com.masai.exceptions.StudentException;
import com.masai.dao.StudentDao;
import com.masai.dao.StudentDaoImpl;

public class UpdateStudentMobileUseCase {

	
public static void updateStudentMobile() {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Authentication Required!!");
		
		System.out.println("Enter Username");
		String name = sc.next();
		
		System.out.println("Enter password");
		String pass = sc.next();
		
		StudentDao st = new StudentDaoImpl();
		
		try {
			Student student = st.loginStudent(name, pass);
			
			String username = student.getUsername();
			
			System.out.println("Enter New Number");
			
			String updated = sc.next();
			
			Student student1 = new Student();
			
			student1.setUsername(username);
			student1.setMobile(updated);
			
			String result = st.updateStudentMobile(student1);
			System.out.println(result);
			
		} catch (StudentException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
}
