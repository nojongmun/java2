package com.ict.edu2;

import java.io.File;
import java.io.FileReader;

// FileInputStream : read():int(아스키코드)=> char형변환, read(byte[] b)
// FileReader : read():int(유니코드)=>char형변환, read(char[] c)
public class Ex03 {
	public static void main(String[] args) {
		String pathname 
		 = "C:"+File.separator+"study"+File.separator+"util"+ File.separator+"test05.txt";
		File file = new File(pathname);
		FileReader fr = null;
		int k =0 ;
		try {
			fr = new FileReader(file);
			
			// 한 글자 읽기
			// k = fr.read();
			// System.out.println(k + ":" + (char)(k));
			
			// 전체 읽기
			/*
			while(true) {
			    k = fr.read();
			    if(k == -1) break;
			    System.out.println(k + ":" + (char)(k));
			}
			*/
			/*
			while((k = fr.read()) != -1) {
				System.out.println(k + ":" + (char)(k));
			}
			*/
			
			// 배열처리
			/*
			char[] c = new char[(int)(file.length())];
			fr.read(c);
			for (char d : c) {
				System.out.print(d);
			}
			System.out.println();
			*/
			
			// String 클래스 사용
			char[] c = new char[(int)(file.length())];
			fr.read(c);
			String msg  = new String(c);
			System.out.println(msg);
		} catch (Exception e) {
		} finally {
			try {
				fr.close();
			} catch (Exception e2) {
			}
		}
	}
}
