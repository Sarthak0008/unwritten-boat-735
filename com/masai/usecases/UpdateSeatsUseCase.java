package com.masai.usecases;

import java.util.Scanner;

import com.masai.bean.Batch;
import com.masai.dao.AdminDAO;
import com.masai.dao.AdminImplDAO;

public class UpdateSeatsUseCase {
	
public static void updateSeats() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter total Seats");
		int seat = sc.nextInt();
		
		System.out.println("Enter Batch No.");
		int batch = sc.nextInt();
		
		AdminDAO am = new AdminImplDAO();
		
		Batch bat = new Batch();
		bat.setSeats(seat);
		bat.setBatchno(batch);
		
		String result = am.updateSeatsNumber(bat);
		System.out.println(result);
	}

}
