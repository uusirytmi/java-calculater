package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "WEBCALC_RESULT")

public class ResultEntity {

	@Id
	private String Result;

}
//javax入れる必要がある？lombokは冗長なコードをアノテーションでまとめるやつ