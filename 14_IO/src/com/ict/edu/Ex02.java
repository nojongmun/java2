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
			  System.out.println("파일 생성 성공");
		  }else {
			  System.out.println("기존에 같은 이름의 파일이 존재, 파일 생성 실패");
		  }
		} catch (IOException e) {
			System.out.println("파일 경로 틀렸음, 파일 실패");
		}
		System.out.println("=======================");
	
		try {
			System.out.println("절대경로 : " +file.getAbsolutePath());
			System.out.println("상대경로 : " +file.getPath());
			System.out.println("정규화경로 : " +file.getCanonicalPath());
			System.out.println("파일이름 : " +file.getName());
			System.out.println("상위디렉토리 : " +file.getParent());
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("=======================");
		
		String pathname2 
			= "C:"+File.separator+"study"+File.separator+"util"+ File.separator+"test01";
	    File file2 = new File(pathname2);
	    boolean res2 = file2.mkdir();
	    if(res2) {
	    	System.out.println("디렉토리 생성 성공");
	    }else {
	    	System.out.println("기존에 같은 이름의 디렉토리이 존재, 디렉토리 생성 실패");
	    }
	    System.out.println("=======================");
	    
	    res2 = file.delete();  // 파일 삭제 
	    if(res2) {
	    	System.out.println("파일 삭제 성공");
	    }else {
	    	System.out.println("파일 삭제 실패");
	    }
	    res2 = file2.delete(); // 디렉토리 삭제
	    if(res2) {
	    	System.out.println("디렉토리 삭제 성공");
	    }else {
	    	System.out.println("디렉토리 삭제 실패");
	    }
	}
}







