package com.ict.edu3;

public class Ex03 {
	String name;
	int kor;
	int eng;
	int math;
	int sum;
	double avg;
	String hak;
	int rank = 1;
	
	public Ex03() {}
	public Ex03(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public void setSum() {
		sum = kor + eng +math;
		play();
	}
	
	public void play() {
	   avg = (int)(sum/3.0*10)/10.0 ;
	   if(avg>=90) {
		   hak = "A";
	   }else if(avg>=80) {
		   hak = "B";
	   }else if(avg>=70) {
		   hak = "C";
	   }else {
		   hak = "F";
	   }
	}
}
