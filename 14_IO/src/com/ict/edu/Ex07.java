package com.ict.edu;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

// 스트림의 종류 : 바이트 스트림, 문자스트림, 바이트스트림-문자스트림 결합, 오브젝트 스트림
// 1. 바이트 스트림 (기계중심) : 모든 처리를 1byte 씩 처리
//    바이트 스트림 대상  : byte로 이루어진 모든 파일 (영상, 소리, 사진 등 모든 파일 가능)
//    최상위 클래스 : InputStream(입력스트림), OutputStream(출력스트림)

//  FileInputStream 주요 메소드
//  read() : int => 아스키코드(숫자) 하나 반환(한 글자 읽어오는 메소드)
//                  더 이상 읽을 수 없을 때 -1 
//                  아스키코드 이기 때문에 숫자, 소문자, 대문자, 일부특수문자만 읽기 가능
//                  아스키코드 이기 때문에 문자로 보기 위해서는 char 형변환 해야 된다.

//  read(byte[] b) : int => 1byte씩 배열에 저장하고, 읽는 수 만큼 반환한다.
//                  ** 크기지정 해야 된다.
//  close() : 입력 스트림 닫기

// 추가) BufferedInputStream : 입력 스트림 지연를 방지하기 위해서 기본적으로 사용하는 클래스
//      BufferedInputStream는  혼자서는 사용 할 수 없음. (InputStream과 함께 사용) 
public class Ex07 {
	public static void main(String[] args) {
		String pathname 
		 = "C:"+File.separator+"study"+File.separator+"util"+ File.separator+"test01.txt";
		File file = new File(pathname);
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		try {
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			int k = 0 ;
			/*
			while ((k=bis.read()) != -1) {
				 System.out.println(k+ ":" + (char)(k));
			}
			System.out.println("=================");
			*/
			
			//  배열의 크기는 파일의 크기 만큼으로 지정
			byte[] b = new byte[(byte)(file.length())] ;
			// 내용이 byte[] b 에 저장된다.
			bis.read(b);
			for (byte c : b) {
				System.out.println(c + ":" + (char)(c));
			}
			System.out.println("==================");
			
			// String 클래스를 이용하면 비영어권 문자 표시 된다.
			String msg = new String(b);
			System.out.println(msg);
		} catch (Exception e) {
		} finally {
			try {
				if(bis != null) bis.close();
				if(fis != null) fis.close();
			} catch (Exception e2) {
			}
		}
		
	}
}












