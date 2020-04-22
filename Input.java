package com.ict.edu4;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import com.ict.edu3.VO;

// ObjectInp[utStream : 객체 입력 스트림, 바이트 스트림
// readObject() => 역직렬화 메소드
public class Input {
	public static void main(String[] args) {
		String pathname
		= "C:"+File.separator+"study"+File.separator+"util"+File.separator+"test10.txt";
		File file = new File(pathname);
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		ObjectInput ois = null;
		try {
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			ois = new ObjectInputStream(bis);
			
			//
		
			
			ArrayList<VO> list = (ArrayList<VO>) ois.readObject();
			for (VO vo : list) {
			System.out.println(vo.getName);
			System.out.println(vo.getAge());
			System.out.println(vo.getWeight());
			System.out.println(vo.isGender());
			}
			
		} catch (Exception e) {
		}try {
			ois.close();
			bis.close();
			fis.close();
			
			// 여러개의 객체를 정보에 담아서 보내자
			VO 
		} catch (Exception e) {
		
		}
	}
}
