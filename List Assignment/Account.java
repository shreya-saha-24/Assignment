package p1;

import java.util.Objects;
import java.util.Random;

public class Account {
	
	private int accountNumber;
	private String accountHolderName;
	private int balance;
	private String location;
	private String ifsc;
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Account(String accountHolderName, int balance, String location,String ifsc) {
		super();
		this.accountNumber = new Random().nextInt(5000);;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
		this.location = location;
		this.ifsc=ifsc;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getIfsc() {
		return ifsc;
	}
	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}
	
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", accountHolderName=" + accountHolderName + ", balance="
				+ balance + ", location=" + location + ", ifsc=" + ifsc + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(accountHolderName, accountNumber, balance, location,ifsc);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		return Objects.equals(accountHolderName, other.accountHolderName) && accountNumber == other.accountNumber
				&& balance == other.balance && Objects.equals(location, other.location) && Objects.equals(ifsc, other.ifsc);
	}
	
	

}
