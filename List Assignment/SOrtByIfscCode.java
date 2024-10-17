package p1;
import java.util.Comparator;

public class SortByIfscCode implements Comparator<Account> {
			@Override
			public int compare(Account a1, Account a2) {
			
				return a1.getIfsc().compareTo( a2.getIfsc());
			}

			
		

	}



