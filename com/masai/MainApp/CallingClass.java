package com.masai.MainApp;


import java.util.Scanner;

import com.masai.bean.Student;
import com.masai.dao.StudentDao;
import com.masai.dao.StudentDaoImpl;
import com.masai.usecases.AdminLoginUseCase;
import com.masai.usecases.DeleteCourseUseCase;
import com.masai.usecases.GetAllCourseUseCase;
import com.masai.usecases.GetAllDetailsBatchUseCase;
import com.masai.usecases.GetAllDetailsByStudentNameUseCase;
import com.masai.usecases.GetDetailsByCourseNameUseCase;
import com.masai.usecases.RegisterBatchUseCase;
import com.masai.usecases.RegisterCourseUseCase;
import com.masai.usecases.RegisterStudentInCourseUseCase;
import com.masai.usecases.RegisterStudentInCourseUseCase2;
import com.masai.usecases.RegisterStudentInsideBatchUseCase;
import com.masai.usecases.RegisterStudentUseCase;
import com.masai.usecases.StudentLoginUseCase;
import com.masai.usecases.UpdateDurationUseCase;
import com.masai.usecases.UpdateFeeUseCase;
import com.masai.usecases.UpdateSeatsUseCase;
import com.masai.usecases.UpdateStudentMobileUseCase;
import com.masai.usecases.UpdateStudentNameUseCase;
import com.masai.usecases.GetDetailsByCourseNameUseCase;
import com.masai.usecases.ViewStudentOfEveryBatchUseCase;

public class CallingClass {
	
	public static StudentDao st = new StudentDaoImpl();

	public static void selectOption() {
		try {
			
			System.out.println("Please select an option to continue..");
			System.out.println("\n1. Admin Login\n2. Student Login\n3. Register New Student\n4. Exit");
			
			
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();

			switch (choice) {
			
			case 1:
				AdminLoginUseCase am = new AdminLoginUseCase();
				boolean r = am.AdminLogin();
				if (r == false) {
					break;
				}
				else {
					while(true) {
						System.out.println("Welcome to Admin Panel");
						System.out.println("Please select an option to continue");
						System.out.println("\n1. Add new Course\n2. Update Existing Course Fees\n3. Update Existing Course Duration\n4. Delete a Course\n5. Get all course details\n6. Get all information according to Course Name\n7. Create a new  Batch\n8. Allocate students in a batch\n9. Update total Seats in a batch\n10. View students of every batch\n11. Logout");
						int c1 = sc.nextInt();
						
						switch (c1) {
						
						case 1:
							RegisterCourseUseCase rc = new RegisterCourseUseCase();
							rc.courseRegistration();
							break;
						case 2:
							UpdateFeeUseCase uf = new UpdateFeeUseCase();
							uf.updateFees();
							break;
						case 3:
							UpdateDurationUseCase ud = new UpdateDurationUseCase();
							ud.updateDuration();
							break;
						case 4:
							DeleteCourseUseCase dc = new DeleteCourseUseCase();
							dc.deleteCourse();
							break;
						case 5:
							GetAllCourseUseCase gc = new GetAllCourseUseCase();
							gc.getAllCourses();
							break;
						case 6:
							GetDetailsByCourseNameUseCase g = new GetDetailsByCourseNameUseCase();
							g.getAllDetailsByCourseName();
							break;
						case 7:
							RegisterBatchUseCase rb = new RegisterBatchUseCase();
							rb.registerNewBatch();
							break;
						case 8:
							RegisterStudentInsideBatchUseCase rsb = new RegisterStudentInsideBatchUseCase();
							rsb.registerStudentInsideBatch();
							break;
						case 9:
							UpdateSeatsUseCase us = new UpdateSeatsUseCase();
							us.updateSeats();
							break;
						case 10:
							ViewStudentOfEveryBatchUseCase vs = new ViewStudentOfEveryBatchUseCase();
							vs.viewStudentOfEveryBatch();
							break;
						case 11:
							System.out.println("Returning to Main Menu...");
							CallingClass.selectOption();
							break;
						}
					}
					
				}
//				break;
			case 2:
				while(true) {
				
					StudentLoginUseCase st = new StudentLoginUseCase();
					boolean sr = st.StudentLogin();
					if (sr == false) {
						break;
					}
					else {
						while(true) {
							System.out.println("Please select an option to continue");
							System.out.println("\n1. Register in a new course\n2. See all information\n3. Update Student Name\n4. Update Mobile Number\n5. See all the Course Lists\n6. Check Seat Avaialibility of current ongoing batches\n7. Logout");
							int c2 = sc.nextInt();
							
							switch(c2) {
							
							case 1:
	//							RegisterStudentInCourseUseCase rsc = new RegisterStudentInCourseUseCase();
	//							rsc.registerStudentinCourse();
								//register student in a new course by authenticating ...
								RegisterStudentInCourseUseCase2 rsc = new RegisterStudentInCourseUseCase2();
								rsc.registerStudentInCourse2();
								break;
							case 2:
								GetAllDetailsByStudentNameUseCase gt = new GetAllDetailsByStudentNameUseCase();
								gt.getAllDetailsByStudentName();
								break;
							case 3:
								UpdateStudentNameUseCase us = new UpdateStudentNameUseCase();
								us.updateStuentName();
								break;
							case 4:
								UpdateStudentMobileUseCase um = new UpdateStudentMobileUseCase();
								um.updateStudentMobile();
								break;
							case 5:
								GetAllCourseUseCase gc = new GetAllCourseUseCase();
								gc.getAllCourses();
								break;
							case 6:
								GetAllDetailsBatchUseCase gb = new GetAllDetailsBatchUseCase();
								gb.getAllDetailsBatch();
								break;
							case 7:
								System.out.println("Returning to Main Menu...");
								CallingClass.selectOption();
								break;
							}
						}
					}
					
					
				}
//				break;
				
			case 3:
				
				RegisterStudentUseCase rs = new RegisterStudentUseCase();
				rs.studentRegistration();
				break;
			case 4:
				System.out.println("Returning to Home Screen......");
//				Application.main(null);
				
				break;
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
