package com;

import java.io.FileOutputStream;

public class OutputDemo {
	
	public static void main(String[] args) {
		
		try {
			
			FileOutputStream fos=new FileOutputStream("d:/myfiles/file.txt");
			
			String msg="This message suppose to be in the file";
			
			fos.write(msg.getBytes());
			
			fos.close();
			
			System.out.println("-- File Operation is completed");
			
			
		} catch (Exception e) {
			System.out.println("---Failed due to "+e);
		}
		
		
		
	}

}
