package com.ict.edu;

public class Ex01 {
	public static void main(String[] args) {
		// �ܼ� if�� : ���ǽ��� ���϶��� ����, �����̸� if�� ����
		// ���ǽ� : boolean, �񱳿���, ������
		// ���� : if(���ǽ�){
		//       ���ǽ� ���� �� ������ ����;
		//       ���ǽ� ���� �� ������ ����;
		//      }
		// ��, ������ ������ �����̸� { } ��������
		
		//  int k1�� 60�̻� �̸� �հ�,
		 int k1 = 50;
		 String str = "�ʱⰪ";
		 if(k1 >= 60) {
			 str = "�հ�";
		 }
		 System.out.println("��� : " +str);
	  	 
		//  int k1�� 60�̻� �̸� �հ�, �ƴϸ� ���հ�
		 k1 = 50;
		 str = "���հ�";
		 if(k1 >= 60) {
			 str = "�հ�";
		 }
		 System.out.println("��� : " +str); 
		 
		 // int k2�� Ȧ������ ¦�� ���� �Ǻ�����
		  int k2 = 142;
		  str = "Ȧ��";
		  if(k2%2==0) {
			  str = "¦��";
		  }
		  System.out.println("��� : " +str); 
		  
		 // char k3�� �빮������, �빮�ڰ� �ƴ��� �Ǻ�����
		  char k3 ='T';
		  str = "�빮�� �ƴ�";
		  if(k3>='A' && k3<='Z') {
			  str = "�빮��";
		  }
		  System.out.println("��� : " +str);
		  
		 // int k4��  1 �Ǵ� 3 �̸� ����, �ƴϸ� ���� ���� �Ǻ�����
		 int k4 = 2;
		 str = "����" ;
		 if(k4 == 1 || k4 == 3) {
			 str = "����";
		 }
		 System.out.println("��� : " +str);
		 
		 // �μ� �� ū���� ����Ͻÿ�
		   int k5 = 10 ;
		   int k6 = 15 ;
		   int max = k6 ;
		   if(k5 > k6) {
			 max = k5 ;   
		   }
		   System.out.println("��� : " +max);  
		   
		   boolean isKorean = true ;
		   if(isKorean) {
			   System.out.println("�ѱ���� �Դϴ�.");
		   }
		   
		   if(isKorean == true) {
			   System.out.println("�ѱ���� �Դϴ�.");
		   }
	}
}






