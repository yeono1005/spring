package com.mvcproject.goods.controller.model.vo;

import java.sql.Date;

public class Goods {

	private String code;
	private String name;
	private int price;
	private String color;
	private Date regdate; 

	public Goods() {
		
	}
	
	public Goods(String code, String name, int price, String color) {
		super();
		this.code = code;
		this.name = name;
		this.price = price;
		this.color = color;
	}
	
	public Goods(String code, String name, int price, String color, Date regdate) {
		super();
		this.code = code;
		this.name = name;
		this.price = price;
		this.color = color;
	}
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	
	
}
