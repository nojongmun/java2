package com.ict.edu;

public class Ex06 {
	// ���������� : public > protected > ����  > private
	// public : ������ �� ���� ����
	// protected : ���� ��Ű���� �ٸ� ��Ű���� ��� ��Ӱ��迡���� ���� ����
	// ���� : ���� ��Ű�������� ���� ����
	// private : �ܺο��� ���� �Ұ�, ���� ��������� ���� ����(����, ĸ��ȭ)
	
	String name = "ȣ����";
	private int age = 4 ;
	static final String GENDER = "��";
	private static String lang = "korea";
	private static final String COUNTRY = "���ѹα�";
	
	public void prn() {
		System.out.println("�̸� : " +name);
		System.out.println("���� : " +age);
		System.out.println("GENDER : " +GENDER);
		System.out.println("lang : " +lang);
		System.out.println("COUNTRY : " +COUNTRY);
	}
	
	// �޼ҵ带 �̿��ؼ� ����� ������ ���� : getter()
	public int getAge() {
		return age;
	}
	public String getGender() {
		return GENDER;
	}
	public String getLang() {
		return lang;
	}
	
	// �޼ҵ带 �̿��ؼ� ����� ������ ���� : setter()
	// ���ڰ��� �޾Ƽ� ����� ������ ����   
	public void setName(String s) {
		name = s ;
	}
	
	public void setAge(int s) {
		age = s ;
	}
	
}
