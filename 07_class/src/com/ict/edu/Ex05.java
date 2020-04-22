package com.ict.edu;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Ex04[] arr = new Ex04[5] ;
		for (int i = 0; i < arr.length; i++) {
			Ex04 test = new Ex04();
			System.out.print("이름 : ");
			String name = sc.next();
			System.out.print("국어 : ");
			int kor = sc.nextInt();
			System.out.print("영어 : ");
			int eng = sc.nextInt();
			System.out.print("수학 : ");
			int math = sc.nextInt();
			
			// setter를 이용해서 값넣기
			test.setName(name);
			test.setSum(kor+eng+math);
			test.play();
			
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
		Ex04 temp = new Ex04();
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
