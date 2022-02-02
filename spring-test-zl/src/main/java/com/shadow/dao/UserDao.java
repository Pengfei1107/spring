package com.shadow.dao;

import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface UserDao {

	/**
     * conn
	 * exe sql
	 * @return
     */
	@Select("select * from user")
	public List<Map<String,Object>> query();


}
