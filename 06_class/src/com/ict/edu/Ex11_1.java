package com.ict.edu;

public class Ex11_1 {
	// �հ豸�ϱ�
	public int sum(int k1, int k2, int k3) {
		return k1 + k2 + k3 ;
	}
	// ��� ���ϱ�
	public double avg(int k1) {
		return (int)(k1/3.0*10)/10.0;
	}
	// ���� ���ϱ�
    public String hak(double k1) {
    	/*
    	if(k1>=90) {
    		return "A" ;
    	}else if(k1>=80) {
    		return "B" ;
    	}else if(k1>=80) {
    		return "C" ;
    	}else {
    		return "F" ;
    	}
    	*/
    	String res = "";
    	if(k1>=90) {
    		res = "A";
    	}else if(k1>=80) {
    		res = "B";
    	}else if(k1>=80) {
    		res = "C";
    	}else {
    		res = "F";
    	}
    	return res;
    }
	
}
