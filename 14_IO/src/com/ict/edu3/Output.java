package com.ict.edu3;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

// ObjectOutputStream : ��ü ��� ��Ʈ�� , ����Ʈ ��Ʈ��
// writeObject() => ����ȭ �޼ҵ�
public class Output {
	public static void main(String[] args) {
		String pathname 
		 = "C:"+File.separator+"study"+File.separator+"util"+ File.separator+"test09.txt";
		File file = new File(pathname);
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			oos = new ObjectOutputStream(bos);
			
			// �ϳ��� ��ü�� ������ ��Ƽ� ������.
			VO vo = new VO("��浿", 35, 84.7, true);
			
			// ��ü ����ȭ.
			oos.writeObject(vo);
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
