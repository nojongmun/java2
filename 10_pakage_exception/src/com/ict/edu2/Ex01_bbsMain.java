package com.ict.edu2;

import com.ict.edu1.BBS;
import com.ict.edu1.MySite;

public class Ex01_bbsMain  {
	public static void main(String[] args) {
		// static
		BBS.setCategory("�����Խ���");
		
		BBS bb1 = new BBS(1, "ù��° �� ����", "2019-11-28");
		BBS bb2 = new BBS(2, "�ι�° �� ����", "2019-11-28");
		BBS bb3 = new BBS(3, "����° �� ����", "2019-11-28");
		
		System.out.println(bb1.prn());
		System.out.println(bb2.prn());
		System.out.println(bb3.prn());
		System.out.println("--------------");
		
		BBS.setCategory("��������");
		System.out.println(bb1.prn());
		System.out.println(bb2.prn());
		System.out.println(bb3.prn());
		
		System.out.println("--------------");
		
		bb1.prn2();
		
		System.out.println(bb1.site1);
		System.out.println(bb1.site4);
		
	}
}
