package com.mvcproject.member.controller.model.vo;

import java.sql.Date;

public class Member {
	   private static final long serialVersionUID = 1111L;
	   private String id;
	   private String passwd;
	   private String name;
	   private String email;
	   private String gender;
	   private int age;
	   private String phone;
	   private String address;
	   private Date enrollDate;


	   /* … Field 에 대한 Getter와 Setter 선언 … */
	   @Override
	   public String toString() {
	      return this.id + ", " + this.passwd + ", " + this.name + ", " + this.gender + ", " + this.age + ", "
	            + this.email + ", " + this.phone + ", " + this.address + ", " + this.enrollDate;
	   }

	   public String getId() {
	      return id;
	   }

	   public void setId(String id) {
	      this.id = id;
	   }

	   public String getPasswd() {
	      return passwd;
	   }

	   public void setPasswd(String passwd) {
	      this.passwd = passwd;
	   }

	   public String getName() {
	      return name;
	   }

	   public void setName(String name) {
	      this.name = name;
	   }

	   public String getEmail() {
	      return email;
	   }

	   public void setEmail(String email) {
	      this.email = email;
	   }

	   public String getGender() {
	      return gender;
	   }

	   public void setGender(String gender) {
	      this.gender = gender;
	   }

	   public int getAge() {
	      return age;
	   }

	   public void setAge(int age) {
	      this.age = age;
	   }

	   public String getPhone() {
	      return phone;
	   }

	   public void setPhone(String phone) {
	      this.phone = phone;
	   }

	   public String getAddress() {
	      return address;
	   }

	   public void setAddress(String address) {
	      this.address = address;
	   }

	   public Date getEnrollDate() {
	      return enrollDate;
	   }

	   public void setEnrollDate(Date enrollDate) {
	      this.enrollDate = enrollDate;
	   }
}
