package com.ict.edu;

public class Ex10 {
	public static void main(String[] args) {
	// break label과 continue label
	// break label : 레이블이 지정한 반복문(블록)을 탈출
	// continue label : 레이블이 지정한 반복문(블록)수행문을 포기하고 다음회차로 진행
		
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				System.out.println("i="+i+",  j="+j);
			}
		}
		System.out.println("===================");
		
		// j=4일 때 break문 사용
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				if(j==4) break;
				System.out.println("i="+i+",  j="+j);
			}
		}
		System.out.println("===================");
		
		// i=2일 때 break문 사용
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				if(i==2) break;
				System.out.println("i="+i+",  j="+j);
			}
		}
		System.out.println("===================");
		
		// label 표시 , label 표시 다음에는 반드시 for이나 while문만 가능
		// j가 4일때 break label를 하자
		esc :
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				if(j==4) break esc;
				System.out.println("i="+i+",  j="+j);
			}
		}
		System.out.println("===================");
		
		// i=2일 때 break lable문 사용
		esc:
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				if(i==2) break esc;
				System.out.println("i="+i+",  j="+j);
			}
		}
		System.out.println("===================");
		
		esc:
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				if(j==4) continue ;
				System.out.println("i="+i+",  j="+j);
			}
		}
       System.out.println("===================");
		esc:
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				if(j==4) continue esc;
				System.out.println("i="+i+",  j="+j);
			}
		}
       System.out.println("===================");
	}
}
