package com.ict.edu3;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Ex03[] arr = new Ex03[5] ;
		for (int i = 0; i < arr.length; i++) {
			System.out.print("�̸� : ");
			String name = sc.next();
			System.out.print("���� : ");
			int kor = sc.nextInt();
			System.out.print("���� : ");
			int eng = sc.nextInt();
			System.out.print("���� : ");
			int math = sc.nextInt();
			
			// �����ڸ� �̿��ؼ� ���ֱ�
			Ex03 test = new Ex03(name, kor, eng, math);
			test.setSum();
			arr[i] = test;
		}
		
		// ���� 
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[i].sum < arr[j].sum) {
					arr[i].rank++;
				}
			}
		}
		// ����
		
		// Ex04�� �ӽ�
		Ex03 temp = new Ex03();
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i].sum < arr[j].sum) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		
		// ���
		// �迭�� index�� ȣ�������� Ŭ������ ������ �޼ҵ�� ȣ���� �� �ִ�.
	    for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i].name+"\t");
			System.out.print(arr[i].sum+"\t");
			System.out.print(arr[i].avg+"\t");
			System.out.print(arr[i].hak+"\t");
			System.out.println(arr[i].rank);
		}
		
	}
}
