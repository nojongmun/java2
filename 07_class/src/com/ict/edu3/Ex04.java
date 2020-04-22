package com.ict.edu3;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Ex03[] arr = new Ex03[5] ;
		for (int i = 0; i < arr.length; i++) {
			System.out.print("이름 : ");
			String name = sc.next();
			System.out.print("국어 : ");
			int kor = sc.nextInt();
			System.out.print("영어 : ");
			int eng = sc.nextInt();
			System.out.print("수학 : ");
			int math = sc.nextInt();
			
			// 생성자를 이용해서 값넣기
			Ex03 test = new Ex03(name, kor, eng, math);
			test.setSum();
			arr[i] = test;
		}
		
		// 순위 
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[i].sum < arr[j].sum) {
					arr[i].rank++;
				}
			}
		}
		// 정렬
		
		// Ex04를 임시
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
		
		
		// 출력
		// 배열은 index로 호출하지만 클래스는 변수나 메소드로 호출할 수 있다.
	    for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i].name+"\t");
			System.out.print(arr[i].sum+"\t");
			System.out.print(arr[i].avg+"\t");
			System.out.print(arr[i].hak+"\t");
			System.out.println(arr[i].rank);
		}
		
	}
}
