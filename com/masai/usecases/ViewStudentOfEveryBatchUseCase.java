package com.masai.usecases;

import java.util.List;

import com.masai.bean.BatchDTO;
import com.masai.exceptions.StudentException;
import com.masai.dao.AdminDAO;
import com.masai.dao.AdminImplDAO;

public class ViewStudentOfEveryBatchUseCase {

	
public static void viewStudentOfEveryBatch() {
		
		AdminDAO am = new AdminImplDAO();
		
		try {
			List<BatchDTO> list = 	am.viewStudentOfEveryBatch();
			
			list.forEach(b ->{
				System.out.println("Student Name :"+b.getName());
				System.out.println("Student Address :"+b.getAddress());
				System.out.println("Student Roll No :"+b.getRoll());
				System.out.println("Student Mobile :"+b.getMobile());
				System.out.println("Batch No Allocated :"+b.getBatchno());
				System.out.println("===========================================");
			});
		} catch (StudentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
