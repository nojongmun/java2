package com.ict.edu4;

import java.io.Serializable;

// ��ü�� ������ ������ �մ� ������ ���� �Ǿ�� �Ѵ�.
// Serialirzable �������̽��� ����Ͽ� ����ȭ�� �����.(�߻� Ŭ���ε� �߻� �޼ҵ尡 ����.)
// ��� ����������� ����ȭ ����� �ȴ�.
// ���� ����� ����� �ƿ��� tranisent ���� ����Ѵ�.
// 	 - ���ܴ���� ��� �⺻���� ����.(int=0, double=0.0, boolean = false)
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
	
	

}
