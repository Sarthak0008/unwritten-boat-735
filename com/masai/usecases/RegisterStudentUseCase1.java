package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.StudentDaoImpl;

public class RegisterStudentUseCase1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter Student roll");
		int roll=sc.nextInt();
		System.out.println("Enter Student username");
		String username=sc.next();
		System.out.println("Enter Student password");
		String password=sc.next();
		System.out.println("Enter Student name");
		String name=sc.next();
		System.out.println("Enter Student address");
		String address=sc.next();
		System.out.println("Enter Student mobile");
		String mobile=sc.next();
		
		StudentDaoImpl dao=new StudentDaoImpl();
		String result=dao.registerStudent(roll, username, password, name, address, mobile);
		System.out.println(result);

	}

}
