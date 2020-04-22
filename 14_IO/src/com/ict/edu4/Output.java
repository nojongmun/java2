package com.ict.edu4;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

// ObjectOutputStream : 객체 출력 스트림 , 바이트 스트림
// writeObject() => 직렬화 메소드
public class Output {
	public static void main(String[] args) {
		String pathname 
		 = "C:"+File.separator+"study"+File.separator+"util"+ File.separator+"test10.txt";
		File file = new File(pathname);
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			oos = new ObjectOutputStream(bos);
			
			// 여러개의 객체를  정보에  담아서 보내자.
			VO vo1 = new VO("고길동", 35, 84.6, true);
			VO vo2 = new VO("김길동", 15, 54.5, false);
			VO vo3 = new VO("박길동", 30, 74.7, true);
			VO vo4 = new VO("오길동", 57, 80.0, true);
			
			// 여러개의 객체를 하나로 모아서 관리하는 것 : 컬렉션
			// 컬렉션 중 배열 형태로 만들어진 컬렉션에 담자 : Vector, ArrayList
			ArrayList<VO> list = new ArrayList<VO>();
			list.add(vo1);
			list.add(vo2);
			list.add(vo3);
			list.add(vo4);
			
			// 객체 직렬화.
			oos.writeObject(list);
			oos.flush();
		} catch (Exception e) {
		} finally {
			try {
				oos.close();
				bos.close();
				fos.close();
			} catch (Exception e2) {
			}
		}
	}
}
