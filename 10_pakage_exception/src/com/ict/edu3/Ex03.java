package com.ict.edu3;

import java.util.InputMismatchException;
import java.util.Scanner;
// ���� catch �� : try{ }�� ���ܰ� �ϳ��� �ƴҶ�  ���
// ���� ���� : Exception ����Ҷ� �ݵ�� ���� �Ʒ��� catch������ ��� �Ѵ�.        
public class Ex03 {
	public static void main(String[] args) {
		/*
		try {
			Scanner sc = new Scanner(System.in);
			int var = 50 ;
			System.out.print("�����Է� : ");
			int su = sc.nextInt();
			System.out.println("���� : " + (var / su));
		} catch (InputMismatchException e) {
			System.out.println("������ �Է���  �ּ���");
		} catch (ArithmeticException e) {
			System.out.println("0���δ� ���� ���� �����ϴ�.");
		}
		*/
		
		try {
			Scanner sc = new Scanner(System.in);
			int var = 50 ;
			System.out.print("�����Է� : ");
			int su = sc.nextInt();
			System.out.println("���� : " + (var / su));
		} catch (Exception e) {
			System.out.println("����� �Է��ϼ���");
		}
		
		System.out.println("���� �ϼ̽��ϴ�.");
	}
}
