package com.ict.edu6;

public class TestMain {
	public static void main(String[] args) {
		
		
		Protoss p = new Protoss("����");
		Zerg  z = new Zerg("���۸�");
		
	    int sele = 1 ;
	    switch (sele) {
			case 1:  p.decEnergy(); break;
			case 2:  z.decEnergy(); break;
		}
	    System.out.println(p.name +":" + p.energy);
	    System.out.println(z.name +":" + z.energy);
	}
}
