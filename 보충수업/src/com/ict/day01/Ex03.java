package com.ict.day01;

public class Ex03 {
	public static void main(String[] args) {
        // if��
	    // ���� : �ܼ� if��,  if ~ else,  ����if��
		
		// 1. �ܼ� if�� : ���ǽ��� ���϶��� �����ϰ� �����̸� if���� ������
		//    ** ���ǽ���  �񱳿���, ������, boolean�� �� ����
        //    if(���ǽ�) {
		//     ���ǽ� ��(true)�϶��� ����
		//     ���ǽ� ��(true)�϶��� ����
		//    }
		
		   String str = "�ʱⰪ";
		   int sum = 59;
		   if(sum >=60) {
			   str = "�հ�";
		   }
		  System.out.println(str);
		  
	   // 2. if ~ else ~ : ���ǽ��� ���϶� �����϶� ���� ������ �����Ѵ�.
	   //  if(���ǽ�){
	   //      ���ǽ��� ���϶� ; 
	   //  }else{
	   //    ���ǽ��� �����϶� ;
	   //  }  	  
		  
		  str = "�ʱⰪ";
		  sum = 77 ;
		  if(sum % 2 == 0) {
			  str = "¦��" ;
		  }else {
			  str = "Ȧ��";
		  }
		  System.out.println(str);
		  
	   // ���� if : if~ else�� ������ �����ϴ� ��
		   //  if(���ǽ�1){
		   //      ���ǽ�1�� ���϶� ; 
		   //  }else if(���ǽ�2){
		   //    ���ǽ�1�� �����̸鼭 ���ǽ�2�� �� �϶� ;
		   //  }else if(���ǽ�3){
		   //    ���ǽ�1,2�� �����̸鼭 ���ǽ�3�� �� �϶� ;
		   //  }else{
		   //    ���ǽ�1,2,3�� ��� �����϶�(������) ; 
		   //  }
		  
	       str = "�ʱⰪ";
	       sum = 89 ;
	       if (sum>=90) {
			 str = "A";
		  }else if (sum>=80) {
			  str = "B";
		  }else if (sum>=70) {
			  str = "C";
		  }else {
			 str = "F"; 
		  }
	       System.out.println(str);
	       
	   // for�� : ������ ��Ģ�� ���ؼ� �ݺ��ϴ� ��
	   // for (�ʱⰪ; ���ǽ�; ������) {
	   //		�ݺ��ϴ� ���� ;
	   //  }
	   // 1-10
	       for (int i = 1; i < 11; i++) {
			 System.out.println("i = " + i);
		   }
	       System.out.println();
	       
	   //  1- 10���� ¦���� ����
	       for (int i = 1; i < 11; i++) {
			  if( i % 2 == 0) {
				  System.out.println("i = "+ i);
			  }
		   }
	       System.out.println();
	       
	      // 1-10���� Ȧ���� ����
	       for (int i = 1; i < 11; i++) {
				if( i % 2 == 1) {
					  System.out.println("i = "+ i);
			   }
		  }
		  System.out.println(); 
	       
	}
}










