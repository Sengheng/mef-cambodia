package com;

import java.io.File;
import java.io.FileReader;

public class ReaderDemo {

	public static void main(String[] args) {
		
		try {
			File fileLoc=new File("d:/myfiles/file1.txt");
			FileReader fr=new FileReader(fileLoc);
			
			for(int i=0;i<fileLoc.length();i++) {
				System.out.print((char)fr.read());
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
