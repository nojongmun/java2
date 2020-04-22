package com.ict.day02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

// 객체 입출력 : ObjectOutputStream, ObjectInputStream
public class Ex10 {
	public static void main(String[] args) {
		File file = new File("c:/study/util/o.txt");
		FileOutputStream fos = null;
		ObjectOutputStream oos = null; 
		
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fos = new FileOutputStream(file);
			oos = new ObjectOutputStream(fos);
			
			// 객체를 만들어서 넣는다.
		    Ex09 t1  =new Ex09();
		    // 객체 직렬화 메소드
		    oos.writeObject(t1);
		    
		    fis = new FileInputStream(file);
		    ois = new ObjectInputStream(fis);
		    
		    // 읽어서 원래 객체로 되돌야 한다.
		                // 객체 역직렬화 메소드       
		    Ex09 t2= (Ex09)ois.readObject();
		    System.out.println(t2.name);
		    System.out.println(t2.age);
		    System.out.println(t2.ki);
		    System.out.println(t2.gender);
		} catch (Exception e) {
		} finally {
			try {
				fos.close();
				oos.close();
			} catch (Exception e2) {
			}
		}
	}
}
