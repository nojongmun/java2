package com.ict.edu3;

import java.util.Scanner;

//  throws : ��������, ���� �絵
//   - �ǹ� : ���ܰ� �߻��ϸ� ����ó���� ���� �ʰ�, �ڽ��� ȣ���� ������ ���� ��ü�� �����ϴ� �� 
//   - ���߿��� ���� ó��(try~catch)�� �ϴ� ���� ����.


public class Ex04 {
	// ���� �絵, ���� ���� : �ش� �޼ҵ带 ȣ���� ������ ���� ��ü�� ����.
	public void setData(String msg)throws NumberFormatException {
		/*
		try {
			if(msg.length()>=1) {
				String str = msg.substring(0, 1); // msg�� ù���ڸ� ����
				prnData(str);
			}
		} catch (Exception e) {
			System.out.println("���ڸ� �Է��ϼ���");
		}
		*/
		if(msg.length()>=1) {
			String str = msg.substring(0, 1); // msg�� ù���ڸ� ����
			prnData(str);
		}
	}
	
	// ���� �絵, ���� ���� : �ش� �޼ҵ带 ȣ���� ������ ���� ��ü�� ����.
	public void prnData(String str) throws NumberFormatException{
		// ����ó��
		/*
		try {
			int dan = Integer.parseInt(str);
			System.out.println(dan + " ��");
			for (int i = 1; i < 10; i++) {
				System.out.println(dan + " * " + i + " = " + (dan*i));
			}
		} catch (Exception e) {
			System.out.println("���ڸ� �Է��ϼ���");
		}
		*/
		int dan = Integer.parseInt(str);
		System.out.println(dan + " ��");
		for (int i = 1; i < 10; i++) {
			System.out.println(dan + " * " + i + " = " + (dan*i));
		}
	}
	// main �޼ҵ�� JVM�� ȣ�� �� ���̹Ƿ� 
	// throws�� ���� �ʴ� ���� ����.
	public static void main(String[] args) {
		try {
			Ex04 test = new Ex04();
			Scanner sc = new Scanner(System.in);
			System.out.print("�����Է� : ");
			String msg  = sc.next();
			test.setData(msg);
		} catch (Exception e) {
			System.out.println("ù���ڴ� ������ ���ڷ� �Է��ϼ���");
		}
		
		
		System.out.println("���� �ϼ̽��ϴ�.");
	}
}




