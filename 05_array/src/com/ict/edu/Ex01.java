package com.ict.edu;

public class Ex01 {
	public static void main(String[] args) {
		// 배열 :같은 자료형의 데이터를 한 곳에 모아둔 묶음
		//      반드시 같은 자료형만 저장 할 수 있다.
		//      생성할때 크기를 지정해야 되고, 지정된 크기는 변경되지 않는다.
		//      배열의 출력은 일반적으로 for문을 사용한다.
		
		// 배열 생성 순서 : 선언 => 생성 => 데이터 저장
		
		// 1. 선언 : 자료형[] 이름 ;  또는   자료형 이름[];
		int[] su ;
      
		// 2. 생성  :  su = new 자료형[배열의크기=방의 수=1부터 시작]
		// 배열의 주소가 배열이름을 이용해서 저장된다.
		su = new int[4];
		
		// 3. 데이터 저장 : 배열이름[방번호=index=인텍스=0부터시작] = 데이터 ;
		su[0] = 10 ;
        su[1] = 20 ;				
        su[2] = 'c'; 				
        su[3] = 40 ;
        
        // su에는 배열의 주소가 있다.
        System.out.println(su);
        
        // su의 index을 넣으면 데이터가 나온다.
        System.out.println(su[0]);
        System.out.println(su[1]);
        System.out.println(su[2]);
        System.out.println(su[3]);
        System.out.println("===============");
        
        // for문 사용
        // 배열이름.length => 배열의 크기
        for (int i = 0; i < su.length; i++) {
			System.out.println(su[i]);
		}
        System.out.println("===============");
        
        // 개선된 for문 (foreach) : => 주로 배열에 많이 사용
        for (int i : su) {
			System.out.println(i);
		}
	}
}





