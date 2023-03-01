package in.internship.core;

import java.util.ArrayList;
import java.util.Scanner;

import in.internship.dto.Customers;

public class Bank2 implements BankApp{
	ArrayList<Customers> clist=new ArrayList<Customers>();
	ArrayList<Customers> slist=new ArrayList<Customers>();
	static Scanner sc= new Scanner(System.in);
	public Bank2(){}
	public void AddAccount() {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter account number: ");
		String AccNo=sc.next();
		int temp=0;
			for(Customers c:clist) {
				if(c.getAccno().equals(AccNo)) {
					temp++;
				}
			}
			if(temp!=0) 
				System.out.println("Account is already present in database...");
			else {
				System.out.print("Enter your name: ");
				String name=sc.next();
				clist.add(new Customers(AccNo,name,0));
				System.out.println("Your Account is created successfully");
				}
		
	}
		public void getBalanceinfo() {
			Customers abc=null;
			System.out.print("Enter the account number for balance : ");
			String AccNo=sc.next();
				for(Customers c:clist) {
						if(c.getAccno().equals(AccNo)) 
							abc=c;
						}
				if(abc!=null) {
				System.out.println("Your present balance is : "+abc.getBalance());
				}else 
				System.out.println("No account found");
		
			
		}
	public void withdraw() {
		System.out.print("Enter the account number : ");
		String Accno1=sc.next();
		Customers abc=null;
		
		for(Customers c:clist) {
			if(c.getAccno().equals(Accno1)) 
				abc=c;
			}
		if(abc!=null) 
			{
				System.out.print("Enter the withdraw money:");
				long deposit=sc.nextLong();
				if(deposit>abc.getBalance()) 
					System.out.println("Insufficent account balance");
				else{
						System.out.println("Withdrawing....");
						abc.setBalance(abc.getBalance()-deposit);
						System.out.println("your present balance is :"+abc.getBalance());
					}
			}
		else 
			System.out.println("No account found");
	}
	public void deposit() {
		System.out.print("Enter the account number : ");
		String Accno1=sc.next();
		Customers abc=null;
		
		for(Customers c:clist) {
			if(c.getAccno().equals(Accno1)) 
				abc=c;
		}
		if(abc!=null) {
			System.out.print("Enter the deposit money : ");
			long deposit=sc.nextLong();
			System.out.println("Depositing....");
			abc.setBalance(abc.getBalance()+deposit);
			System.out.println("Your present balance is :"+abc.getBalance());
		}else 
			System.out.println("No account found");
		}
		public void ListAllAccounts() {
			clist.stream().forEach(l-> System.out.println(l));
		}
		public void deactive() {
			System.out.print("Enter account number : ");
			String AccNo=sc.next();
			int i=0;
			Customers t=null;
				for(Customers c:clist) {
					if(c.getAccno().equals(AccNo)) {
						i++;
						t=c;
					}
				}
				if(i!=0) {
					clist.remove(clist.indexOf(t));
					System.out.println("Your Account is deactivated successfully");
				}else 
					{
						System.out.println("No account found in database..");
					}
		}
}
