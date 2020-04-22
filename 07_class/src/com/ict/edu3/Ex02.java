package com.ict.edu3;

public class Ex02 {
	public static void main(String[] args) {
     // 객체 생성 방법 : 		
	 // 클래스  참조변수 = new 생성자	
	 	Ex01  test = new Ex01();
		
		System.out.println(test.getName());
		System.out.println(test.getAge());
		System.out.println(test.getAdd());
		
		// 멤버들의 데이터를 변경할 수 있다.: setter()
		test.setName("태권브이");
		test.setAge(35);
		test.setAdd("한강 깊은 곳");
		System.out.println("=================");
		
		System.out.println(test.getName());
		System.out.println(test.getAge());
		System.out.println(test.getAdd());
		System.out.println("=================");
		
		Ex01 test2 = new Ex01("손흥민", 28, "영국");
		System.out.println(test2.getName());
		System.out.println(test2.getAge());
		System.out.println(test2.getAdd());
		System.out.println("=================");
	}
}
