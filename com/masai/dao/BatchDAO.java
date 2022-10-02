package com.masai.dao;
import java.util.List;

import com.masai.bean.Batch;
import com.masai.exceptions.BatchException;

public interface BatchDAO {
	
	public List<Batch> getAllBatchDetaisl() throws BatchException;

}
