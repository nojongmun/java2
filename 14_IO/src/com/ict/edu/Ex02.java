package com.ict.edu;

import java.io.File;
import java.io.IOException;

public class Ex02 {
	public static void main(String[] args) {
		String pathname = "C:"+File.separator+"study"+File.separator+"util"+ File.separator+"test01.txt";
		File file = new File(pathname);
		try {
		  boolean res = file.createNewFile();
		  if(res) {
			  System.out.println("���� ���� ����");
		  }else {
			  System.out.println("������ ���� �̸��� ������ ����, ���� ���� ����");
		  }
		} catch (IOException e) {
			System.out.println("���� ��� Ʋ����, ���� ����");
		}
		System.out.println("=======================");
	
		try {
			System.out.println("������ : " +file.getAbsolutePath());
			System.out.println("����� : " +file.getPath());
			System.out.println("����ȭ��� : " +file.getCanonicalPath());
			System.out.println("�����̸� : " +file.getName());
			System.out.println("�������丮 : " +file.getParent());
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("=======================");
		
		String pathname2 
			= "C:"+File.separator+"study"+File.separator+"util"+ File.separator+"test01";
	    File file2 = new File(pathname2);
	    boolean res2 = file2.mkdir();
	    if(res2) {
	    	System.out.println("���丮 ���� ����");
	    }else {
	    	System.out.println("������ ���� �̸��� ���丮�� ����, ���丮 ���� ����");
	    }
	    System.out.println("=======================");
	    
	    res2 = file.delete();  // ���� ���� 
	    if(res2) {
	    	System.out.println("���� ���� ����");
	    }else {
	    	System.out.println("���� ���� ����");
	    }
	    res2 = file2.delete(); // ���丮 ����
	    if(res2) {
	    	System.out.println("���丮 ���� ����");
	    }else {
	    	System.out.println("���丮 ���� ����");
	    }
	}
}







