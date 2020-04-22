package com.ict.edu;

public class Ex09 {
	
	// µ¡¼À - ¹İÈ¯Çü ÀÖÀ½, ÀÎÀÚ ÀÖÀ½
	public int add(int i, int j) {
	    return i + j;	
	}
	// »¬¼À
	public void sub(int i, int j) {
		System.out.println(i + "-" + j + " = " + (i-j));
	}
	// °ö¼À
	public int mul(int i, int j) {
		return i * j ;
	}
	// ³ª´°¼À
	public void div(int i, int j) {
		if(j==0) {
			System.out.println("0À¸·Î´Â ³ª´­ ¼ö°¡ ¾ø½À´Ï´Ù.");
		}else {
		    System.out.println(i + "/" + j + " = " + (i/j));
		}
	}
	
}
