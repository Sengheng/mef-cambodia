package com;

public class UserDefinedDemo {

	public static void main(String[] args) {

		int age = 17;

		try {
			if (age < 18) {
				// throw new Exception(); // Built in exception
				throw new UnderAgeException();
			}
			System.out.println("-- Welcome ... ");
		} catch (UnderAgeException uae) {
			System.out.println("Failed due to " + uae.myMsg());
		}

		// System.out.println("Failed due to " + e);

	}

}
