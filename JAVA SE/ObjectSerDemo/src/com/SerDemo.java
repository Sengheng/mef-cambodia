package com;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerDemo {

	public static void main(String[] args) {
		
		
		Employee emp=new Employee();
		
		emp.setEmpId(10);
		emp.setEmpName("Ozvitha");
		emp.setSalary(348349);
		emp.setInfo("This employee is the best");
		
		// write emp obj to the file.
		
		try {
			
			FileOutputStream fos=new FileOutputStream("d:/myfiles/emp.txt");
			
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			
			oos.writeObject(emp);
			
			oos.close();
			fos.close();
			
			System.out.println("--- Done ");
			
			
			
		} catch (Exception e) {
			System.out.println("Faile due to "+e);
		}
		
		
		
		

	}

}
