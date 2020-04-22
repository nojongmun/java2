package com.ict.edu4;

// �������̽� : ���񽺸� �����ϱ� ���� ����� ���Ѵ�.
//           ���(static final)�� �߻�޼ҵ��� �̷���� �ִ�.
//           �����ڵ� ����.(��ü ������ �ʵ�)
//           �����ϰ� ���߻���� �����ϴ�.
//           '�������̽��� ����' ��� ���� ��ü�� �����ϴ�, ȣȯ�� �����ϴ�. 

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
         
   **Ŭ������ �θ�� ������ �������̽��� ����.      
 */
  
public interface Ex01 {
	// �ڵ����� static final�� ���Ѵ�.
     int su1 = 10 ;
     static int su2 = 20 ;
     final int su3 = 30 ;
     static final int su4 = 40 ;
     /*
     public void play() {
        System.out.println("�Ϲ� �޼ҵ� ��� ����");	 
     }
     */
     public static void play() {
    	 System.out.println("static �޼ҵ� ��� ����");
     }
     // �߻�޼ҵ� ��� ����
     public abstract void play2();
     // abstract�� ������ �ʾƵ� �������̽������� ������ �ƴ�(�߻�Ŭ���������� ����)
     public void sound();
}
