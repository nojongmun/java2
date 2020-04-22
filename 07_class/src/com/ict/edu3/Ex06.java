package com.ict.edu3;

import java.util.Scanner;

import com.ict.edu2.Ex01;

public class Ex06 {
	public static void main(String[] args) {
		Ex05 coffee = new Ex05();
		coffee.setName("커피");
		coffee.setPrice(800);
		coffee.setSu(100);
	
		Ex05 ion = new Ex05("이온음료",1500,100);
		Ex05 juice = new Ex05("과일쥬스",1000,100);
		Ex05 cola = new Ex05("콜라",1200,100);
		
		Ex05[] arr = {coffee, ion, juice, cola};
		
       Scanner sc = new Scanner(System.in);
       System.out.print("금액을 투입해 주세요 : ");
       int input = sc.nextInt();
       
       if(input<800) {
    	   System.out.println("금액이 부족합니다.");
       }else {
	       System.out.println("커피\t이온\t과일쥬스\t콜라");
	       for (int i = 0; i < arr.length; i++) {
	    	   if(input >= arr[i].getPrice()) {
	    		   System.out.print("O\t");
	    	   }else {
	    		   System.out.print("X\t");
	    	   }
		   }
    	 
	       System.out.println();
	       System.out.print("선택하세요 : ");
	       String str = sc.next();
	       int output = 0 ;
	       for (int i = 0; i < arr.length; i++) {
			   if(arr[i].getName().equals(str)) {
			       output = input - arr[i].getPrice();
			       arr[i].setSu(arr[i].getSu()+ -1);  
			   }
		  }
	       System.out.println("잔돈 : "+ output);
       }
	}
}
