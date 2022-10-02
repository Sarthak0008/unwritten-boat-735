package com.masai.dao;

import java.util.List;


import com.masai.bean.Admin;
import com.masai.bean.Batch;
import com.masai.bean.BatchDTO;
import com.masai.bean.Course;
import com.masai.bean.CourseDTO;
import com.masai.exceptions.AdminException;
import com.masai.exceptions.BatchException;
import com.masai.exceptions.CourseException;
import com.masai.exceptions.StudentException;

public interface AdminDAO {
	
		
	public Admin loginAdmin(String username,String password) throws AdminException;
		
		public String registerNewCourse(Course course);
		
		public String updateCourseFees(Course course);
		
		public String updateCourseDuration(Course course);
		
		public String deleteCourse(Course course);
		
		public List<Course> getAllCourseDetails() throws CourseException;
		
		public List<CourseDTO> getAllDetailsByCourseName(String cname) throws CourseException;
		
		public String registerNewBatch(Batch batch);
		
		public String registerStudentInsideBatch(int roll, int batchno) throws StudentException,BatchException;
		
		public String updateSeatsNumber(Batch batch);
		
		public List<BatchDTO> viewStudentOfEveryBatch() throws StudentException;


}
