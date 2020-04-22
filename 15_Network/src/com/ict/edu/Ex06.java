package com.ict.edu;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

// 파싱 ; 내용을 원하는 형태로 분해하는 과정
public class Ex06 {
	public static void main(String[] args) {
		  BufferedReader br = null;
		try {
		   // 공공데이터 제공하는 사이트 : https://www.data.go.kr
		   URL url = new URL("http://openapi.seoul.go.kr:8088/sample/json/SeoulLibraryTime/1/5/");
		   URLConnection conn = url.openConnection();
		   br = new BufferedReader(new InputStreamReader(conn.getInputStream(),"UTF-8"));

		   String msg = br.readLine();
		   System.out.println(msg);
		   System.out.println("=============");
		   
		   // 파일을 읽기
		   JSONParser jsonParse = new JSONParser();
		   JSONObject jObject1 = (JSONObject)jsonParse.parse(msg);
		   JSONObject jObject2 =  (JSONObject) jObject1.get("SeoulLibraryTime");
		   JSONArray jsonArray = (JSONArray) jObject2.get("row");
		    
		   StringBuffer sb2 = new StringBuffer();
		   for (int i = 0; i < jsonArray.size(); i++) {
			  	sb2.append(jsonArray.get(i)+"\n");
			}
		    System.out.println(sb2.toString());
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				br.close();
			} catch (Exception e2) {
			}
		}
	}
}
