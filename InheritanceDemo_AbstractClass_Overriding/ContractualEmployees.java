package p1;

public class ContractualEmployees extends Employee{
	private int perDayRates;
	
	public ContractualEmployees(String name,int id,int bankAccount,int perDayRates)
	{
		super(id,name,bankAccount);
		this.perDayRates=perDayRates;	
	}
	
	public int getPerDayRates() {
		return perDayRates;
	}
	
	public void setPerDayRates(int perDayRates) {
		this.perDayRates = perDayRates;
	}

	@Override
	public void creditSalary() {
		// TODO Auto-generated method stub
		double monthlySalary=perDayRates*22;
		double tds= 0.10* monthlySalary;
		double cSalary=monthlySalary-tds;
		System.out.println("Salary is: "+cSalary);
	}
	
	
	

}
