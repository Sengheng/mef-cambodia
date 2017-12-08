package com;

import java.util.TreeMap;

public class MapDemo {
	
	public static void main(String[] args) {
		
		TreeMap<Object, Object> hm=new TreeMap<>();
		hm.put(110, "Praveen");
		hm.put(112, "James");
		hm.put(12, "Bucky");
		hm.put(20, "Praveen");
		hm.put(30, "Robert");
		
		System.out.println(hm);
		
		System.out.println(hm.get(30));
		
		
		
	}

}
