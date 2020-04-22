package com.ict.edu;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex06 {
	public static void main(String[] args) {
		// ��¥ ���� Ŭ���� : Date Ŭ����(deprecate), Calendar Ŭ���� (���� ���)
		// ���� ��ǻ�� �������� ��¥�� �ð��� ���� ����.
		
		Date date = new Date();
		System.out.println(date.toString());
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd   hh:mm:ss");
		System.out.println(sdf.format(date));
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yy-M-dd   hh:mm:ss");
		System.out.println(sdf2.format(date));
		
		System.out.println(date.getYear() +" ��"); // 2019 - 1900 => 119
		System.out.println(date.getMonth()+1 +" ��"); // 0 - 11
		System.out.println(date.getDate() +" ��");
		
		System.out.println(date.getHours() +" ��");
		System.out.println(date.getMinutes() +" ��");
		System.out.println(date.getSeconds() +" ��");
		
		int k = date.getDay(); // 0-6
		if(k==0) {
			System.out.println("�Ͽ���");
		}else if(k==1) {
			System.out.println("������");
		}else if(k==2) {
			System.out.println("ȭ����");
		}else if(k==3) {
			System.out.println("������");
		}else if(k==4) {
			System.out.println("�����");
		}else if(k==5) {
			System.out.println("�ݿ���");
		}else if(k==6) {
			System.out.println("�����");
		}
		
       System.out.println("==============================");
       
       Calendar now = Calendar.getInstance();  // new ���� ������� �ʰ� ��ü ������ �Ѵ�.
       // ��, ��, ��, ��, ��, ȣ�� ��� : get(��������.�ʵ�, Calendar.�ʵ�)
       System.out.println(now.get(Calendar.YEAR) +"��");
       System.out.println(now.get(Calendar.MONTH) + 1 +"��"); // 0-11 
       System.out.println(now.get(Calendar.DATE) +"��");
       System.out.println(now.get(Calendar.DAY_OF_MONTH) +"��");
       System.out.println("=============================");
       System.out.println(now.get(Calendar.HOUR) +"��");        // 12�ð��� (12�� => 0��)
       System.out.println(now.get(Calendar.HOUR_OF_DAY) +"��"); // 24�ð��� (12�� => 12��)
       
       // AM = 0 , PM = 1 ;
       int res = now.get(Calendar.AM_PM);
       if(res == 0) {
    	   System.out.println("AM  " + now.get(Calendar.HOUR) +"��");
       }else {
    	   System.out.println("PM  " + now.get(Calendar.HOUR) +"��");
       }
       
       System.out.println(now.get(Calendar.MINUTE) +"��"); 
       System.out.println(now.get(Calendar.SECOND) +"��");
       
       // ���� (�Ͽ��� (1) ~ ����� (7))
       res = now.get(Calendar.DAY_OF_WEEK);
       switch (res) {
       	  case 1: System.out.println("�Ͽ���"); break;
       	  case 2: System.out.println("������"); break;
       	  case 3: System.out.println("ȭ����"); break;
       	  case 4: System.out.println("������"); break;
       	  case 5: System.out.println("�����"); break;
       	  case 6: System.out.println("�ݿ���"); break;
       	  case 7: System.out.println("�����"); break;
       }
       
	}
}














