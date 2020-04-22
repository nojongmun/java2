package com.ict.edu4;

// static : 클래스 사용못함 , 멤버필드, 멤버메소드 사용함
public class Ex05 {
	// 인스턴스 변수는 객체가 만들어질 때 마다 
	// 항상 초기값을 가지고 생성 된다.
	int su1 = 10 ;          // 인스턴스 변수

	// static은 객체 생성과 상관없이 값을 가지고 있으므로
	// 같은 클래스을 이용한 다른 객체가 호출하여 사용 할 수  있다.
	static int su2 = 10 ;   // static 변수, 클래스변수 
	
	public Ex05() {
		su1 ++ ;
		su2 ++ ;
	}
	
	public void sum(int k1, int k2) {
		// 지역변수로는 static를 사용할 수 없다.
		// static double pi = 3.14 ;
		System.out.println("결과 : " + (k1+k2));
	}
	
	// static 메소드
	public static void sub() {
		// 인스턴스 변수 사용 할 수 없다.
		// System.out.println(su1);
		
		// 지역변수로는 static를 사용할 수 없다.
		//  static  double pi = 3.14 ;
		
		// static 변수, 클래스변수  사용 가능
		System.out.println(su2);
	}
}
