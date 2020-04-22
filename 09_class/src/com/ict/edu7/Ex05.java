package com.ict.edu7;

// 익명내부클래스 : 이름 없는 클래스, 다시 호출 못함
//              대부분 인터페이스, 추상 클래스에서 사용
interface Ex05 {
   int data = 100 ;
   void prnData();
}

// 1. 일반적인 방법
class Ex05_InnerClass implements Ex05{
	@Override
	public void prnData() {
		System.out.println(data);
	}
}

// 2. 메소드 안에 인터페이스를 구현한 클래스 생성
class Ex05_InnerClass2{
	public void play() {
		// 익명 Local 내부클래스 
		new Ex05() {
			@Override
			public void prnData() {
				System.out.println(data);
			}
		}.prnData();
	}
	
	// 3. 인터페이스가 메소드 인자로 들어온 겨우
	public void play(Ex05 t) {
		System.out.println(t.data);
	}
}













