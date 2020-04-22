package com.ict.edu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

// URL 클래스 : URL(Uniform Resource Locator) : 인터넷에서 접근 가능한 자원의 주소를 말한다.
//           final 클래스이기 때문에 상속안됨, (자식클래스 못 만듬)
public class Ex02 {
	public static void main(String[] args) {
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		String pathname = "c:/study/util/exam.txt";
		File file = new File(pathname);
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			URL url = new URL("https://www.naver.com");
			System.out.println(url.getProtocol());
			System.out.println(url.getPort());
			System.out.println(url.getPath());
			System.out.println(url.getHost());
			System.out.println(url.getUserInfo());
			System.out.println("====================");
			
			is = url.openStream();
			isr = new InputStreamReader(is,"UTF-8");
			br = new BufferedReader(isr);
			/*
			String msg = null;
			while((msg =br.readLine()) != null) {
				System.out.println(msg);
			}
			*/
			String msg = null;
			StringBuffer sb = new StringBuffer();
			while ((msg=br.readLine()) != null) {
				sb = sb.append(msg+"\n");
			}
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			bw.write(sb.toString());
			bw.flush();
			
		} catch (MalformedURLException e) {
		} catch (IOException e) {
		} finally {
			try {
				bw.close();
				fw.close();
				isr.close();
				is.close();
			} catch (Exception e2) {
			}
		}
	}
}
