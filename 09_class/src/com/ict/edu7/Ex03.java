package com.ict.edu7;

// 1. Member 내부클래스  // 3. static 내부클래스  
public class Ex03 {
	// 멤버필드
	int s1 = 10;
	final int s2 = 20;
	static int s3 = 30;
	static final int s4 = 40;
	private int s5 = 50;

	// 생성자
	public Ex03() {
		System.out.println("외부 클래스 생성자 : " + this);
	}

	// 멤버 메소드
	public void play() {
		int n1 = 100;
		final int n2 = 20;
		/*
		 * 지역변수는 static 사용 안됨, 접근제한자 사용 못함 static int s3 = 30 ; static final int s4 = 40
		 * ; 접근제한자 int s5 = 50 ;
		 */
		System.out.println("외부 클래스 메소드");
	}

	// Member 내부 클래스
	class In_Ex03 {
		// 일반 클래스 처럼 멤버필드,생성자,멤버메소드가 존재 할 수 있다.
		int k1 = 100;
		final int k2 = 200;
		// Member 내부클래스에서는 static 변수를 사용 할 수 없다.
		// static int k3 = 30;
		static final int k4 = 400;
		private int k5 = 500;
		 
		public In_Ex03() {
			System.out.println("내부클래스 생성자 : " + this);
		}
		
		// 내부 클래스에서는 외부클래스의 멤버들을 마음대로 사용 할수있다.
		public void prn() {
			System.out.println(s1);
			System.out.println(s2);
			System.out.println(s3);
			System.out.println(s4);
			// private 도 가져왔다.
			System.out.println(s5);
			System.out.println("---------");
			play();
			System.out.println("---------");
			System.out.println(k1);
			System.out.println(k2);
			System.out.println(k4);
			System.out.println(k5);
		}
	}

	// static 내부 클래스 : Member 내부클래서 사용 하지 못하는 static 변수를 사용하면 클래스에 static을 붙인다.
	static class In_Ex04 {
		// 일반 클래스 처럼 멤버필드,생성자,멤버메소드가 존재 할 수 있다.
		int a1 = 1000;
		final int a2 = 2000;
		static int a3 = 3000;
		static final int a4 = 4000;
		private int a5 = 5000;
		
		// 외부클래스에서 static이 아닌 멤버 사용 못 함
		// 내부클래스는 static 아니어도 사용 가능		
		public void go() {
			//System.out.println(s1);
			//System.out.println(s2);
			System.out.println(s3);
			System.out.println(s4);
			// private 도 가져왔다.
			//System.out.println(s5);
			System.out.println("--------------");
			System.out.println(a1);
			System.out.println(a2);
			System.out.println(a3);
			System.out.println(a4);
			System.out.println(a5);
		}
		
		// 외부메소드,내부메소드 모두  static 이어야만 사용 가능
		public static void go2(){
			// System.out.println(s1);
			// System.out.println(s2);
			System.out.println(s3);
			System.out.println(s4);
			// private 도 가져왔다.
			// System.out.println(s5);
			System.out.println("--------------");
			// System.out.println(a1);
			// System.out.println(a2);
			System.out.println(a3);
			System.out.println(a4);
			// System.out.println(a5);
		}
	}
}
