package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "WEBCALCRESULT")

public class ResultEntity {

	@Id
	private String Result;

}
