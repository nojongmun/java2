package com.ict.edu1;

import com.ict.edu2.MySite2;

// �Խ���
public class BBS extends MySite2{
	// ��ü �Խù��� ��
	private static int count = 0 ;
	// �Խù��� �з�
	private static String category;
	// �۹�ȣ
	private int num;
	// �� ����
	private String title;
	// �ۼ��Ͻ�
	private String regDate;
	
	public BBS(int num, String title, String regDate) {
		this.num = num;
		this.title = title;
		this.regDate = regDate;
		count++;
	}

	public String prn() {
       return "�� �з� = " + category+", ��ü �� �� = "+ count+ 
    		   ", BBS [num= "+num+", title=" + title+", regDate=" +regDate + "]";
	}
	
	public void prn2() {
		// �θ�Ŭ������ �ٸ� ��Ű���� �����Ҷ� 
		// protected�� ���� �� �� �ִ�.
		System.out.println(site1);
		// defeault��  ���� �ü� ����. 
		// System.out.println(site2);
		// private ���� �ü� ����.
		// System.out.println(site3);
		// public ������ �� �ִ�.
		System.out.println(site4);
	}
	
	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		BBS.count = count;
	}

	public static String getCategory() {
		return category;
	}

	public static void setCategory(String category) {
		BBS.category = category;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	
}
