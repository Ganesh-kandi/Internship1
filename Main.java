package in.internship.main;

import java.util.InputMismatchException;
import java.util.Scanner;

import in.internship.core.Bank1;
import in.internship.core.Bank2;
import in.internship.core.BankApp;

public class Main {
	BankApp ca=new Bank1();
	BankApp sa=new Bank2();
	String AccNo;
	String name;
	static Main mb = new Main();
	static Scanner sc=new Scanner(System.in);
	
		public static void main(String[] args) {
//			mb.input();
//			mb.printInstructions();
//			sc.nextLine();
			boolean flag=true;
			while(flag) {
				String option=mb.input();
				boolean temp=true;
				int n=0;
				while(temp) {
					if(option.equalsIgnoreCase("Savings")) {
						System.out.println("Enter your options to perform Savings Banking....");
						try {
							n=sc.nextInt();
						}catch(InputMismatchException e) {
							System.out.println("please enter the 'integer values only..' we are redirecting you to main option..");
							//mb.input();
							flag=true;
							temp=false;
							break;
						}
						switch(n) {
						case 1:
							mb.printInstructions();
							break;
						case 2:
							mb.CurrentBalance(option);
							break;
						case 3:
							mb.AddAccount(option);
							break;
						case 4:
							mb.depositMoney(option);
							break;
						case 5:
							mb.withdrawMoney(option);
							break;
						case 6:
							mb.show(option);
							break;
						case 7:
							mb.deactive(option);
							break;
						case 8:
							temp=false;
							flag=false;
							System.out.println("Application is closed....");
							break;
						}
					
					}
						else if(option.equalsIgnoreCase("Current")) {
						System.out.println("Enter your options to perform Current Banking....");
						try {
							n=sc.nextInt();
							}catch(InputMismatchException e) {
								System.out.println("please enter the 'integer values only..' we are redirecting you to main option..");
								//option=mb.input();
								flag=true;
							}	
						switch(n) {
						case 1:
							mb.printInstructions();
							break;
						case 2:
							mb.CurrentBalance(option);
							break;
						case 3:
							mb.AddAccount(option);
							break;
						case 4:
							mb.depositMoney(option);
							break;
						case 5:
							mb.withdrawMoney(option);
							break;
						case 6:
							mb.show(option);
							break;
						case 7:
							mb.deactive(option);
							break;
						case 8:
							temp=false;
							flag=false;
							System.out.println("Application is closed....");
							break;
						}
				}
					else{
					System.out.println("Please enter the correct Bank type (Savings OR Current) ");
					//option=mb.input();
					flag=true;
					temp=false;
					}
				}
		}
	}
		
		
	public String input() {
		String option=null;
		System.out.print("please enter the Bank type(Savings or Current):\n");
		option=sc.next();
		sc.nextLine();
		return option;
	}
	public void printInstructions() {
		System.out.println(""
				
				+ "Press 1 for show instructions\n"
				+ "press 2 Show current Balance.\n"
				+ "press 3 for Add Account.\n"
				+ "press 4 for Deposit.\n"
				+ "press 5 for Withdraw money.\n"
				+ "press 6 to show accounts\n"
				+ "press 7 to deactive your account.\n"
				+ "press 8 for close the Application.");
		//+ "press Savings or Current Account want to create?\n"
		
	}
	
	public void AddAccount(String a) {
		if(a.equalsIgnoreCase("Savings")) {
			sa.AddAccount();}
		else if(a.equalsIgnoreCase("Current")) {
			ca.AddAccount();
		}
		
		System.out.println("||---------------------------------------------||");
		mb.check();
		
	}
	public void withdrawMoney(String a) {
		if(a.equalsIgnoreCase("Savings")) {
			sa.withdraw();;}
			else if(a.equalsIgnoreCase("Current")) {
				ca.withdraw();;
			}
		System.out.println("||---------------------------------------------||");
		mb.check();
	}
	public void depositMoney(String a) {
		if(a.equalsIgnoreCase("Savings")) {
			sa.deposit();;}
			else if(a.equalsIgnoreCase("Current")) {
				ca.deposit();;
			}
		System.out.println("||---------------------------------------------||");
		mb.check();
	}
	public void CurrentBalance(String a) {
		if(a.equalsIgnoreCase("Savings")) {
			sa.getBalanceinfo();;}
			else if(a.equalsIgnoreCase("Current")) {
				ca.getBalanceinfo();;
			}
		System.out.println("||---------------------------------------------||");
		mb.check();
	}
	public void show(String a) {
		
		if(a.equalsIgnoreCase("Savings")) {
			sa.ListAllAccounts();;}
			else if(a.equalsIgnoreCase("Current")) {
				ca.ListAllAccounts();;
			}
		System.out.println("||---------------------------------------------||");
		mb.check();
	}
	public void deactive(String a) {
		if(a.equalsIgnoreCase("Savings")) {
			sa.deactive();;}
			else if(a.equalsIgnoreCase("Current")) {
				ca.AddAccount();;
			}
		System.out.println("||---------------------------------------------||");
		mb.check();
	}
	
	public void check() {
		System.out.println("If you want to continue the service? Please enter '00'");
		try {
			int next=sc.nextInt();
			if(next==00)
				sc.nextLine();
			else {
				System.out.println("Thank you Have A Good Day..\n \t\t Application is closed....");
				System.exit(0);
			}
		} catch (InputMismatchException e) {
			System.out.println("Input MissMatch..");
			mb.input();
//			System.out.println("Thank you Have A Good Day..\n \t\t Application is closed....");
//			System.exit(0);
			
		}
	}

}
