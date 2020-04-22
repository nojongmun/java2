package com.ict.edu2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

// FileInputStream : read():int(아스키코드)=> char형변환, read(byte[] b)
// FileReader : read():int(유니코드)=>char형변환, read(char[] c)
// BufferedReader 추가 :  readLine() => 한 줄씩 읽기, 더 이상 읽을 수 없을 때 null;

public class Ex04 {
	public static void main(String[] args) {
		String pathname 
		 = "C:"+File.separator+"study"+File.separator+"util"+ File.separator+"test06.txt";
		File file = new File(pathname);
		FileReader fr = null;
		BufferedReader br = null;
		int k =0 ;
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			
			// 한줄 읽기
			// System.out.println(br.readLine());
			
			// 전체 읽기
			/*
			while(true) {
				String msg = br.readLine();
				if(msg==null) break;
				System.out.println(msg);
			}
			*/
			String msg = "";
			String res = "";
			StringBuilder sb = new StringBuilder();
			while((msg = br.readLine()) != null) {
				// System.out.println(msg);
				// res = res.concat(msg) ;
				sb.append(msg+"\n");
			}
			// System.out.println(res);
			System.out.println(sb.toString());
		} catch (Exception e) {
		} finally {
			try {
				br.close();
				fr.close();
			} catch (Exception e2) {
			}
		}
	}
}
