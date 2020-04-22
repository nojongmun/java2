package com.ict.edu;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

public class Ex03 {
	public static void main(String[] args) {
		BufferedReader br  = null;
		try {
			URL url = new URL("https://www.naver.com");
			URLConnection conn = url.openConnection();
			br = new BufferedReader(new InputStreamReader(conn.getInputStream(),"utf-8"));
			System.out.println("인코딩 :" + conn.getContentEncoding());
			System.out.println("길이 :" + conn.getContentLength());
			System.out.println("문서 타입 :" + conn.getContentType());
			System.out.println("=================");
			
			// 인터넷 정보는 헤더와 바디로 나눠진다.
			// 헤더 정보를 이용해서 웹 브라우저가 해석하고 실행한다.
			Map<String, List<String>> list = conn.getHeaderFields();
			for (String k : list.keySet()) {
				System.out.println(list.get(k));
			}
		} catch (Exception e) {
		} finally {
			try {
				br.close();
			} catch (Exception e2) {
			}
		}
	}
}
