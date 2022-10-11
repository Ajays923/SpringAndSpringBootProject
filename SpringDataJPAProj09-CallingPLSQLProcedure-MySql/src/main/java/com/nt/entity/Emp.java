package com.nt.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "EMP")  //optional if u want to db table name same as entity class name
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Emp implements Serializable{
	@Id  //To make property as singular ID property and to map with singular PK column
	@Column(name = "empno") //optional if want to take property name as the column name
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer empNo;
	@Column(length = 20)
	private String ename;
	@Column(length = 20)
	private String job;
	@Column(length = 20)
	private Float sal;
	
}
