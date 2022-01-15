package com;

import java.util.Hashtable;

public class HashTest {

	public static void main(String[] args) {
		
		Hashtable h = new Hashtable();
		
		h.put(new Temp(30), "delhi");
		h.put(new Temp(40), "manali");
		h.put(new Temp(35), "kerela");
		h.put(new Temp(15), "khatima");
		h.put(new Temp(26), "chandigarh");
		
		System.out.println(h);
		
		
		
	}

}
