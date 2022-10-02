package com.masai.usecases;
import java.util.ArrayList;
import java.util.List;

import com.masai.bean.Course;
import com.masai.exceptions.CourseException;
import com.masai.dao.AdminDAO;
import com.masai.dao.AdminImplDAO;

public class GetAllCourseUseCase {
	
public static void getAllCourses() {
		
		AdminDAO am = new AdminImplDAO();
		
		 try {
			List<Course> list = am.getAllCourseDetails();
			
			list.forEach(c->{
				
				System.out.println("Course ID :"+c.getCourseid());
				System.out.println("Course Name :"+c.getCname());
				System.out.println("Course Fees :"+c.getFees());
				System.out.println("Course Duration :"+c.getDuration());
				System.out.println("=====================================");
			});
		} catch (CourseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
