package com;

public class UnderAgeException extends RuntimeException{
	
	
	public String toString() {
		// TODO Auto-generated method stub
		return ("Age is not enogh to go....");
	}
	
	String myMsg() {
		return "My Own Message ... Age is not enough";
	}
	

}
