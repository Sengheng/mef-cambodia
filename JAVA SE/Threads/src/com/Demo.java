package com;

public class Demo extends Thread {

	@Override
	public void run() {
		f1();
		f2();
	}

	void f1() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("I = " + i);
		}
	}

	void f2() {
		for (int j = 1; j <= 5; j++) {
			System.out.println("J = " + j);
		}
	}

	public static void main(String[] args) {

		
		  Demo d=new Demo(); 
		  
		  
		  Thread t1=new Thread(d);
		  t1.start();// starts the thread--> invokes run method 
		  
		  
		 

	}

}
