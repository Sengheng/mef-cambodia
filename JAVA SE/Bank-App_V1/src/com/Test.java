package com;

import java.util.Scanner;

import com.bank.pojo.Account;
import com.bank.service.CustomerService;
import com.bank.service.CustomerServiceImpl;
import com.bank.service.ManagerService;
import com.bank.service.ManagerServiceImpl;

public class Test {
	static CustomerService custService=new CustomerServiceImpl();

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
	
		while(true) {
			System.out.println("MENU");
			System.out.println("1.With Draw");
			System.out.println("2.Deposit");
			System.out.println("3.OpenAccount");
			System.out.println("4.CloseAccount");
			System.out.println("5.Locker ACcess");
			System.out.println("6.Cash Dispatch");
			System.out.println("7.Exit");
			System.out.println("Enter your Choice: ");
			int ch=sc.nextInt();
			
			
			switch(ch) {
			case 1:
				
				System.out.println("Enter Amount to WithDraw: ");
				int amt=sc.nextInt();
				custService.withDraw(amt);
				break;
			case 2:
				 custService=new CustomerServiceImpl();
				System.out.println("Enter Amount to Deposit: ");
				 amt=sc.nextInt();
				custService.depositAmt(amt);
				break;
			case 3:
				ManagerService managerService=new ManagerServiceImpl();
				managerService.openAccount(new Account());
				break;
				
			case 4:
				 managerService=new ManagerServiceImpl();
				managerService.closeAccount(new Account());
				break;
				
			case 7:
				System.out.println("Thank you. Visit again");
				System.exit(0);
			default:
					System.out.println("Invalid Choice. try again ");
				
			}
			
			
			
		}
		
		
	}

}
