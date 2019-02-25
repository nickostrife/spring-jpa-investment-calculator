package com.ecomindo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TestModel {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer aid;
	private Integer a;

	@Override
	public String toString() {
		return "TestModel [aid=" + aid + ", a=" + a + "]";
	}

	public Integer getA() {
		return a*2;
	}

	public void setA(Integer a) {
		this.a = a;
	}

	public Integer getAid() {
		return aid;
	}

	public void setAid(Integer aid) {
		this.aid = aid;
	}

	
}

