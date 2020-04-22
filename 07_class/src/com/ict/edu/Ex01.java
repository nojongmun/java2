package com.ict.edu;

public class Ex01 {
	public static void main(String[] args) {
		String[][] arr = new String[5][8];
		String[] p1 = {"홍길동","90","90","90","270","90.0","A","1"};
		String[] p2 = {"고길동","70","70","70","210","70.0","C","1"};
		String[] p3 = {"이길동","95","95","95","285","95.0","A","1"};
		String[] p4 = {"박길동","80","80","80","240","80.0","B","1"};
		String[] p5 = {"김길동","85","85","85","255","85.0","B","1"};
		
		arr[0] = p1 ;
		arr[1] = p2 ;
		arr[2] = p3 ;
		arr[3] = p4 ;
		arr[4] = p5 ;
		
		// 문자열 => 숫자  : Integer.parseInt(),  Double.parseDouble()  
		// 숫자 => 문자열  : String.valueOf(int), String.valueOf(double)
		
		// 순위 구하기 : // 총점으로 비교하자.
		//  1) 모든 사람이 1등 이다. 2) 나(i)보다 남(j)이 크면 내 등수 증가 시킨다. 
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(Integer.parseInt(arr[i][4]) < Integer.parseInt(arr[j][4])) {
					int k = Integer.parseInt(arr[i][7]);
					 arr[i][7] = String.valueOf(k+1);
				}
			}
		}
		// 정렬 (오름차순) :  < (오름차순)
		// 임시저장 : 
		String[] tmp = new String[8];
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(Integer.parseInt(arr[i][4]) < Integer.parseInt(arr[j][4])) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		// 출력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
