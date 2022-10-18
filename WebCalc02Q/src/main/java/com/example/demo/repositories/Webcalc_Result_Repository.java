package com.example.demo.repositories;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper

public interface Webcalc_Result_Repository {
	
	 @Insert("INSERT INTO webcalcresult(result) VALUES (#{result})")
	 public void insertResult(String result);
	  

}
//わからない