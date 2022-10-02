package com.masai.dao;

import java.util.List;


import com.masai.bean.Student;
import com.masai.bean.StudentDTO;
import com.masai.bean.StudentDTOO;
import com.masai.exceptions.AdminException;
import com.masai.exceptions.CourseException;
import com.masai.exceptions.StudentException;

public interface StudentDao {
	
	
	public String registerStudent(Student student);
	
	public Student loginStudent(String username, String password) throws StudentException;
	
	public String registerStudentInsideCourse(int courseid, int roll) throws StudentException,CourseException;
	
	public String registerStudentInsideCourse2(int courseid,int roll) throws StudentException,CourseException;
	
	public List<Student> getAllStudentDetails() throws StudentException;
	
	public List<StudentDTOO> getAllDetailsByStudentName(String username) throws StudentException;
	
	public String updateStudentName(Student student);
	
	public String updateStudentMobile(Student student);
}
