package p1;

public class RegularEmployee extends Employee {
	private int basicSalary;
	
	public RegularEmployee(int id, String name, int bankAccount,int basicSalary)
	{
		super(id,name,bankAccount);
		this.basicSalary=basicSalary;
	}
	

	public int getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(int basicSalary) {
		this.basicSalary = basicSalary;
	}


	@Override
	public void creditSalary() {
		// TODO Auto-generated method stub
		  double hra= 0.10 * basicSalary;
          double actualSalary =basicSalary+hra;
		  double receiveSalary= actualSalary - actualSalary*(5/100);
		  System.out.println("Salary is " +receiveSalary);
	}
}
