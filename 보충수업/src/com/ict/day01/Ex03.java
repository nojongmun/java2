package com.ict.day01;

public class Ex03 {
	public static void main(String[] args) {
        // if문
	    // 종류 : 단순 if문,  if ~ else,  다중if문
		
		// 1. 단순 if문 : 조건식이 참일때만 실행하고 거짓이면 if문을 무시한
		//    ** 조건식은  비교연산, 논리연산, boolean형 만 가능
        //    if(조건식) {
		//     조건식 참(true)일때만 실행
		//     조건식 참(true)일때만 실행
		//    }
		
		   String str = "초기값";
		   int sum = 59;
		   if(sum >=60) {
			   str = "합격";
		   }
		  System.out.println(str);
		  
	   // 2. if ~ else ~ : 조건식이 참일때 거짓일때 각각 별도로 실행한다.
	   //  if(조건식){
	   //      조건식이 참일때 ; 
	   //  }else{
	   //    조건식이 거짓일때 ;
	   //  }  	  
		  
		  str = "초기값";
		  sum = 77 ;
		  if(sum % 2 == 0) {
			  str = "짝수" ;
		  }else {
			  str = "홀수";
		  }
		  System.out.println(str);
		  
	   // 다중 if : if~ else가 여러개 존재하는 것
		   //  if(조건식1){
		   //      조건식1이 참일때 ; 
		   //  }else if(조건식2){
		   //    조건식1이 거짓이면서 조건식2는 참 일때 ;
		   //  }else if(조건식3){
		   //    조건식1,2이 거짓이면서 조건식3는 참 일때 ;
		   //  }else{
		   //    조건식1,2,3이 모두 거짓일때(나머지) ; 
		   //  }
		  
	       str = "초기값";
	       sum = 89 ;
	       if (sum>=90) {
			 str = "A";
		  }else if (sum>=80) {
			  str = "B";
		  }else if (sum>=70) {
			  str = "C";
		  }else {
			 str = "F"; 
		  }
	       System.out.println(str);
	       
	   // for문 : 일정한 규칙에 의해서 반복하는 문
	   // for (초기값; 조건식; 증감식) {
	   //		반복하는 문장 ;
	   //  }
	   // 1-10
	       for (int i = 1; i < 11; i++) {
			 System.out.println("i = " + i);
		   }
	       System.out.println();
	       
	   //  1- 10까지 짝수만 찍자
	       for (int i = 1; i < 11; i++) {
			  if( i % 2 == 0) {
				  System.out.println("i = "+ i);
			  }
		   }
	       System.out.println();
	       
	      // 1-10까지 홀수만 찍자
	       for (int i = 1; i < 11; i++) {
				if( i % 2 == 1) {
					  System.out.println("i = "+ i);
			   }
		  }
		  System.out.println(); 
	       
	}
}










