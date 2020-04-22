package com.ict.edu4;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

// ObjectOutputStream : ��ü ��� ��Ʈ�� , ����Ʈ ��Ʈ��
// writeObject() => ����ȭ �޼ҵ�
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
			
			// �������� ��ü��  ������  ��Ƽ� ������.
			VO vo1 = new VO("��浿", 35, 84.6, true);
			VO vo2 = new VO("��浿", 15, 54.5, false);
			VO vo3 = new VO("�ڱ浿", 30, 74.7, true);
			VO vo4 = new VO("���浿", 57, 80.0, true);
			
			// �������� ��ü�� �ϳ��� ��Ƽ� �����ϴ� �� : �÷���
			// �÷��� �� �迭 ���·� ������� �÷��ǿ� ���� : Vector, ArrayList
			ArrayList<VO> list = new ArrayList<VO>();
			list.add(vo1);
			list.add(vo2);
			list.add(vo3);
			list.add(vo4);
			
			// ��ü ����ȭ.
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
