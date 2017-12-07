package com;

class Employee {

	public void sendErrorMail(Exception e) {
		// --> template to send mail
	}

}

public class Demo {

	public static void main(String[] args) throws Exception {

		try {
			Class.forName("com.Employee");
		} catch (Exception e) {
			Employee e1 = new Employee();

			e1.sendErrorMail(e);

			e.printStackTrace();
		} finally {
			System.out.println("-- Finally.. always executed");
		}

		// System.out.println("-- Failed due to " + e);

		System.out.println("-- Hello ");

	}

}
