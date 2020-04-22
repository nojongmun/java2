package com.ict.edu;

public class Ex13 {
	public static void main(String[] args) {
	    // String Ŭ���� : ���ڿ��� ó���ϴ� Ŭ����
		// String Ŭ���� ���� ���
		String str1 = "abc";
		System.out.println(str1);
		
		char data[] = {'a', 'b', 'c'};
	    String str2 = new String(data);
	    System.out.println(str2);
	    
		String str3 = new String("abc");
		System.out.println(str3);
		
		// ����� '�ٸ���' ��� ���� , �׷��Ƿ� String��  '==' ����ϸ� �ȵȴ�.
		// String �Ǵ� ��ü����  '=='��  '������ ����'�� �ƴ϶� '�ּҰ� ����'��� ����� ����
		if(str1 == str2) {
			System.out.println("����");
		}else {
			System.out.println("�ٸ���");
		}
		System.out.println("=================");
		// String Ŭ������ �ֿ� �޼ҵ�
		// 1. charAt(int index) : char
		//   - ��ȯ�� : char  => ����� char�� ���´�.
		//   - ���� : (int index) => �����̸�,  index��  ��ġ��, 0���� ����
		//   - charAt : ��ġ���� �޾Ƽ� �ش� ��ġ�� �����ϴ� ����(char)�� ��ȯ�Ѵ�.
		String msg = "���ѹα� @ Korea";
		char c1 = msg.charAt(2);
		System.out.println(c1);
		System.out.println("========1========");
		
		// 2. length() : int
		//   - �ش� ���ڿ��� ���̸� ��ȯ �Ѵ�. 
	  	int n1 = msg.length();
	  	System.out.println(n1);
	  	System.out.println("========2========");
	  	
	  	msg = "���ѹα� @ Korea";
	  	// msg�� �ѱ��ھ� ���
	  	 msg.charAt(0);  //  => ��
	  	 msg.charAt(1);  //  => ��
	  	 msg.charAt(11); // => a
	  	 
	  	 // �迭�� ���� : length,
	  	 // String�� ���� : length();
	  	 for (int i = 0; i < msg.length(); i++) {
	  		  char k1 = msg.charAt(i) ;
	  		  System.out.println(k1);
		}
	  	System.out.println("=================");
	  	 // msg�� �ҹ��ڸ�  ���
	  	 for (int i = 0; i < msg.length(); i++) {
	  		 char k1 = msg.charAt(i); 
	  		 if(k1>='a' && k1<='z') {		  
	  		    System.out.println(k1);
	  		 }
		}
	  	System.out.println("=================");
	  	 // msg�� �ҹ��ڸ� �빮�ڷ� ����  ��� (��Ʈ) A = 65,  a = 97 
	  	 // msg�� �ҹ��ڸ�  ���
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
	  	//  - �ش� ���ڿ��� ���ڷ� ���� ���ڿ��� �߰��Ͽ� ��ȯ�Ѵ�.
	  	//  - ���ڿ�����(+)�� ���� ȿ��
	  	msg = "���ѹα�";
	  	String msg2 = msg.concat(" KOREA");
	  	System.out.println(msg);
	  	System.out.println(msg2);
	  	String msg3 = msg + " KOREA";
	  	System.out.println(msg3);
	  	System.out.println("=================");
	  	
	  	// 4. contains(CharSequnce s) : boolean
	  	//  - CharSequnce s : String�� ���� �ǹ� , char�� ���� ����.
	  	//  - �ش� ���ڿ����� ���ڷ� ���� ���ڿ��� �����ϰ� �ִ¸� true, ������ false
	  	msg = "KOREA @ ���ѹα�";
	  	boolean b1 = msg.contains("��");  
	  	System.out.println(b1);  // true
	  	b1 = msg.contains("��");  // false
	  	System.out.println(b1);
	  	b1 = msg.contains("REA"); // true
	  	System.out.println(b1);
		b1 = msg.contains("rea"); // false , ��ҹ��� ������
	  	System.out.println(b1);
	  	// b1 = msg.contains('K'); ���ڰ� char�̸� ����
	  	System.out.println("=================");
	  	
	  	// 5. equals(String str) : boolean
	  	//   - �ش� ���ڿ��� ���ڷ� ���� ���ڿ��� ������ true, �ٸ��� false, ��ҹ��� ������
	  	// 6. equalsIgnoreCase(String str) : boolean
	  	//   - �ش� ���ڿ��� ���ڷ� ���� ���ڿ��� ������ true, �ٸ��� false, ��ҹ��� ��������
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
	  	//    - �ش� ���ڿ��� �ҹ��ڷ� �����Ѵ�.
	  	// 8. toUpperCase() : String
	  	//    - �ش� ���ڿ��� �빮�ڷ� �����Ѵ�.
	  	msg = "java8 �ڹ�8 JavaScript";
	  	msg2 = msg.toLowerCase();
	  	System.out.println(msg2); // java8 �ڹ�8 javascript
	  	msg2 = msg.toUpperCase();
	  	System.out.println(msg2); // JAVA8 �ڹ�8 JAVASCRIPT
		System.out.println("=================");
		
	  	msg = "korea";
	  	msg2 = "KOREA";
	  	b1 = msg2.equals("korea");
	  	System.out.println(b1);    // false;
	  	
		b1 = msg2.equals("korea".toUpperCase());
	  	System.out.println(b1);    // true;
	  	System.out.println("=================");
	  	
	  	// 9. indexOf(int ch)                 : int
	  	//    - ó������ �˻��ؼ� ���ڷ� ���� char �Ǵ� ������ ��ġ���� ��ȯ�Ѵ�.
	  	
	  	//    indexOf(String str)             : int
	  	//    - ó������ �˻��ؼ� ���ڷ� ���� ���ڿ��� ��ġ���� ��ȯ�Ѵ�.
	  	
	  	//    indexOf(int ch, int fromIndex)  : int
	  	//    - �ι�° ���� ������ ��ġ���� �˻��ؼ�  ���ڷ� ���� char �Ǵ� ������ ��ġ���� ��ȯ�Ѵ�.
	  	
		//    indexOf(String str, int fromIndex)  : int
        //    - �ι�° ���� ������ ��ġ���� �˻��ؼ�  ���ڷ� ���� ���ڿ��� ��ġ���� ��ȯ
	  	//    - ���� : �˻��ؼ� ���ڷ� ���� char,����,���ڿ� �� �������� ������ -1 ���
	  	
	  	msg = "java7 java8";
	  	int su1 = msg.indexOf('v');
	  	System.out.println(su1);
	  	
	  	su1 = msg.indexOf(97); // 97 => 'a'
	  	System.out.println(su1);
	  	
	  	su1 = msg.indexOf("a");
	  	System.out.println(su1);
	  	
	  	su1 = msg.indexOf("z"); // ������ -1;
	  	System.out.println(su1);
	  	
	  	// �ι�°  v�� ã�� ���� ��� ; ù��° v�� ������ �˻��� �����ϸ� �ȴ�.
	  	su1 = msg.indexOf('v',3);
	  	System.out.println(su1);
	  	
	  	su1 = msg.indexOf('v',msg.indexOf('v')+1);
	  	System.out.println(su1);
	  	
	  	// ����° a�� ã�� :  �ι�° a�� ������ �˻��� �����Ѵ�.
	  	su1 = msg.indexOf('a', msg.indexOf('a',msg.indexOf('a')+1)+1);
	  	System.out.println(su1);
	  	System.out.println("=================");
	  	
	  	// 10. lastIndexOf(int ch) : int
	  	//     lastIndexOf(String str) : int
	  	//    - �ش� ���ڿ����� ���ڷ� ���� ����,char,String �� ������ ��ġ�� ã���ش�.
	  	msg = "java7 java8";
	  	su1 = msg.lastIndexOf('a');
	  	System.out.println(su1);
	  	
	  	su1 = msg.lastIndexOf('v');
	  	System.out.println(su1);
	  	System.out.println("=================");
	  	
	  	// 11. isEmpty() : boolean
	  	//  - �ش� ���ڿ��� ��������� true, ������ false;
	  	msg = "";
	  	b1 = msg.isEmpty();
	  	System.out.println(b1); // true
	  	msg = "java";
	  	b1 = msg.isEmpty();
	  	System.out.println(b1); // false
	  	
	  	// �����߻�
	  	// msg = null;
	  	// b1 = msg.isEmpty();
		System.out.println("=================");
		
	  	// 12. replace(char oldChar, char newChar) : String
	  	//     replace(String oldString, String newString) : String
	  	//    �ش� ���ڿ����� ���ڷ� ���� ���ڿ� �����Ҷ� ����Ѵ�.
	  	msg  = "���ѹα�";
	  	msg2 = msg.replace('��','��');
	  	System.out.println(msg);   // ���ѹα�
	  	System.out.println(msg2);  // �����ű�
	  	
	  	msg2 = msg.replace("���ѹα�","KOREA");
	  	System.out.println(msg);   // ���ѹα�
	  	System.out.println(msg2);  // KOREA
	  	System.out.println("=================");
	  	
	  	// 13. substring(int beginIndex) : String
	  	//     - �ش� ���ڿ����� ���ڷ� ���� ������ġ���� ���ڿ��� ������
	  	
	  	//     substring(int beginIndex, int EndIndex) : String
	  	//     - �ش� ���ڿ����� ���ڷ� ���� ������ġ���� ����ġ����(����ġ�� �������� ����)
	  	
	  	msg = "010-7979-1234";
	  	msg2 = msg.substring(4);
	  	System.out.println(msg2);
	  	
	  	msg2 = msg.substring(4, 8);
	  	System.out.println(msg2);
	  	
	  	msg = "770707-1";
	  	msg2 = msg.substring(7,8);
	  	System.out.println(msg2);
	  	System.out.println("=================");
	  	
	  	// �ϳ��� ��ȯ�ϱ�
	  	for (int i = 0; i < msg.length(); i++) {
	  		msg2 = msg.substring(i,i+1);
	  		System.out.println(msg2);
		}
	  	System.out.println("=================");
	  	
	  	// 14. toString() : String 
	  	//  Object(��ü)������ toString() : ��ü�� ������ �ִ� ������ ������ ���ڿ��� ����� �����ϴ� �޼ҵ�
	  	//  String ������ toString() : ���ڿ� ��ü ��ȯ
	  	msg = "java8";
	  	System.out.println(msg);
	  	System.out.println(msg.toString());
	  	System.out.println("=================");
	  	
        // 15. trim() : String
	  	//   - �ش� ���ڿ��� ��, ��, ������ �����Ҷ� ���
	  	msg = "  java, JAVA, �ڹ�   ";
	  	msg2 = msg.trim();
	  	System.out.println(msg + ":" +  msg.length());
	  	System.out.println(msg2 + ":" +  msg2.length());
	  	System.out.println("=================");
	  	
	  	// 16. valueOf(�⺻�ڷ���) : String
	  	//    - ��� �⺻ �ڷ����� String(���ڿ�)���� �����Ŵ
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
		
		// 17. Wrapper class : ���� �ڷ��� ���·� �̷���� ���ڸ� ��¥ �ڷ������� �����ϴ� Ŭ����
		//      ���� �ǹ̴� �⺻�ڷ����� ��ü�� ���鶧 ����ϴ� Ŭ���� (�ڵ����� ��)
		
		// **1) boolean�� : Boolean.parseBoolean
		 msg = "true";
		 boolean bo2 = Boolean.parseBoolean(msg);
		 if(bo2) {
			 System.out.println("����");
		 }else {
			 System.out.println("����");
		 }
		 System.out.println("=================");
		 
		// **2) int �� : Integer.parseInt
		 msg = "2457" ;
		 num1  = Integer.parseInt(msg);  
		 System.out.println(msg+10);
		 System.out.println(num1+10);
		 System.out.println("=================");
		 
		// 3) long�� : Long.parseLong
		// msg = "2457L" ; // �����߻�
		 num2 = Long.parseLong(msg);
		 System.out.println(msg+10);
		 System.out.println(num2+10);
		 System.out.println("=================");
		 
		// 4) float �� : Float.parseFloat
		 msg = "3.142" ;
		 num3 = Float.parseFloat(msg);
		 System.out.println(msg+10);
		 System.out.println(num3+10);
		 System.out.println("=================");
		 
		// **5) double �� : Double.parseDouble
		 num4 = Double.parseDouble(msg);
		 System.out.println(msg+10);
		 System.out.println(num4+10);
		 System.out.println("=================");
	  	
	   // ** 6) char �� : String.charAt()
		 msg = "a";
		 // ch = Character.parseCharacter(msg); // �������� ����
		 ch = msg.charAt(0);
		 System.out.println(msg+1);
		 System.out.println(ch+1);
		 System.out.println((char)(ch+1));
		 System.out.println("=================");
		 
	  	// �迭�� ���õȰ� : getByte(), toCharArray(), split(String regex);
	  	
	  	// 18. getBytes() : byte[]  => byte�� ���� �̹Ƿ� char�� ����ȯ�ؾ� �ȴ�.
		//   - �ش� ���ڿ��� byte[]�� ������� .(����� ,��Ʈ��ũ���� ����)
		//   - byte �ڷ����̹Ƿ�  ����,������ ��ҹ���,�Ϻ� Ư�����ڸ� ǥ�� ����,(�ƽ�Ű�ڵ�,127�ڸ� ����)
		// msg = "java";
		 
		 msg = "java �ڹ� ���� JAVA 9";
		 byte[] b3 = msg.getBytes();
		 for (int i = 0; i < b3.length; i++) {
			System.out.println(b3[i]+ ":" + (char)(b3[i]));
		}
		System.out.println("=================");
	  	
		// 19. toCharArray() : char[]
		//   - �ش� ���忭�� char[]�� ����� ��.
		//   - char �ڷ����̹Ƿ� ��� ���� �����ϴ�.(�����ڵ�, �������� ���� ���� :getBytes()�� ����) 
		 // msg = "java";
		 msg = "java �ڹ� ���� JAVA 9";
		 char[] c3 = msg.toCharArray();
		 for (int i = 0; i < c3.length; i++) {
			System.out.println(c3[i]);
		}
		 System.out.println("=================");
		
		 // 20. split(String regex) : String[]
		 //     split(String regex, int limit) : String[]
		 //  - �ش繮�忭�� ���ڷ� ���� ���ڿ� �������� ����� �迭�� �־��ش�.
		 //  - regex : �����ڸ� ���Ѵ�.
		 //  - limit : �迭�� ũ�⸦ ������ �� �ִ�.
		 
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
		 arr = msg.split(",", 6); // �ʰ��ϸ� �� ���������.
		 for (int i = 0; i < arr.length; i++) {
			 System.out.println(arr[i]);
		}
		 System.out.println("=========");
		 // System.out.println(arr[5]); // �ʰ��ϸ� �� ���������.
		 System.out.println("=========");
	}
}











