package com;

import java.net.StandardSocketOptions;

public class Demo1 extends Thread {

	@Override
	public void run() {
		f1();
		
	}

	void f1() {
		
		String tname=Thread.currentThread().getName();
		
		if(tname.equals("Second-Thread")) {
			try {
				System.out.println(tname +" is sleeping for 3 sec" );
				Thread.sleep(3000);
				System.out.println(tname +" is resumed from the sleep and continuing");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
		for (int i = 1; i <= 5; i++) {
			System.out.println("I = " + i +" By "+tname);
		}
	}

	


	public static void main(String[] args) {

		
		  Demo1 d=new Demo1(); 
		  
		  
		  Thread t1=new Thread(d);
		  Thread t2=new Thread(d);
		  
		  
		  t1.setPriority(MAX_PRIORITY);
		  t2.setPriority(MIN_PRIORITY);
		  
		  t1.setName("First-Thread");
		  t2.setName("Second-Thread");
		  
		  t1.start();// starts the thread--> invokes run method 
		  t2.start();
		  
		 

	}

}
