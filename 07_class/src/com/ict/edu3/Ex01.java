package com.ict.edu3;

public class Ex01 {
	// ������ : ��ü�� �����Ҷ� �ڵ����� �ѹ� ȣ��ȴ�.
	//   ���� : ����ʵ��� �ʱ�ȭ
	//  - �������̸��� Ŭ�����̸��� ����.
	//  - ��ȯ���� ���� �޼ҵ�� ����. 
	//  - �����ε��� ���� (�����ڰ� ������ ������ �� �ִ�.)
	//  - Ŭ������ �����ڸ� ������ ������ �⺻�����ڷ� ��ü ������ �Ѵ�.
	//  - Ŭ������ �����ڸ� ����� ������� �����ڷ� ��ü ������ �ؾ� �Ѵ�.
	//  - �⺻�����ڶ� Ŭ�����̸�(), �� ���� ���� �����ڸ� �⺻ �����ڶ�� �Ѵ�.
	
	private String name = "������";
	private int age = 24 ;
	private String add = "��û��";
	
	// �⺻ �����ڴ�  ����� �ִ�. (ctrl + space)
	public Ex01() {
		System.out.println("�⺻ ������");
		// ������� �����͸� ������ �� �ִ�
		name = "�Ѹ�";
		age = 1002;
		add = "����";
	}
	public Ex01(String name, int age, String add) {
		this.name = name;
		this.age = age;
		this.add = add;
	}
  
	// ����� ���� ������ : Source- 
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
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
}
