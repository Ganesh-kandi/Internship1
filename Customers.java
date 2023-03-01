package in.internship.dto;

public class Customers {
	private String Accno;
	private String Name;
	private long Balance;
	
	public Customers(String accno, String name, long balance) {
		Accno = accno;
		Name = name;
		Balance = balance;	
	}

	public String getAccno() {
		return Accno;
	}


	public String getName() {
		return Name;
	}


	public long getBalance() {
		return Balance;
	}

	public void setBalance(long balance) {
		Balance = balance;
	}
	@Override
	public String toString() {
		return getAccno()+" : "+getName()+" = "+getBalance();
	}
}
