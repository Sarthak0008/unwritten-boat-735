package com.masai.usecases;

import java.util.Scanner;

import com.masai.bean.Course;
import com.masai.dao.AdminDAO;
import com.masai.dao.AdminImplDAO;

public class UpdateFeeUseCase {
	
public static void updateFees() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter new Fees");
		int fee = sc.nextInt();
		
		System.out.println("Enter the Course Name");
		String cname = sc.next();
		
		AdminDAO am = new AdminImplDAO();
		
		Course course = new Course();
		
		course.setFees(fee);
		course.setCname(cname);
		
		String result = am.updateCourseFees(course);
		System.out.println(result);
	}

}
