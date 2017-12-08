package com;

import java.io.FileWriter;

public class WriterDemo {
	public static void main(String[] args) {
		
		try {
			
			FileWriter fw=new FileWriter("d:/myfiles/file1.txt");
			String msg="This is writing from Character type streams";
			fw.write(msg);
			fw.close();
			System.out.println("---- Done");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
	}
}
