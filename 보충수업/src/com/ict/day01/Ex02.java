package com.ict.day01;

public class Ex02 {
	public static void main(String[] args) {
	  // 자바의 기본 자료형 : 자바에서 처리는 데이터의 유형
	  //  - 논리형 : boolean => true, false 둘 중 하나  기억 시킬 수 있다. 
	  //  - 문자형 : char => 0-65535의 숫자, 'a', '가', 유니코드(비영어권사용가능)
	  //  - 정수형 : byte,short,int,long, 
	  //  	             정수의 기본은 int 이다.
	  //	       long는 숫자 뒤에 L 또는 l를 붙인다.(생략가능)
	  //  - 실수형 : float, double
	  //           float는 반드시 숫자 뒤에 F 또는 f를 붙인다.
	  //           실수의 기본은 double이다.
	  // ** 크기비교 :  byte < short < char < int < long < float < double 	
	  // ** 문자열을 사용하는  String은  기본자료형이 아니다.
		
		boolean b1 = true ;
		System.out.println(b1);
		b1 = false;
		System.out.println(b1);
		System.out.println();
		
		char c1 = 69 ;
		System.out.println(c1); // 69가 아니라 69에 해당하는 문자가 출력
		c1 = 'A';
		System.out.println(c1);
		c1 = 'a';
		System.out.println(c1);
		c1 = '가';
		System.out.println(c1);
		System.out.println();
		
		int su = 47 ;    
		System.out.println(su);
		su = 1234567891;
		System.out.println(su);
		System.out.println();
		
		long su2 = 12345678912L;
		System.out.println(su2);
		su2 = 123456789 ;
		System.out.println(su2);
		System.out.println();
		
		float f1 = 3.14f;
		System.out.println(f1);
		
		double d1 = 123.4567;
		System.out.println(d1);
		
	}
}
