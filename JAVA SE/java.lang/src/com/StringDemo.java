package com;

public class StringDemo {
	
	public static void main(String[] args) {
		
		String s1="Abc";
		System.out.println("S1: "+s1);
		System.out.println("HashCode of S1: "+System.identityHashCode(s1));
		String s2=new String("Abc");
		System.out.println("S2: "+s2);
		System.out.println("HashCode of S2: "+System.identityHashCode(s2));
		
		// == always compares only hash codes of objects. Not content
		// equals method verify only content of objects. Not hashcodes
		if(s1.equals(s2)) {
			System.out.println("Equal");
		}
		else {
			System.out.println("Not Equal");
		}
			
		
		
		
		
	}

}
