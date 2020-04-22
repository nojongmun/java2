package com.ict.edu;

public class Ex01 {
	public static void main(String[] args) {
		// 단순 if문 : 조건식이 참일때만 실행, 거짓이면 if문 무시
		// 조건식 : boolean, 비교연산, 논리연산
		// 형식 : if(조건식){
		//       조건식 참일 때 실행할 문장;
		//       조건식 참일 때 실행할 문장;
		//      }
		// 단, 실행할 문장이 한줄이면 { } 생략가능
		
		//  int k1이 60이상 이면 합격,
		 int k1 = 50;
		 String str = "초기값";
		 if(k1 >= 60) {
			 str = "합격";
		 }
		 System.out.println("결과 : " +str);
	  	 
		//  int k1이 60이상 이면 합격, 아니면 불합격
		 k1 = 50;
		 str = "불합격";
		 if(k1 >= 60) {
			 str = "합격";
		 }
		 System.out.println("결과 : " +str); 
		 
		 // int k2가 홀수인지 짝수 인지 판별하자
		  int k2 = 142;
		  str = "홀수";
		  if(k2%2==0) {
			  str = "짝수";
		  }
		  System.out.println("결과 : " +str); 
		  
		 // char k3가 대문자인지, 대문자가 아닌지 판별하자
		  char k3 ='T';
		  str = "대문자 아님";
		  if(k3>='A' && k3<='Z') {
			  str = "대문자";
		  }
		  System.out.println("결과 : " +str);
		  
		 // int k4가  1 또는 3 이면 남자, 아니면 여자 인지 판별하자
		 int k4 = 2;
		 str = "여자" ;
		 if(k4 == 1 || k4 == 3) {
			 str = "남자";
		 }
		 System.out.println("결과 : " +str);
		 
		 // 두수 중 큰값을 출력하시오
		   int k5 = 10 ;
		   int k6 = 15 ;
		   int max = k6 ;
		   if(k5 > k6) {
			 max = k5 ;   
		   }
		   System.out.println("결과 : " +max);  
		   
		   boolean isKorean = true ;
		   if(isKorean) {
			   System.out.println("한국사람 입니다.");
		   }
		   
		   if(isKorean == true) {
			   System.out.println("한국사람 입니다.");
		   }
	}
}






