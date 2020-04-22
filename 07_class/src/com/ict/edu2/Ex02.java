package com.ict.edu2;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Ex01 coffee = new Ex01();
		System.out.println(coffee.getName());
		System.out.println(coffee.getPrice());
		System.out.println(coffee.getSu());
		
		coffee.setName("커피");
		coffee.setPrice(800);
		coffee.setSu(100);
		System.out.println("============");
		
		System.out.println(coffee.getName());
		System.out.println(coffee.getPrice());
		System.out.println(coffee.getSu());
		
		Ex01 ion = new Ex01();
		ion.setName("이온음료");
		ion.setPrice(1500);
		ion.setSu(100);
		
		Ex01 juice = new Ex01();
		juice.setName("과일쥬스");
		juice.setPrice(1000);
		juice.setSu(100);
		
		Ex01 cola = new Ex01();
		cola.setName("콜라");
		cola.setPrice(1200);
		cola.setSu(100);
		System.out.println("============");
		
		Ex01[] arr = {coffee, ion, juice, cola};
		
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









