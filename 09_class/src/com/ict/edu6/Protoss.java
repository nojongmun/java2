package com.ict.edu6;

public class Protoss implements Unit{
    String name ;
    int energy ;
	public Protoss(String name) {
		this.name = name;
		energy = 200 ;
	}
	@Override
	public void decEnergy() {
		this.energy = this.energy - 5 ;
	}
}
