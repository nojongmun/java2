package com.ict.edu;

public class Ex07 {
	public static void main(String[] args) {
		
		System.out.println("main1");
	 // static 메소드 사용 가능 ; 클래스이름.메소드
	 // 메소드 호출(실행)
	 // 메소드가 끝나면 자기를 호출 곳으로 되돌아 온다.
		// sub()가 void 이기 때문에 저장 변수가 필요없다.
		Ex06.sub();
		System.out.println("main2");
		// div()는 void가 아니므로 반환형 으로 저장해야 된다.
		String k = Ex06.div();
		System.out.println(k);
		System.out.println("main3");
	}
}
