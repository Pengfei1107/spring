package com.shadow.dao;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

public interface TestDao {

	/**
	 * conn
	 * exe sql
	 * @return
	 */
	@Select("select * from test")
	public List<Map<String,Object>> query();


	@Select("select * from test where id=2")
	public List<Map<String,Object>> getById();
}
