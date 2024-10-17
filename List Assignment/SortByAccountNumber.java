package p1;
import java.util.Comparator;

public class SortByAccountNumber implements Comparator<Account>{

		@Override
		public int compare(Account a1, Account a2) {
		
			return a1.getAccountNumber() - a2.getAccountNumber();
		}

		
	

}
