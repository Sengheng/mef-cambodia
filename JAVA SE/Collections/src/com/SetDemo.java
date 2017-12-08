package com;

import java.util.LinkedHashSet;

public class SetDemo {

	public static void main(String[] args) {
		
	LinkedHashSet<Object> hs=new LinkedHashSet<>();
		
		hs.add("Praveen");
		hs.add(393);
		hs.add("James");
		hs.add("Kavya");
		
		hs.add("Praveen");
		hs.add("Robert");
		hs.add("Apple");
		
		
		System.out.println(hs);
		
	/*	for(Object obj:hs) {
			if(obj.equals("Praveen"))
			System.out.println(obj);
		}*/

	}

}
