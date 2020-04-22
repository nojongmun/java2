package com.ict.edu;

public class Ex03 {
	public static void main(String[] args) {
	    // 다음 if문 (중첩 if문)
		// if(조건식1){
		//    조건식1이 참일때 실행할 문장들;
		// }else if(조건식2){
		//   조건식1은 false이고, 조건식2가 참일때 실행할 문장들;   
		// }else if(조건식3){
		//   조건식1,2은 false이고, 조건식3가 참일때 실행할 문장들;   
		// }else{
		//   조건식 1,2,3 모두 false일때, 즉 나머지
		// } 
		
		// int k1의 점수가 90이상이면 A, 80이상이면 B, 70이상이면 C, 나머지 F
		 int k1 = 95;
		 String str = "";
         if (k1 >= 90) {
			str = "A";
		}else if (k1 >= 80) {
			str = "B";
		}else if (k1 >= 70) {
			str = "C";
		}else {
			str = "F";
		}
		System.out.println("결과 : " + str);

		// char k2가 대문자 인지 , 소문자인지, 숫자인지, 기타문자인지 판별
		char k2 = '&';
		if (k2>='A' && k2<='Z') {
			str = "대문자";
		}else if (k2>='a' && k2<='z') {
			str = "소문자";
		}else if (k2>='0' && k2<='9') {
			str = "숫자";
		}else {
			str = "기타문자";
		}
		System.out.println("결과 : " + str);
		
	    // char k3가 A,a이면 아프리카, B,b이면 브라질, C,c이면 캐나다, 나머지는 한국
		char k3 = 'K';
		if (k3=='A' || k3=='a') {
			str = "아프리카";
		}else if (k3=='B' || k3=='b') {
			str = "브라질";
		}else if (k3=='C' || k3=='c') {
			str = "캐나다";
		}else {
			str = "한국";
		}
		System.out.println("결과 : " + str);
		
		// menu가 1이면 카페모카 3500, 2이면 카페라떼 4000, 3이면 아메리카노 3000,
		// 4이면 과일쥬스 3500이다. 친구와 2잔을 10000내고 먹었다.
		// 잔돈은 얼마인가? (부가세 10% 포함)
		
		int menu = 3 ;
		if (menu == 1) {
			String coff = "카페모카";
			int dan = 3500 ;
			int su = 2 ;
			int total = dan * su ;
			int vat = (int)(total *0.1);
			int input = 10000;
			int output = input - (total+vat);
			System.out.println("잔돈 : "+ output);
		}else if (menu == 2) {
			String coff = "카페라떼";
			int dan = 4000 ;
			int su = 2 ;
			int total = dan * su ;
			int vat = (int)(total *0.1);
			int input = 10000;
			int output = input - (total+vat);
			System.out.println("잔돈 : "+ output);
		}else if (menu == 3) {
			String coff = "아메리카노";
			int dan = 3000 ;
			int su = 2 ;
			int total = dan * su ;
			int vat = (int)(total *0.1);
			int input = 10000;
			int output = input - (total+vat);
			System.out.println("잔돈 : "+ output);
		}else if (menu == 4){
			String coff = "과일쥬스";
			int dan = 3500 ;
			int su = 2 ;
			int total = dan * su ;
			int vat = (int)(total *0.1);
			int input = 10000;
			int output = input - (total+vat);
			System.out.println("잔돈 : "+ output);
		}
		
		System.out.println("리팩토링 == 1.중복코드 제거");
		menu = 3 ;
		String coff = "";
		int dan = 0 ;
		if (menu == 1) {
			coff = "카페모카";
			dan = 3500 ;
		}else if (menu == 2) {
			coff = "카페라떼";
			dan = 4000 ;
		}else if (menu == 3) {
			coff = "아메리카노";
			dan = 3000 ;
		}else if (menu == 4){
			coff = "과일쥬스";
			dan = 3500 ;
		}
		int su = 2 ;
		int total = dan * su ;
		int vat = (int)(total *0.1);
		int input = 10000;
		int output = input - (total+vat);
		System.out.println("잔돈 : "+ output);
	}
}






