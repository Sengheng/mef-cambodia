package com;

public class StringBufferDemo {
	
	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer("Abc"); // Mutable
		System.out.println("SB: "+sb);
		System.out.println("HashCode od SB is "+System.identityHashCode(sb));
		sb.append("Xyz");
		
		System.out.println("SB: "+sb);
		System.out.println("HashCode od SB is "+System.identityHashCode(sb));
		
		sb.reverse();
		
		System.out.println("SB: "+sb);
		System.out.println("HashCode od SB is "+System.identityHashCode(sb));
		
		
		
		
	}
	

}
