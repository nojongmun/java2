package com.ict.edu2;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Ex01 coffee = new Ex01();
		System.out.println(coffee.getName());
		System.out.println(coffee.getPrice());
		System.out.println(coffee.getSu());
		
		coffee.setName("Ŀ��");
		coffee.setPrice(800);
		coffee.setSu(100);
		System.out.println("============");
		
		System.out.println(coffee.getName());
		System.out.println(coffee.getPrice());
		System.out.println(coffee.getSu());
		
		Ex01 ion = new Ex01();
		ion.setName("�̿�����");
		ion.setPrice(1500);
		ion.setSu(100);
		
		Ex01 juice = new Ex01();
		juice.setName("�����꽺");
		juice.setPrice(1000);
		juice.setSu(100);
		
		Ex01 cola = new Ex01();
		cola.setName("�ݶ�");
		cola.setPrice(1200);
		cola.setSu(100);
		System.out.println("============");
		
		Ex01[] arr = {coffee, ion, juice, cola};
		
       Scanner sc = new Scanner(System.in);
       System.out.print("�ݾ��� ������ �ּ��� : ");
       int input = sc.nextInt();
       
       if(input<800) {
    	   System.out.println("�ݾ��� �����մϴ�.");
       }else {
	       System.out.println("Ŀ��\t�̿�\t�����꽺\t�ݶ�");
	       for (int i = 0; i < arr.length; i++) {
	    	   if(input >= arr[i].getPrice()) {
	    		   System.out.print("O\t");
	    	   }else {
	    		   System.out.print("X\t");
	    	   }
		   }
	       System.out.println();
	       System.out.print("�����ϼ��� : ");
	       String str = sc.next();
	       int output = 0 ;
	       for (int i = 0; i < arr.length; i++) {
			   if(arr[i].getName().equals(str)) {
			       output = input - arr[i].getPrice();
			       arr[i].setSu(arr[i].getSu()+ -1);  
			   }
		  }
	       System.out.println("�ܵ� : "+ output);
       }
	}
}









