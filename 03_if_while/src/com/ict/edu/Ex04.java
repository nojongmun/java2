package com.ict.edu;

public class Ex04 {
	public static void main(String[] args) {
	    // switch ~ case : 조건문, 
		// if문의 조건식은 boolean, 논리연산, 비교연산, 범위가 주어졌을 때 사용하기 편하다
		// switch문은 조건값이 byte, short, int, char, String이 주어졌을때 사용하기 편하다
		/*
		  break; 는 현재 블록을 탈출하는 의미를 갖는다.
		  switch (인자값=조건값) {
			case 조건값1:  인자값과 조건값이 같을때 수행할 수행문; break;
            case 조건값2:  인자값과 조건값이 같을때 수행할 수행문; break;
            case 조건값3:  인자값과 조건값이 같을때 수행할 수행문;
                                                   인자값과 조건값이 같을때 수행할 수행문;
                                                   인자값과 조건값이 같을때 수행할 수행문; break;
		  default: 조건값1,2,3  아닌 나머지를 수행할 수행문; [break;(생략가능)]
		}
		*/
		// char k1이 A이면 아프리카, B이면 브라질, C이면 캐나다 나머지 대한민국
		// break가 없으면 생기는 현상 : break를 만날때까지 아래수행문을 모두 실행한다.
		char k1 = 'B';
		switch (k1) {
			case 'A':  System.out.println("아프리카");
			case 'B':  System.out.println("브라질"); 
			case 'C':  System.out.println("캐나다"); 
			default: System.out.println("대한민국");	
		}
		System.out.println("===================");
		
		String str ="";
		switch (k1) {
			case 'A':  str = "아프리카";
			case 'B':  str = "브라질"; 
			case 'C':  str = "캐나다"; 
			default:   str = "대한민국";	
		}
		System.out.println(str);
		System.out.println("===================");
		
		str ="";
		switch (k1) {
			case 'A':  str = "아프리카"; break;
			case 'B':  str = "브라질"; break;
			case 'C':  str = "캐나다"; break;
			default:   str = "대한민국";	break;
		}
		System.out.println(str);
		System.out.println("===================");
		
		// char k1이 A,a이면 아프리카, B,b이면 브라질, C,c이면 캐나다 나머지 대한민국
		k1 = 'C';
		str = "";
		switch (k1) {
			case 'A': str = "아프리카"; break;
			case 'a': str = "아프리카"; break;
			case 'B': str = "브라질"; break;
			case 'b': str = "브라질"; break;
			case 'C': str = "캐나다"; break;
			case 'c': str = "캐나다"; break;
			default: str = "대한민국";break;
		}
		System.out.println(str);
		System.out.println("===================");
		
		k1 = 'C';
		str = "";
		switch (k1) {
			case 'A': 
			case 'a': str = "아프리카"; break;
			case 'B': 
			case 'b': str = "브라질"; break;
			case 'C': 
			case 'c': str = "캐나다"; break;
			default: str = "대한민국";break;
		}
		System.out.println(str);
		System.out.println("===================");
		
	  // char k2가 1또는 3이면 남자, 2또는 4면 여자, 나머지 외국인.
	    char k2 = 3;
	    switch (k2) {
			case 1:    
			case 3:  str = "남자"; break;  
			case 2:    
			case 4:  str = "여자"; break;  
			default: str = "외국인";	break;
		}
	    System.out.println(str);
		System.out.println("===================");
		
	  // 나라이름으로 도시 출력하기 (한국=서울, 중국=북경, 일본=동경, 미국=워싱턴, 캐나다=오타와) 	
		String k3 = "미국";
		switch (k3) {
			case "한국":  str = "서울" ; break;
			case "중국":  str = "북경" ; break;
			case "일본":  str = "동경" ; break;
			case "미국":  str = "워싱턴" ; break;
			case "캐나다":  str = "오타와" ; break;
		}
		System.out.println(str);
		System.out.println("===================");
	}
}













