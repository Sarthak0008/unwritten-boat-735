package com.masai.usecases;

import java.util.List;

import java.util.Scanner;

import com.masai.bean.CourseDTO;
import com.masai.exceptions.CourseException;
import com.masai.dao.AdminDAO;
import com.masai.dao.AdminImplDAO;

public class GetDetailsByCourseNameUseCase {

	
public static void getAllDetailsByCourseName() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Course Name");
		String cname = sc.next();
		
		AdminDAO am = new AdminImplDAO();
		
		try {
			List<CourseDTO> list = am.getAllDetailsByCourseName(cname);
			
			list.forEach(c->{
				System.out.println("Course ID :"+c.getCourseid());
				System.out.println("Course Name :"+c.getCname());
				System.out.println("Course Fees :"+c.getFees());
				System.out.println("Course Duration :"+c.getDuration());
				System.out.println("Student Roll :"+c.getRoll());
				System.out.println("Student User Name :"+c.getUsername());
				System.out.println("Student Name :"+c.getName());
				System.out.println("Student Address :"+c.getAddress());
				System.out.println("Student Mobile :"+c.getMobile());
				System.out.println("=========================================");
				
			});
		} catch (CourseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
