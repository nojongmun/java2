package com.ict.edu;

public class Ex07 {
	public static void main(String[] args) {
		// while문  : for문과 같은 반복문
		// while문의 끝을 만나면 조건식으로 이동
		
		// for(초기식; 조건식 ; 증감식){
		//      조건식이 참일때 실행
		// }
		
		// 초기식                                              초기식
		// while(조건식){               while(true){
		//   조건식이 참일때 실행할 문장 ;      if(빠져나갈 조건) break; 
		//   증감식                                             실행할 문장;
		//  }                           증감식;           
	    //                           }    
		
		// 0-10번 출력하기
		int i=0;
		while (i<11) {
			System.out.println(i);
			i++;
		}
		System.out.println("=====================");
		i=0;
		while (true) {
			if(i>=11) break;
			System.out.println(i);
			i++;
		}
		System.out.println("=====================");
		
		// 0-10까지 짝수만 출력하기
		i=0;
		while (i<11) {
			if(i%2 == 0) {
			   System.out.println(i);
			}
			i++;
		}
		System.out.println("=====================");
		i=0;
		while (true) {
			if(i>=11) break;
			if(i%2==0)  
				System.out.println(i);
			i++;
		}
		System.out.println("=====================");
		
		// a-g까지 출력
		char j='a';
		while (j<'h') {
			System.out.println(j);
			j++;
		}
		System.out.println("=====================");
		j='a';
		while (true) {
			if(j>='h')    break;
			System.out.println(j);
			j++;
		}
		System.out.println("=====================");
		
		// 5단출력
		i = 1 ;
		while (i<10) {
			System.out.println("5 * "+ i + " = "+ (5*i));
			i++;
		}
		System.out.println("=====================");
		i = 1 ;
		while (true) {
			if(i>=10)  break;
			System.out.println("5 * "+ i + " = "+ (5*i));
			i++;
		}
		System.out.println("=====================");
		
		// 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0
		i=1;
		while (i<5) {
			System.out.println("0 0 0 0");
			i++;
		}
		System.out.println("=====================");
		i = 1 ;
		while (true) {
			if(i>=5)  break;
			System.out.println("0 0 0 0");
			i++;
		}
		System.out.println("=====================");
		
		// 0-10까지 누적합 구하기
		i = 0 ;
		int sum = 0 ;
		while (i<11) {
			sum = sum + i ;
			i++;
		}
		System.out.println("sum : " + sum);
		System.out.println("=====================");
		i = 0 ;
		sum = 0 ;
		while (true) {
			if(i>=11) break;
			sum = sum + i ;
			i++;
		}
		System.out.println("sum : " + sum);
		System.out.println("=====================");
	}
}









