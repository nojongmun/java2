package com.ict.edu;

public class Ex07 {
public static void main(String[] args) {
	
	// ��ü ����� ���� static�� ȣ�� ����
	// Ŭ�����̸�.����ʵ�( ����޼ҵ�)
	
	// static�̶� private�� ���� �� �� ����.
	System.out.println(Ex06.GENDER);
	// System.out.println(Ex06.COUNTRY);
	
	// ��ü ���� ��  ����
	Ex06 test = new Ex06();
	System.out.println(test.name);
	System.out.println(test.GENDER);
	
	// private ������ ���� �Ұ�
	// System.out.println(test.age);
	// System.out.println(test.lang);
	// System.out.println(test.COUNTRY);
	
	// �޼ҵ� �̿��ؼ� ���� �ޱ� : getter()
	int age = test.getAge();
	System.out.println(age);
	
	System.out.println(Ex06.GENDER);
	System.out.println(test.getGender());
	
	//System.out.println(Ex06.lang);
	System.out.println(test.getLang());
	System.out.println("================");
	System.out.println(test.name);
	System.out.println(test.getAge());
	test.setName("ȣ����");
	test.setAge(2);
	
	System.out.println(test.name);
	System.out.println(test.getAge());
	
}
}
