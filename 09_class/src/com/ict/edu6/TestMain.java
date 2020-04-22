package com.ict.edu6;

public class TestMain {
	public static void main(String[] args) {
		
		
		Protoss p = new Protoss("질럿");
		Zerg  z = new Zerg("저글링");
		
	    int sele = 1 ;
	    switch (sele) {
			case 1:  p.decEnergy(); break;
			case 2:  z.decEnergy(); break;
		}
	    System.out.println(p.name +":" + p.energy);
	    System.out.println(z.name +":" + z.energy);
	}
}
