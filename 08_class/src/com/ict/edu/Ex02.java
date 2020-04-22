package com.ict.edu;

public class Ex02 {
	public static void main(String[] args) {
		// String 불변적 특징 : String은 한 번 만들면 수정 할 수 없다. 
		String s1 = "I ♥ YOU";
		s1 = s1 + " Korea";
		System.out.println(s1);
		System.out.println("====================");
		
		// 형식문자 : 
		// %s : 문자열, %d:정수,  %f:실수
		String s3 = "ICT 인재 개발원";
		int su1 = 90 ;
		float su2 = 95.4444f ;
		float su3 = 1234595.4454f ;
		double su4 = 1234595.4454f ;
		System.out.printf("당신은 %s 소속입니다.\n당신의 평균은 %d 입니다.", s3, su1);
		System.out.println();
		// %.2f => 소숫점 둘째 자리 까지 구함, 셋째자리에서 반올림
		System.out.printf("당신의 평균점수는 %f, %4f, %.2f", su2,su2,su2);
		System.out.println();
		System.out.printf("당신의 평균점수는 %f, %4f, %.2f", su3,su3,su3);
		System.out.println();
		System.out.printf("당신의 평균점수는 %f, %4f, %.2f", su4,su4,su4);
		System.out.println();
		System.out.printf("%s\n", s3);
		System.out.printf("%5s\n",s3);
		System.out.printf("%20s\n",s3);
		// String.format() : 형식을 지정하고 형식에 맞춰 생성
		System.out.println(String.format("%20s", s3));
		
	}
}
