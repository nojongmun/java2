package com.ict.edu4;

import java.io.Serializable;

// ��ü�� ������ ���� �� �ִ� ������ ���� �Ǿ�� �Ѵ�.
// Serializable �������̽��� ����Ͽ��� ����ȭ�� �����.(�߻�Ŭ�����ε� �߻�޼ҵ尡 ����.) 
// ��� ����������� ����ȭ ����� �ȴ�.
// ���� ����� ����� �տ���  transient ���� ����Ѵ�. 
//  -> ���� ����� ��� �⺻���� ���´�.(int=0, double=0.0, boolean = false)
public class VO implements Serializable{
	private String name;
	private int age ;
	transient private double weight ;
	transient private boolean gender ;
	
	public VO() {}
	public VO(String name, int age, double weight, boolean gender) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
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
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}

}