package com.ict.edu3;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

// ObjectInputStream : ��ü �Է� ��Ʈ��, ����Ʈ ��Ʈ��
// readObject() => ������ȭ �޼ҵ�
public class Input {
	public static void main(String[] args) {
		String pathname 
		 = "C:"+File.separator+"study"+File.separator+"util"+ File.separator+"test09.txt";
		File file = new File(pathname);
		
        FileInputStream fis = null;
        BufferedInputStream bis = null;
        ObjectInputStream ois = null;
		try {
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			ois = new ObjectInputStream(bis);
			
			// ������ȭ : ����ȭ�� ���� ������� �ǵ����� �� ( ���� �ڷ������ ����� �ȴ�.)
			VO vo = (VO) ois.readObject();
			System.out.println(vo.getName());
			System.out.println(vo.getAge());
			System.out.println(vo.getWeight());
			System.out.println(vo.isGender());
		} catch (Exception e) {
		} try {
			ois.close();
			bis.close();
			fis.close();
		} catch (Exception e) {
		}
	}
}