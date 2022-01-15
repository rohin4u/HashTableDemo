package com;

public class Temp {
	
	int i;
	
	public Temp(int i) {
		this.i=i;
	}
	
	public int hashCode() {
		return i%4;
	}
	
	public String toString() {
		
		return i+"";
	}

}
