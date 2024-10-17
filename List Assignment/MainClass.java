package p1;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class MainClass {

		AccountBackend backend = new AccountBackend();
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		
		
		public MainClass() {
			
			backend.addAccount("Dolan",3000, "Noida SEZ","SBIN000011");
			backend.addAccount("Shreya",2000, "Delhi","HDFC000786");
			backend.addAccount("Ritika",4000, "Banglore","CBIN99999");
			backend.addAccount("User1 ",3000, "Kolkata","HDFC000786");
			backend.addAccount("User3",2700, "Delhi","HDFC000786");
			backend.addAccount("User2",9800, "Delhi","CBIN99999");
			backend.addAccount("User4",10500, "Noida SEZ","CBIN99999");
			backend.addAccount("User5",1900, "Kolkata","SBIN000011");
			
			
			
		}
		
		
		
		public static void main(String[] args) {
			
			MainClass app = new MainClass();
			
			while(true)
			{
				System.out.println("=== MAIN ======");
				System.out.println("1. Add Account");
				System.out.println("2. Show All Accounts");
				System.out.println("3. Search Account Based on Account number ");
				System.out.println("4. Sort Account Based on Account number ");
				System.out.println("5.Search Accounts based on IFSC Code ");
				System.out.println("6.Sort Account based on IFSC Code ");
				System.out.println("0. EXIT");
				
				int choice = new Scanner(System.in).nextInt();
				switch (choice) {
				case 1:
					app.addAccount();
					break;
				case 2: app.showAll();
				break;
				case 3:
					app.serachAccount();
					break;
				case 4:
					app.showSortedAccountByAccountNumber();
					break;
				case 5:
					app.showSearchAccountByIfsc();
					break;
				case 6:
					app.showSortedAccountByIfsc();
					break;
					

				default:
					break;
				}
				
			}//end while
		}//end main
		
		public void addAccount()
		{
			System.out.println("Enter Account Holder Name ");
			String name = sc.nextLine();
			System.out.println("Enter Location ");
			String location = sc.nextLine();
			System.out.println("Enter Openning Balance ");
			int balance = sc2.nextInt();
			System.out.println("Enter IFSC Code: ");
			String ifsc=sc.nextLine();
			
			Account savedAccount = backend.addAccount(name, balance, location,ifsc);
			System.out.println(savedAccount);
			
		}
		
		public void showAll()
		{
			List<Account> accountsFromBackEnd = backend.getAllRecords();
			for (Account account : accountsFromBackEnd) {
				System.out.println(account);
			}
		}
		
		public void serachAccount() {
			System.out.println("Enter the Account Number:");
			int accountNumber=sc.nextInt();
			Account account1=backend.searchAccount(accountNumber);
			System.out.println(account1);
		}
		
		
		public void showSortedAccountByAccountNumber()
		{
			List<Account> accountsFromBackEnd = backend.SortByAccountNumber();
			for (Account account : accountsFromBackEnd) {
				System.out.println(account);
			}
		}
		
		public void showSearchAccountByIfsc()
		{
			System.out.println("Enter the IFSC Number: ");
			String ifsc=sc.nextLine();
			List<Account> output=backend.searchAccountByIfsc(ifsc);
			System.out.println(output);
		}
		
		public void showSortedAccountByIfsc()
		{
			List<Account> accountsFromBackEnd = backend.SortByIfsc();
			for (Account account : accountsFromBackEnd) {
				System.out.println(account);
		}
	}
}//end class


