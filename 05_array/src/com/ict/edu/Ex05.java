package com.ict.edu;

public class Ex05 {
	public static void main(String[] args) {
		String[] name= {"È«","ÀÌ","±è","¹Ú","°í"};
		int[] kor = {80,90,80,70,100};
		int[] eng = {80,95,85,80,100};
		int[] math = {100,100,100,100,100};
		
		int[] sum = new int[5];
		double[] avg = new double[5];
		String[] hak= new String[5];
		int[] rank = {1, 1, 1, 1, 1};
		
		// ÃÑÁ¡ , Æò±Õ , ÇÐÁ¡
		for (int i = 0; i < rank.length; i++) {
			sum[i] = kor[i] + eng[i] + math[i] ;
			avg[i] = (int)(sum[i]/3.0*10)/10.0 ;
			if(avg[i]>=90) {
				hak[i] = "AÇÐÁ¡";
			}else if(avg[i]>=80) {
				hak[i] = "BÇÐÁ¡";
			}else if(avg[i]>=70) {
				hak[i] = "CÇÐÁ¡";
			}else {
				hak[i] = "FÇÐÁ¡";
			}
		}
		
		// rank
		for (int i = 0; i < rank.length; i++) {
			for (int j = 0; j < rank.length; j++) {
				if(sum[i] < sum[j]) rank[i]++;
			}
		}
		
		// Ãâ·Â
		System.out.println("ÀÌ ¸§\tÃÑ Á¡\tÆò  ±Õ\tÇÐ Á¡\t¼ø À§");
		for (int i = 0; i < rank.length; i++) {
			System.out.print(name[i]+"\t");
			System.out.print(sum[i]+"\t");
			System.out.print(avg[i]+"\t");
			System.out.print(hak[i]+"\t");
			System.out.print(rank[i]+"\n");
		}
	}
}
