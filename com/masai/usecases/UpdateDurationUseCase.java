package com.masai.usecases;

import java.util.Scanner;

import com.masai.bean.Course;
import com.masai.dao.AdminDAO;
import com.masai.dao.AdminImplDAO;

public class UpdateDurationUseCase {
	
public static void updateDuration() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Course Name");
		String cname = sc.next();
		
		System.out.println("Enter new Course Duration");
		String dur = sc.next();
		
		AdminDAO am = new AdminImplDAO();
		
		Course course = new Course();
		course.setDuration(dur);
		course.setCname(cname);
		
		String result = am.updateCourseDuration(course);
		System.out.println(result);
	}

}
