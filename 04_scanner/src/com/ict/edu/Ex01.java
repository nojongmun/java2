package com.ict.edu;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		// Scanner 클래스는 java.util에 존재하는 클래스이다.
		// 기본적으로 java.lang이외에 존재하는 클래스들은 import해야 된다.
		// 이클립스는 자동으로 import를 해준다. 해당 클래스 뒤에서 ctrl + space bar를 누르면 된다.
		// ctrl + shift + o 도 사용 가능
		
		// 키보드에 입력한 내용을  sc에 저장한다. 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("당신의 이름 : ");
		// sc 저장된 내용을 문자열 String으로 만들어서 별도 저장하겠다. (next(), nextLine())
		// 한 글자라도 char 처리는 할 수 없다. 무조건  문자열(String)처리를 해야 된다. 
	       String name = sc.next();    // 띄어쓰기 하면 안됨
	    // String name = sc.nextLine();    // 띄어쓰기 사용 가능
	    System.out.println("당신이 입력한 이름은 "+name+" 입니다.");
	       name = sc.nextLine(); //  nextLine에는 개행문자만 가져감
	    System.out.print("당신의 이름 : ");
	       name = sc.nextLine();
	    System.out.println("당신이 입력한 이름은 "+name+" 입니다.");
	    
	    System.out.print("당신의 나이 : ");
	   // sc 저장된 내용을 int 으로 만들어서 별도 저장하겠다.
	    int age = sc.nextInt();
	    System.out.println("당신이 입력한 나이는  "+age+" 입니다.");
	    
	    System.out.print("당신의 키 : ");
	    // sc 저장된 내용을 double 으로 만들어서 별도 저장하겠다.
	    double height = sc.nextDouble();
	    System.out.println("당신이 입력한 나이는  "+height+" 입니다.");
	    
	    System.out.print("당신의 남성입니까 ?(true/false)");
	    // sc 저장된 내용을 boolean 으로 만들어서 별도 저장하겠다.
	    boolean gender = sc.nextBoolean();
	    
	    if(gender) {
	    	System.out.println("당신의 남성 입니다.");
	    }else {
	    	System.out.println("당신의 여성 입니다.");
	    }
		
	}
}









