package com.ict.edu;

public class Ex01 {
	public static void main(String[] args) {
		String s1 = "ICT ���� ���߿�";
		String s2 = "ICT ���� ���߿�";
		
		// ����
		// '=='�� �ǹ̴� �⺻ �ڷ����� ���� '�����Ͱ� ����?'�� �ǹ̰� �ִ�.
		// String, ��ü�� ���� '�ּҰ� ���� ?'�� �ǹ̰� �ִ�.
		// �׷��Ƿ� String���� �����Ͱ� ������ �ǹ̷δ� '=='�� ��� ���� �ʴ´�. 
		if(s1 == s2) {
			System.out.println("s1�� s2�� ����.");
		}else {
			System.out.println("s1�� s2�� �ٸ���.");
		}
		
		// �ٸ���
		String s3 = new String("ICT ���� ���߿�");
		if(s1 == s3) {
			System.out.println("s1�� s3�� ����.");
		}else {
			System.out.println("s1�� s3�� �ٸ���.");
		}
		
		// �ٸ���
		if(s2 == s3) {
			System.out.println("s2�� s3�� ����.");
		}else {
			System.out.println("s2�� s3�� �ٸ���.");
		}
		System.out.println("=======================");
		
		// String���� '������ ����?'�� �ǹ̴� equals, equalsIgnoreCase�� ��� �Ѵ�.
		if(s1.equals(s2)) {
			System.out.println("s1�� s2�� ����.");
		}else {
			System.out.println("s1�� s2�� �ٸ���.");
		}
		
		if(s1.equals(s3)) {
			System.out.println("s1�� s3�� ����.");
		}else {
			System.out.println("s1�� s3�� �ٸ���.");
		}
		
		// �ٸ���
		if(s2.equals(s3)) {
			System.out.println("s2�� s3�� ����.");
		}else {
			System.out.println("s2�� s3�� �ٸ���.");
		}
	}
}
