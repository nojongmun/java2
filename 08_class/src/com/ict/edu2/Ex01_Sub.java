package com.ict.edu2;

// 자식 클래스 : Sub, Child
// 자식 클래스에서 상속관계를 맺는다. (자식 extends 부모)
// 상속 관계 : 자식클래스가 부모클래스의 멤버필드, 멤버메소드를 마음대로 사용 할 수 있는 것 
//          자바에서는 다중상속를 할 수 없다. 즉 부모클래스가 하나만 존재할 수 있다.
//          모든 클래스는 Object라는 클래스를 상속받고 있다.
//          ( 현재클래스가 상속관계에 없으면 Object 클래스를 상속 받고 있다는 뜻이다.)
public class Ex01_Sub extends Ex01_Super{
    String name = "홍반장";
    int age = 15 ;
    String cat = "후크";
    public Ex01_Sub() {
    	// 부모클래스의 생성자를 호출하는 것이 생략 되어이다. (무조건 첫번째 줄)
		System.out.println("자식클래스 생성자 : " +this);
	}
    
    public void play() {
    	String name = "홍두께";
    	System.out.println(name);
    	System.out.println(this.name);
    	System.out.println(super.name);
    	System.out.println(age);
    	
    	// 자식클래스는 부모클래스이 멤버필드나 메소드를 마음대로 가져올수 있다.
    	System.out.println(super.addr);
    	System.out.println(this.addr);
    	System.out.println(addr);
    	
    	// private은 상속관계에서도 접근 안됨
    	// System.out.println(dog);
    	
    }
}
