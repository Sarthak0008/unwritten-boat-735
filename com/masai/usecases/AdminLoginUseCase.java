package com.masai.usecases;

import java.util.Scanner;

import com.masai.bean.Admin;
import com.masai.exceptions.AdminException;
import com.masai.dao.AdminDAO;
import com.masai.dao.AdminImplDAO;
import com.masai.dao.StudentDao;
import com.masai.dao.StudentDaoImpl;

public class AdminLoginUseCase {
	
	public static boolean AdminLogin() {
	
	Scanner sc = new Scanner(System.in);
	boolean result = false;;
	System.out.println("Enter Username");
	String username = sc.next();
	
	System.out.println("Enter password");
	String password = sc.next();
	
	AdminDAO ad = new AdminImplDAO();
	try {
		Admin admin = ad.loginAdmin(username, password);
		
		result = true;
		
		return result;
		
	} catch (AdminException e) {
		// TODO Auto-generated catch block
		System.out.println(e.getMessage());
		return result;
	}

}
}
