package com.ict.edu5;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

// ObjectInputStream : 객체 입력 스트림, 바이트 스트림
// readObject() => 역직렬화 메소드
public class Input {
	public static void main(String[] args) {
		String pathname 
		 = "C:"+File.separator+"study"+File.separator+"util"+ File.separator+"test11.txt";
		File file = new File(pathname);
		
        FileInputStream fis = null;
        BufferedInputStream bis = null;
        ObjectInputStream ois = null;
		try {
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			ois = new ObjectInputStream(bis);
			
			// 역직렬화 : 직렬화를 원래 정보대로 되돌리는 것 ( 원래 자료형대로 맞춰야 된다.)
			ArrayList<VO> list = (ArrayList<VO>) ois.readObject();
		    for (VO vo : list) {
				System.out.println(vo.getName());
				System.out.println(vo.getAge());
				System.out.println(vo.getWeight());
				System.out.println(vo.isGender());
				System.out.println("==================");
			}
			
		} catch (Exception e) {
		} try {
			ois.close();
			bis.close();
			fis.close();
		} catch (Exception e) {
		}
	}
}
