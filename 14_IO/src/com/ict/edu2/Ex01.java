package com.ict.edu2;

import java.io.File;
import java.io.FileWriter;

// 2. 문자 스트림 (사람중심) : 모든 처리를 2byte씩 처리 
//   문자 스트림의 대상 : 세계 모든 언어로 구성된 문서 파일을 입출력할 때 적합
//   최상위 클래스 : Reader(입력스트림), Writer(출력스트림)

// FileOutputStream : 1byte씩처리, write(아스키코드), write(byte[] b),  
// FileWriter : 2byte씩처리, write(String str)
public class Ex01 {
	public static void main(String[] args) {
		String pathname 
		 = "C:"+File.separator+"study"+File.separator+"util"+ File.separator+"test05.txt";
		File file = new File(pathname);
		FileWriter fw = null;
		try {
			fw = new FileWriter(file);
			
			fw.write("123456\n");
			fw.write("Hello~~\n");
			fw.write("대한민국");
			fw.write("true");
			fw.write("大韓");
			fw.flush();
		} catch (Exception e) {
		} finally {
			try {
				fw.close();
			} catch (Exception e2) {
			}
		}
	}
}
