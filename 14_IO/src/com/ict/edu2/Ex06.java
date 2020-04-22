package com.ict.edu2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

// InputStreamReader : 바이트 입력 스크림을 문자 입력 스트림
// InputStream => InputStreamReader => Reader => BufferedReader
// 기계(키보드)를 통해서 입력된 정보를 사람이 편하게 사용하기 위함 
public class Ex06 {
	public static void main(String[] args) {
		// Scanner scan = new Scanner(System.in);
		
		System.out.print("원하는 문자 : ");
		InputStreamReader isr = null;
		BufferedReader br = null;
		try {
			// 키보드를 통해 들어온 정보를 받자(System.in)
		  	isr = new InputStreamReader(System.in);
		  	br = new BufferedReader(isr);
		  	String msg = br.readLine();
		  	System.out.println("스캐너 대신 사용하여 받은 문자 : " + msg);
		} catch (Exception e) {
		} finally {
			try {
				br.close();
				isr.close();
			} catch (Exception e2) {
			}
		}
		
	}
}
