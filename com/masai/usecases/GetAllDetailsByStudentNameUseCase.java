package com.masai.usecases;

import java.util.List;
import java.util.Scanner;

import com.masai.bean.Student;
import com.masai.bean.StudentDTO;
import com.masai.bean.StudentDTOO;
import com.masai.exceptions.StudentException;
import com.masai.dao.StudentDao;
import com.masai.dao.StudentDaoImpl;

public class  GetAllDetailsByStudentNameUseCase{
	
public static void getAllDetailsByStudentName() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Authentication Required!!!");
		
		System.out.println("Enter Username");
		String name = sc.next();
		
		System.out.println("Enter password");
		String pass = sc.next();
	
		StudentDao st = new StudentDaoImpl();
		
		try {
			Student student = st.loginStudent(name, pass);
			
			String username = student.getUsername();
			
			List<StudentDTOO> list1 = st.getAllDetailsByStudentName(username);
			
			for (StudentDTOO s : list1) {
				System.out.println("Roll :"+s.getRoll());
				System.out.println("Username :"+s.getUsername());
				System.out.println("Name :"+s.getName());
				System.out.println("Address :"+s.getAddress());
				System.out.println("Mobile :"+s.getMobile());
				System.out.println("Course ID :"+s.getCourseid());
				System.out.println("Course Name :"+s.getCname());
				System.out.println("Course Fees :"+s.getFees());
				System.out.println("Course Duration :"+s.getDuration());
				System.out.println("Batch No :"+s.getBatchno());
				System.out.println("Seats Avaiable :"+s.getSeats());
				System.out.println("==========================================");
				
			}
			
		} catch (StudentException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
	
	
}
