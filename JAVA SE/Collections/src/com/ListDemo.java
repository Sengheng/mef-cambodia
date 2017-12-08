package com;

import java.util.LinkedList;

public class ListDemo {

	public static void main(String[] args) {
		
		LinkedList<Object> arr = new LinkedList<>();

		arr.add(100);
		arr.add(76.34);
		arr.add('A');
		arr.add(100);
		arr.add("Praveen");
		
		System.out.println(arr);
		System.out.println(arr.get(1));
	
	}
	
	

}
