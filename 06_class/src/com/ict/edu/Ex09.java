package com.ict.edu;

public class Ex09 {
	
	// ���� - ��ȯ�� ����, ���� ����
	public int add(int i, int j) {
	    return i + j;	
	}
	// ����
	public void sub(int i, int j) {
		System.out.println(i + "-" + j + " = " + (i-j));
	}
	// ����
	public int mul(int i, int j) {
		return i * j ;
	}
	// ������
	public void div(int i, int j) {
		if(j==0) {
			System.out.println("0���δ� ���� ���� �����ϴ�.");
		}else {
		    System.out.println(i + "/" + j + " = " + (i/j));
		}
	}
	
}
