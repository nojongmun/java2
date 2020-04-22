package com.ict.edu5;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

// ObjectInputStream : ��ü �Է� ��Ʈ��, ����Ʈ ��Ʈ��
// readObject() => ������ȭ �޼ҵ�
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
			
			// ������ȭ : ����ȭ�� ���� ������� �ǵ����� �� ( ���� �ڷ������ ����� �ȴ�.)
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
