package com.masai.usecases;

import java.util.Scanner;

import com.masai.bean.Batch;
import com.masai.dao.AdminDAO;
import com.masai.dao.AdminImplDAO;

public class RegisterBatchUseCase {
	
public static void registerNewBatch() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Batch No.");
		int no = sc.nextInt();
		
		System.out.println("Enter Seats Avaialibility for the batch");
		int seat = sc.nextInt();
		
		AdminDAO ad = new AdminImplDAO();
		
		Batch batch = new Batch();
		
		batch.setBatchno(no);
		batch.setSeats(seat);
		
		String result = ad.registerNewBatch(batch);
		System.out.println(result);
		
	}

}
