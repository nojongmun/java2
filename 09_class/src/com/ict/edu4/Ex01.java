package com.ict.edu4;

// 인터페이스 : 서비스를 제공하기 위한 목록을 말한다.
//           상수(static final)와 추상메소드들로 이루어져 있다.
//           생성자도 없다.(객체 생성도 않됨)
//           유일하게 다중상속이 가능하다.
//           '인터페이스가 같다' 라는 말은 대체가 가능하다, 호환이 가능하다. 

/*
        interface
         /    \  
   extends     implements    
       /        \
   interface   class
      \         /
   implements  extends 
        \      /
         class
         
   **클래스를 부모로 가지는 인터페이스는 없다.      
 */
  
public interface Ex01 {
	// 자동으로 static final로 변한다.
     int su1 = 10 ;
     static int su2 = 20 ;
     final int su3 = 30 ;
     static final int su4 = 40 ;
     /*
     public void play() {
        System.out.println("일반 메소드 사용 못함");	 
     }
     */
     public static void play() {
    	 System.out.println("static 메소드 사용 가능");
     }
     // 추상메소드 사용 가능
     public abstract void play2();
     // abstract를 붙이지 않아도 인터페이스에서는 오류가 아님(추상클래스에서는 오류)
     public void sound();
}
