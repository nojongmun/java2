package com.ict.edu;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		// Scanner Ŭ������ java.util�� �����ϴ� Ŭ�����̴�.
		// �⺻������ java.lang�̿ܿ� �����ϴ� Ŭ�������� import�ؾ� �ȴ�.
		// ��Ŭ������ �ڵ����� import�� ���ش�. �ش� Ŭ���� �ڿ��� ctrl + space bar�� ������ �ȴ�.
		// ctrl + shift + o �� ��� ����
		
		// Ű���忡 �Է��� ������  sc�� �����Ѵ�. 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����� �̸� : ");
		// sc ����� ������ ���ڿ� String���� ���� ���� �����ϰڴ�. (next(), nextLine())
		// �� ���ڶ� char ó���� �� �� ����. ������  ���ڿ�(String)ó���� �ؾ� �ȴ�. 
	       String name = sc.next();    // ���� �ϸ� �ȵ�
	    // String name = sc.nextLine();    // ���� ��� ����
	    System.out.println("����� �Է��� �̸��� "+name+" �Դϴ�.");
	       name = sc.nextLine(); //  nextLine���� ���๮�ڸ� ������
	    System.out.print("����� �̸� : ");
	       name = sc.nextLine();
	    System.out.println("����� �Է��� �̸��� "+name+" �Դϴ�.");
	    
	    System.out.print("����� ���� : ");
	   // sc ����� ������ int ���� ���� ���� �����ϰڴ�.
	    int age = sc.nextInt();
	    System.out.println("����� �Է��� ���̴�  "+age+" �Դϴ�.");
	    
	    System.out.print("����� Ű : ");
	    // sc ����� ������ double ���� ���� ���� �����ϰڴ�.
	    double height = sc.nextDouble();
	    System.out.println("����� �Է��� ���̴�  "+height+" �Դϴ�.");
	    
	    System.out.print("����� �����Դϱ� ?(true/false)");
	    // sc ����� ������ boolean ���� ���� ���� �����ϰڴ�.
	    boolean gender = sc.nextBoolean();
	    
	    if(gender) {
	    	System.out.println("����� ���� �Դϴ�.");
	    }else {
	    	System.out.println("����� ���� �Դϴ�.");
	    }
		
	}
}









