package p1;
import java.util.*;

public class AccountBackend {
	private static final int MIN_BALANCE=5000;
	List<Account> allAccounts = new ArrayList<>();
	
	public Account addAccount(String name,int balance,String location,String ifsc)
	{
		Account a = new Account(name, balance, location,ifsc);
		allAccounts.add(a);
		return a;
	}
	
	public List<Account> getAllRecords()
	{
		return allAccounts;
	}
	
	public Account searchAccount(int searchAccountNumber)
	{
		for (Account account : allAccounts) {
			if(account.getAccountNumber() == searchAccountNumber)
			{
				return account;
			}
		}
		return null;
	}
	
	public Account getAccountByLocation(String searchLocation)
	{
		for(Account account:allAccounts)
		{
			if(account.getLocation().equals( searchLocation))
			{
				return account;
			}
		}
		return null;
	}
	
	public Account getAccountByBalanceRange(int limitBalance)
	{
		for(Account account:allAccounts)
		{
			if(account.getBalance()==limitBalance)
			{
				return account;
			}
		}
		return null;
	}
	public List<Account> SortByAccountNumber()
	{
		List<Account> temp=new ArrayList<>(allAccounts);
		Collections.sort(temp, new SortByAccountNumber());
		return temp;
	}
	
	public List<Account> searchAccountByIfsc(String inputifsc)
	{
		List<Account> temp = new ArrayList<>();
		for(Account account:allAccounts)
		{
			if(account.getIfsc().equals(inputifsc))
			{
				temp.add(account);
			}
			
		}
		return temp;
	}
	
	public List<Account> SortByIfsc()
	{
		List<Account> temp=new ArrayList<>(allAccounts);
		Collections.sort(temp,new SortByIfscCode());
		return temp;
	}
	

}
