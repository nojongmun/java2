package com.ict.day02;

import java.io.Serializable;

public class Ex09 implements Serializable {
      String name = "ȫ�浿";
      int age = 47 ;
      double ki = 178.5 ;
      boolean gender = true;
      
      public Ex09() {}

	public Ex09(String name, int age, double ki, boolean gender) {
		this.name = name;
		this.age = age;
		this.ki = ki;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getKi() {
		return ki;
	}

	public void setKi(double ki) {
		this.ki = ki;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}
	
	
      
}
