package com.ict.edu;

import java.io.File;

// File 클래스 : 특정위치에 존재한는 파일이나 디렉토리(폴더)를 처리하는 클래스
// 주요 생성자 : File(String 경로), File(String 상위경로, String 하위경로)
//           File(File 상위경로, String 하위경로)
// 주요메소드 : 
//  - createNewFile() : 파일 생성하면 true,
//  - mkdir(), mkdirs() :  디렉토리 생성하면 true, 
//  - delete() : 파일, 폴더 삭제
//  - isFile() : 파일이면 true, 
//  - isDirectory() : 디렉토리이면 true,
//  - length() : 길이가 아니라 파일의 크기를 byte로 반환
//  - list() : 특정위치의 내용을 String[]로 만들어서 반환
//  - getAbsolutePath() : 절대주소,
//  - getCanonicalPath() : 정규화주소
//  - getPath() : 상대주소
public class Ex01 {
	public static void main(String[] args) {
		// String pathname = "C:\\study\\util";
		// String pathname = "C:/study/util";
		// 운영체제와 상관없이 사용가능하는 것
		String pathname = "C:"+File.separator+"study"+File.separator+"util";
		File file = new File(pathname);
		String[] list = file.list();
		for (String k : list) {
			// System.out.println(k);
			File file2 = new File(pathname, k);
			
			// System.out.println(file2);
			if(file2.isDirectory()) {
				// 디렉토리는 크기가 없음
				System.out.println("디렉토리 : " + file2);
			}else {
				System.out.println("파일 : " + file2 + ",  크기 : "+file2.length()+"byte");
			}
		}
	}
}





