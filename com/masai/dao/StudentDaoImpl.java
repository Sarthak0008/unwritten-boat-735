package com.masai.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.masai.utility.DBUtil;

public class StudentDaoImpl implements StudentDao {

	@Override
	public String registerStudent(int roll, String username, String password, String name, String address,
			String mobile) {
		String message="Not Inserted...";
			
				
			
			try(Connection conn= DBUtil.provideConnection()) {
			
				PreparedStatement ps= conn.prepareStatement
						("insert into student(roll,username,password,name,address,mobile) values(?,?,?,?,?,?)");
				
				ps.setInt(1, roll);
				ps.setString(2, username);
				ps.setString(3, password);
				ps.setString(4, name);
				ps.setString(5, address);
				ps.setString(6, mobile);
				
				int x=ps.executeUpdate();
				
				if(x>0) {
					message="Students Registered Successfully !";
					
				}
				
				
				
				
				
			} catch (SQLException e) {
				// TODO: handle exception
				message=e.getMessage();
			}
				
				
				
	   return message;
	}
	
	

}
