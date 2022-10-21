package com.example.demo.repositories;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.demo.entities.ResultEntity;

@Mapper

public interface Webcalc_Result_Repository {

	@Insert("INSERT INTO webcalcresult(result) VALUES (#{result})")
	public void insertResult(String result);

	@Select("select * from webcalcresult")
	List<ResultEntity> selectAll();

}