package com;

class Person{	
}


public class Demo <E1,E2> {
	
	
	void draw(E1 e1,E2 e2) {
		System.out.println("-- Drawing  "+e1+" and e2 is "+e2);
	}
	
	public static void main(String[] args) {
		
		Demo<Object,Object> d=new Demo<>();
		
		d.draw(100,100);
		d.draw(100.65F,100);
		d.draw(100.344,5353);
		d.draw('A',"SBC");
		d.draw("Java",93);
		d.draw(new Person(), 100l);
		
		
		
		
	}

}
