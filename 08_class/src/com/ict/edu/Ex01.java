package com.ict.edu;

public class Ex01 {
	public static void main(String[] args) {
		String s1 = "ICT 인재 개발원";
		String s2 = "ICT 인재 개발원";
		
		// 같다
		// '=='의 의미는 기본 자료형인 경우는 '데이터가 같냐?'의 의미가 있다.
		// String, 객체인 경우는 '주소가 같냐 ?'의 의미가 있다.
		// 그러므로 String에서 데이터가 같냐의 의미로는 '=='를 사용 하지 않는다. 
		if(s1 == s2) {
			System.out.println("s1과 s2는 같다.");
		}else {
			System.out.println("s1과 s2는 다르다.");
		}
		
		// 다르다
		String s3 = new String("ICT 인재 개발원");
		if(s1 == s3) {
			System.out.println("s1과 s3는 같다.");
		}else {
			System.out.println("s1과 s3는 다르다.");
		}
		
		// 다르다
		if(s2 == s3) {
			System.out.println("s2과 s3는 같다.");
		}else {
			System.out.println("s2과 s3는 다르다.");
		}
		System.out.println("=======================");
		
		// String에서 '내용이 같냐?'의 의미는 equals, equalsIgnoreCase를 사용 한다.
		if(s1.equals(s2)) {
			System.out.println("s1과 s2는 같다.");
		}else {
			System.out.println("s1과 s2는 다르다.");
		}
		
		if(s1.equals(s3)) {
			System.out.println("s1과 s3는 같다.");
		}else {
			System.out.println("s1과 s3는 다르다.");
		}
		
		// 다르다
		if(s2.equals(s3)) {
			System.out.println("s2과 s3는 같다.");
		}else {
			System.out.println("s2과 s3는 다르다.");
		}
	}
}
