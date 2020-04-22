package com.ict.edu;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// 1. 바이트 스트림 (기계중심) : 모든 처리를 1byte 씩 처리
//    바이트 스트림 대상  : byte로 이루어진 모든 파일 (영상, 소리, 사진 등 모든 파일 가능)
//    최상위 클래스 : InputStream(입력스트림), OutputStream(출력스트림)

//  FileOutputStream 주요 메소드
//  write(int b) : int  =>  아스키 코드(숫자)하나, => 하나의 글자
//                 int b 대신 char를 넣어서 사용 할 수 있다.
//                 아스키 코드(0-9, a-z, A-Z, 일부 특수문자만 가능, 나머지는 출력안됨)
//                 => 한글, 한자 등 비영어권 문자는 표현 안됨
//  write(byte[] b) : int  => 1byte씩 배열에 저장하고, 읽은 수 만큼 반환한다.
//  flush() : write() 후 반드시 해주세요 
//  close() : open 스트림을 닫기 (finally에서 처리하자)

public class Ex04 {
	public static void main(String[] args) {
		String pathname 
		   = "C:"+File.separator+"study"+File.separator+"util"+ File.separator+"test01.txt";
		File file = new File(pathname);
		FileOutputStream out = null;
		try {
			// 덮어쓰기 
			out = new FileOutputStream(file);
			
			// 이어쓰기
			// out = new FileOutputStream(file, true);
			
			// 한 글자 쓰기 
			out.write(65);  // A
			out.flush();
			
			// 아스키 코드 (숫자) 대신에 char 사용
			out.write('J'); 
			out.write('A');
			out.write('V');
			out.write('A');
			out.flush();
			
			// 여러 글자 쓰기
			byte[] b = {'j','a','v','a',13,10,'b','o','y'};
			out.write(b);
			out.flush();
			
			//// write(int b), write(byte[] b) =>  비영어권 사용 불가 /////
			
			// String 클래스 이용 : 비영어권 사용 가능
			String msg ="\nHello\n안녕\n123\n大韓";
			byte[] b2 = msg.getBytes();
			out.write(b2);
			out.flush();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
			   if(out != null) out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}








