package com;

public class Use {
	
	public static void main(String[] args) {
		
		
		MyInter mi;
		mi=new C2();
		mi.f1();
		mi.f2();
		
		//System.out.println(mi.MAX_AGE);
		System.out.println(MyInter.MAX_AGE);
		
		// Access fun method from C1 class.  
		C1 c1; // Create a reference variable to C1
		c1=new C2(); // Store C2 object to C1 reference
		c1.fun(); // B y default C1 reference can access all methods from C1 class
		
		
		
		
		 
	}

}
