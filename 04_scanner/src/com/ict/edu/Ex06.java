package com.ict.edu;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		// 이름, 국어, 영어, 수학점수를 받아서  총점, 평균, 학점을 구하자
		Scanner sc = new Scanner(System.in);
		
		esc:
		while (true) {
			System.out.print("당신의 이름 : ");
			String name = sc.next();
			System.out.print("국어점수 : ");
			int kor = sc.nextInt();
			System.out.print("영어점수 : ");
			int eng = sc.nextInt();
			System.out.print("수학점수 : ");
			int math = sc.nextInt();
			
			int sum = kor + eng + math ;
			double avg = (int)(sum/3.0*10)/10.0 ;
			String hak = "";
			if (avg>=90) {
				hak ="A학점";
			}else if (avg>=80) {
				hak ="B학점";
			}else if (avg>=70) {
				hak ="C학점";
			}else {
				hak ="F학점";
			}
			
			System.out.println("이름 : " + name);
			System.out.println("총점 : " + sum);
			System.out.println("평균 : " + avg);
			System.out.println("학점 : " + hak);
			
			while (true) {
				System.out.print("계속할까요(1.yes, 2.no) >> ");
				int res = sc.nextInt();
				if (res == 1) {
					continue esc;
				} else if(res == 2){
					break esc;
				} else {
					continue ;
				}
			}
		}
		System.out.println("수고하셨습니다.");
		
	}
}
