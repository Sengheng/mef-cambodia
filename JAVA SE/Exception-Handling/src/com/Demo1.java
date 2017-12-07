package com;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Demo1 {

	public static void main(String[] args) {

		boolean status=true;
		while(status==true) {
		
		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);

			System.out.println("Enter a Number: ");
			int x = Integer.parseInt(br.readLine());
			System.out.println("Number is " + x);
				status = false;

		} catch (Exception e) {
			System.out.println("Invalid Input.try again.");
		}
		}// while end
		
		System.out.println("-- Done --");
	}

}
