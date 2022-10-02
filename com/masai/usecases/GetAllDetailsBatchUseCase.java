package com.masai.usecases;
import java.util.List;

import com.masai.bean.Batch;
import com.masai.exceptions.BatchException;
import com.masai.dao.BatchDAO;
import com.masai.dao.BatchDAOImpl;

public class GetAllDetailsBatchUseCase {
	
public static void getAllDetailsBatch() {
		
		BatchDAO dao = new BatchDAOImpl();
		
		try {
			List<Batch> list = dao.getAllBatchDetaisl();
			
			list.forEach(b ->{
				System.out.println("Batch No :"+b.getBatchno());
				System.out.println("Available Seats :"+b.getSeats());
				System.out.println("====================================");
			});
		} catch (BatchException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
