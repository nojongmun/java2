package com.ict.edu4;

public class Animal {
	boolean live;
	int age;
	String name;
	
	public Animal() {
		// ���2)
		name = "ū�Լ�";
		age = 3;
		live = true;
	}
	//  ���1)
	public Animal(boolean live, int age, String name) {
		super();
		this.live = live;
		this.age = age;
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setLive(boolean live) {
		this.live = live;
	}
	void setName(String name){
		this.name = name;
	}
	String getName() {
		return name;
	}
	boolean getLive() {
		return live ;
	}
}
