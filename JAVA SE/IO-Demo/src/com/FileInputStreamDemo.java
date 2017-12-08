package com;

import java.io.File;
import java.io.FileInputStream;

public class FileInputStreamDemo {

	public static void main(String[] args) {
	
		
		try {
			
			File file=new File("d:/myfiles/file.txt");
			FileInputStream fis=new FileInputStream(file);
			
			long length=file.length();
			
			for(int i=0;i<length;i++) {
				int ch=fis.read();
				System.out.print((char)ch);
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
