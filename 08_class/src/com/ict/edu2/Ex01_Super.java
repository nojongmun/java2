package com.ict.edu2;

// 부모클래스 : super, parent
public class Ex01_Super {
    String name = "홍길동";
    int age = 47;
    String addr = "서울";
    private String dog = "멍뭉이";
    static int car = 1 ;
    static final boolean gender = true;
    
    public Ex01_Super() {
		System.out.println("부모클래스 생성자 : " + this);
	}
    
    public void prn() {
    	System.out.println("부모클래스 메소드");
    	
    	// 부모는 자식의 멤버들을 가져올수 없다.
    	// System.out.println(cat);
    	// System.out.println(this.cat);
    	
    }
    public static void prn2() {
    	System.out.println("부모클래스 static 메소드");
    }
    
}
