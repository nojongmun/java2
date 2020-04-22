package com.ict.edu;

public class Ex13 {
	public static void main(String[] args) {
	    // String 클래스 : 문자열을 처리하는 클래스
		// String 클래스 생성 방법
		String str1 = "abc";
		System.out.println(str1);
		
		char data[] = {'a', 'b', 'c'};
	    String str2 = new String(data);
	    System.out.println(str2);
	    
		String str3 = new String("abc");
		System.out.println(str3);
		
		// 결과는 '다르다' 라고 나옴 , 그러므로 String은  '==' 사용하면 안된다.
		// String 또는 객체에서  '=='는  '내용이 같냐'가 아니라 '주소가 같냐'라고 물어보는 것임
		if(str1 == str2) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		System.out.println("=================");
		// String 클래스의 주요 메소드
		// 1. charAt(int index) : char
		//   - 반환형 : char  => 결과가 char로 나온다.
		//   - 인자 : (int index) => 정수이며,  index는  위치값, 0부터 시작
		//   - charAt : 위치값을 받아서 해당 위치에 존재하는 문자(char)를 반환한다.
		String msg = "대한민국 @ Korea";
		char c1 = msg.charAt(2);
		System.out.println(c1);
		System.out.println("========1========");
		
		// 2. length() : int
		//   - 해당 문자열의 길이를 반환 한다. 
	  	int n1 = msg.length();
	  	System.out.println(n1);
	  	System.out.println("========2========");
	  	
	  	msg = "대한민국 @ Korea";
	  	// msg를 한글자씩 출력
	  	 msg.charAt(0);  //  => 대
	  	 msg.charAt(1);  //  => 한
	  	 msg.charAt(11); // => a
	  	 
	  	 // 배열의 길이 : length,
	  	 // String의 길이 : length();
	  	 for (int i = 0; i < msg.length(); i++) {
	  		  char k1 = msg.charAt(i) ;
	  		  System.out.println(k1);
		}
	  	System.out.println("=================");
	  	 // msg를 소문자만  출력
	  	 for (int i = 0; i < msg.length(); i++) {
	  		 char k1 = msg.charAt(i); 
	  		 if(k1>='a' && k1<='z') {		  
	  		    System.out.println(k1);
	  		 }
		}
	  	System.out.println("=================");
	  	 // msg를 소문자를 대문자로 변경  출력 (힌트) A = 65,  a = 97 
	  	 // msg를 소문자만  출력
	  	 for (int i = 0; i < msg.length(); i++) {
	  		 char k1 = msg.charAt(i); 
	  		 if(k1>='a' && k1<='z') {		  
	  		    System.out.println((char)(k1-32));
	  		 }else {
	  			System.out.println(k1); 
	  		 }
		}
	  	System.out.println("=================");
	  	
	  	// 3. concat(String str) : String
	  	//  - 해당 문자열에 인자로 들어온 문자열을 추가하여 반환한다.
	  	//  - 문자연결자(+)와 같은 효과
	  	msg = "대한민국";
	  	String msg2 = msg.concat(" KOREA");
	  	System.out.println(msg);
	  	System.out.println(msg2);
	  	String msg3 = msg + " KOREA";
	  	System.out.println(msg3);
	  	System.out.println("=================");
	  	
	  	// 4. contains(CharSequnce s) : boolean
	  	//  - CharSequnce s : String과 같은 의미 , char는 오류 난다.
	  	//  - 해당 문자열에서 인자로 들어온 문자열을 포함하고 있는면 true, 없으면 false
	  	msg = "KOREA @ 대한민국";
	  	boolean b1 = msg.contains("민");  
	  	System.out.println(b1);  // true
	  	b1 = msg.contains("족");  // false
	  	System.out.println(b1);
	  	b1 = msg.contains("REA"); // true
	  	System.out.println(b1);
		b1 = msg.contains("rea"); // false , 대소문자 구별함
	  	System.out.println(b1);
	  	// b1 = msg.contains('K'); 인자가 char이면 오류
	  	System.out.println("=================");
	  	
	  	// 5. equals(String str) : boolean
	  	//   - 해당 문자열과 인자로 들어온 문자열이 같으면 true, 다르면 false, 대소문자 구별함
	  	// 6. equalsIgnoreCase(String str) : boolean
	  	//   - 해당 문자열과 인자로 들어온 문자열이 같으면 true, 다르면 false, 대소문자 구별안함
	  	msg = "korea";
	  	msg2 = "KOREA";
	  	b1 = msg.equals("korea");
	  	System.out.println(b1);     // true
	  	b1 = msg2.equals("korea");
	  	System.out.println(b1);    // false;
	  	b1 = msg2.equalsIgnoreCase("korea");
	  	System.out.println(b1);     // true
	  	b1 = msg2.equalsIgnoreCase("KoReA");
	  	System.out.println(b1);     // true
	  	System.out.println("=================");
	  	
	  	// 7. toLowerCase() : String
	  	//    - 해당 문자열을 소문자로 변경한다.
	  	// 8. toUpperCase() : String
	  	//    - 해당 문자열을 대문자로 변경한다.
	  	msg = "java8 자바8 JavaScript";
	  	msg2 = msg.toLowerCase();
	  	System.out.println(msg2); // java8 자바8 javascript
	  	msg2 = msg.toUpperCase();
	  	System.out.println(msg2); // JAVA8 자바8 JAVASCRIPT
		System.out.println("=================");
		
	  	msg = "korea";
	  	msg2 = "KOREA";
	  	b1 = msg2.equals("korea");
	  	System.out.println(b1);    // false;
	  	
		b1 = msg2.equals("korea".toUpperCase());
	  	System.out.println(b1);    // true;
	  	System.out.println("=================");
	  	
	  	// 9. indexOf(int ch)                 : int
	  	//    - 처음부터 검색해서 인자로 들어온 char 또는 숫자의 위치값을 반환한다.
	  	
	  	//    indexOf(String str)             : int
	  	//    - 처음부터 검색해서 인자로 들어온 문자열의 위치값을 반환한다.
	  	
	  	//    indexOf(int ch, int fromIndex)  : int
	  	//    - 두번째 들어온 인자의 위치부터 검색해서  인자로 들어온 char 또는 숫자의 위치값을 반환한다.
	  	
		//    indexOf(String str, int fromIndex)  : int
        //    - 두번째 들어온 인자의 위치부터 검색해서  인자로 들어온 문자열의 위치값을 반환
	  	//    - 공통 : 검색해서 인자로 들어온 char,숫자,문자열 이 존재하지 않으면 -1 출력
	  	
	  	msg = "java7 java8";
	  	int su1 = msg.indexOf('v');
	  	System.out.println(su1);
	  	
	  	su1 = msg.indexOf(97); // 97 => 'a'
	  	System.out.println(su1);
	  	
	  	su1 = msg.indexOf("a");
	  	System.out.println(su1);
	  	
	  	su1 = msg.indexOf("z"); // 없으면 -1;
	  	System.out.println(su1);
	  	
	  	// 두번째  v를 찾기 위한 방법 ; 첫번째 v를 지나서 검색을 시작하면 된다.
	  	su1 = msg.indexOf('v',3);
	  	System.out.println(su1);
	  	
	  	su1 = msg.indexOf('v',msg.indexOf('v')+1);
	  	System.out.println(su1);
	  	
	  	// 세번째 a를 찾기 :  두번째 a를 지나서 검색을 시작한다.
	  	su1 = msg.indexOf('a', msg.indexOf('a',msg.indexOf('a')+1)+1);
	  	System.out.println(su1);
	  	System.out.println("=================");
	  	
	  	// 10. lastIndexOf(int ch) : int
	  	//     lastIndexOf(String str) : int
	  	//    - 해당 문자열에서 인자로 들어온 숫자,char,String 의 마지막 위치를 찾아준다.
	  	msg = "java7 java8";
	  	su1 = msg.lastIndexOf('a');
	  	System.out.println(su1);
	  	
	  	su1 = msg.lastIndexOf('v');
	  	System.out.println(su1);
	  	System.out.println("=================");
	  	
	  	// 11. isEmpty() : boolean
	  	//  - 해당 문자열이 비어있으면 true, 없으면 false;
	  	msg = "";
	  	b1 = msg.isEmpty();
	  	System.out.println(b1); // true
	  	msg = "java";
	  	b1 = msg.isEmpty();
	  	System.out.println(b1); // false
	  	
	  	// 오류발생
	  	// msg = null;
	  	// b1 = msg.isEmpty();
		System.out.println("=================");
		
	  	// 12. replace(char oldChar, char newChar) : String
	  	//     replace(String oldString, String newString) : String
	  	//    해당 문자열에서 인자로 받은 문자열 변경할때 사용한다.
	  	msg  = "대한민국";
	  	msg2 = msg.replace('민','民');
	  	System.out.println(msg);   // 대한민국
	  	System.out.println(msg2);  // 대한民국
	  	
	  	msg2 = msg.replace("대한민국","KOREA");
	  	System.out.println(msg);   // 대한민국
	  	System.out.println(msg2);  // KOREA
	  	System.out.println("=================");
	  	
	  	// 13. substring(int beginIndex) : String
	  	//     - 해당 문자열에서 인자로 받은 시작위치부터 문자열의 끝까지
	  	
	  	//     substring(int beginIndex, int EndIndex) : String
	  	//     - 해당 문자열에서 인자로 받은 시작위치부터 끝위치까지(끝위치는 포함하지 않음)
	  	
	  	msg = "010-7979-1234";
	  	msg2 = msg.substring(4);
	  	System.out.println(msg2);
	  	
	  	msg2 = msg.substring(4, 8);
	  	System.out.println(msg2);
	  	
	  	msg = "770707-1";
	  	msg2 = msg.substring(7,8);
	  	System.out.println(msg2);
	  	System.out.println("=================");
	  	
	  	// 하나씩 반환하기
	  	for (int i = 0; i < msg.length(); i++) {
	  		msg2 = msg.substring(i,i+1);
	  		System.out.println(msg2);
		}
	  	System.out.println("=================");
	  	
	  	// 14. toString() : String 
	  	//  Object(객체)에서의 toString() : 객체가 가지고 있는 정보나 값들을 문자열로 만들어 리턴하는 메소드
	  	//  String 에서의 toString() : 문자열 자체 반환
	  	msg = "java8";
	  	System.out.println(msg);
	  	System.out.println(msg.toString());
	  	System.out.println("=================");
	  	
        // 15. trim() : String
	  	//   - 해당 문자열의 앞, 뒤, 공백을 제거할때 사용
	  	msg = "  java, JAVA, 자바   ";
	  	msg2 = msg.trim();
	  	System.out.println(msg + ":" +  msg.length());
	  	System.out.println(msg2 + ":" +  msg2.length());
	  	System.out.println("=================");
	  	
	  	// 16. valueOf(기본자료형) : String
	  	//    - 모든 기본 자료형을 String(문자열)으로 변경시킴
	  	boolean bo = true;
	  	char ch = 'b';
	  	int num1 = 34 ;
	  	long num2 = 58L;
	  	float num3 = 3.14f;
	  	double num4 = 471.456;
	  	
	  	System.out.println(String.valueOf(bo));
	  	System.out.println(String.valueOf(ch));
	  	System.out.println(String.valueOf(num1));
	  	System.out.println(String.valueOf(num2));
	  	System.out.println(String.valueOf(num3));
	  	System.out.println(String.valueOf(num4));
		System.out.println("=================");
		System.out.println(String.valueOf(bo)+1);
	  	System.out.println(String.valueOf(ch)+1);
	  	System.out.println(String.valueOf(num1)+1);
	  	System.out.println(String.valueOf(num2)+1);
	  	System.out.println(String.valueOf(num3)+1);
	  	System.out.println(String.valueOf(num4)+1);
	  	System.out.println("=================");
	  	System.out.println(bo+"1");
	  	System.out.println(ch+"1");
	  	System.out.println(num1+"1");
	  	System.out.println(num2+"1");
	  	System.out.println(num3+"1");
	  	System.out.println(num4+"1");
		System.out.println("=================");
		
		// 17. Wrapper class : 각종 자료형 형태로 이루어진 문자를 진짜 자료형으로 변경하는 클래스
		//      원래 의미는 기본자료형을 객체로 만들때 사용하는 클래스 (자동으로 됨)
		
		// **1) boolean형 : Boolean.parseBoolean
		 msg = "true";
		 boolean bo2 = Boolean.parseBoolean(msg);
		 if(bo2) {
			 System.out.println("성공");
		 }else {
			 System.out.println("실패");
		 }
		 System.out.println("=================");
		 
		// **2) int 형 : Integer.parseInt
		 msg = "2457" ;
		 num1  = Integer.parseInt(msg);  
		 System.out.println(msg+10);
		 System.out.println(num1+10);
		 System.out.println("=================");
		 
		// 3) long형 : Long.parseLong
		// msg = "2457L" ; // 오류발생
		 num2 = Long.parseLong(msg);
		 System.out.println(msg+10);
		 System.out.println(num2+10);
		 System.out.println("=================");
		 
		// 4) float 형 : Float.parseFloat
		 msg = "3.142" ;
		 num3 = Float.parseFloat(msg);
		 System.out.println(msg+10);
		 System.out.println(num3+10);
		 System.out.println("=================");
		 
		// **5) double 형 : Double.parseDouble
		 num4 = Double.parseDouble(msg);
		 System.out.println(msg+10);
		 System.out.println(num4+10);
		 System.out.println("=================");
	  	
	   // ** 6) char 형 : String.charAt()
		 msg = "a";
		 // ch = Character.parseCharacter(msg); // 존재하지 않음
		 ch = msg.charAt(0);
		 System.out.println(msg+1);
		 System.out.println(ch+1);
		 System.out.println((char)(ch+1));
		 System.out.println("=================");
		 
	  	// 배열과 관련된것 : getByte(), toCharArray(), split(String regex);
	  	
	  	// 18. getBytes() : byte[]  => byte는 숫자 이므로 char로 형변환해야 된다.
		//   - 해당 문자열을 byte[]로 만들어줌 .(입출력 ,네트워크에서 사용됨)
		//   - byte 자료형이므로  숫자,영문자 대소문자,일부 특수문자만 표시 가능,(아스키코드,127자만 가능)
		// msg = "java";
		 
		 msg = "java 자바 大韓 JAVA 9";
		 byte[] b3 = msg.getBytes();
		 for (int i = 0; i < b3.length; i++) {
			System.out.println(b3[i]+ ":" + (char)(b3[i]));
		}
		System.out.println("=================");
	  	
		// 19. toCharArray() : char[]
		//   - 해당 문장열을 char[]로 만들어 줌.
		//   - char 자료형이므로 모든 문자 가능하다.(유니코드, 전세계모든 문자 가능 :getBytes()과 차이) 
		 // msg = "java";
		 msg = "java 자바 大韓 JAVA 9";
		 char[] c3 = msg.toCharArray();
		 for (int i = 0; i < c3.length; i++) {
			System.out.println(c3[i]);
		}
		 System.out.println("=================");
		
		 // 20. split(String regex) : String[]
		 //     split(String regex, int limit) : String[]
		 //  - 해당문장열을 인자로 받은 문자열 기준으로 나누어서 배열에 넣어준다.
		 //  - regex : 구분자를 뜻한다.
		 //  - limit : 배열의 크기를 지정할 수 있다.
		 
		 msg = "java,jsp,spring, andorid,python";
		 String[] arr = msg.split(",");
		 System.out.println(arr[0]);
		 System.out.println(arr[1]);
		 System.out.println(arr[4]);
		 System.out.println("=========");
		 arr = msg.split(" ");
		 System.out.println(arr[0]);
		 System.out.println(arr[1]);
		 System.out.println("=========");
		 arr = msg.split(",", 1);
		 System.out.println(arr[0]);
		 System.out.println("=========");
		 arr = msg.split(",", 2);
		 System.out.println(arr[0]);
		 System.out.println(arr[1]);
		 System.out.println("=========");
		 arr = msg.split(",", 3);
		 System.out.println(arr[0]);
		 System.out.println(arr[1]);
		 System.out.println(arr[2]);
		 System.out.println("=========");
		 arr = msg.split(",", 6); // 초과하면 안 만들어진다.
		 for (int i = 0; i < arr.length; i++) {
			 System.out.println(arr[i]);
		}
		 System.out.println("=========");
		 // System.out.println(arr[5]); // 초과하면 안 만들어진다.
		 System.out.println("=========");
	}
}











