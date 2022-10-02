package com.masai.usecases;
import java.util.Scanner;

import com.masai.bean.Course;
import com.masai.dao.AdminDAO;
import com.masai.dao.AdminImplDAO;

public class DeleteCourseUseCase {
	
public static void deleteCourse() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Course Name which you want to Delete");
		String cname = sc.next();
		
		AdminDAO am = new AdminImplDAO();
		
		Course course = new Course();
		
		course.setCname(cname);
		
		String result = am.deleteCourse(course);
		System.out.println(result);
	}

}
