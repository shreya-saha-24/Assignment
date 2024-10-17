package p1;

abstract public class Employee {
	private int id;
	private String name;
	private int bankAccount;
	
	public Employee()
	{
	}
	
	public Employee(int id, String name, int bankAccount)
	{
		this.id=id;
		this.name=name;
		this.bankAccount=bankAccount;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(int bankAccount) {
		this.bankAccount = bankAccount;
	}

	public abstract void creditSalary();


	public void fillTimeSheet()
	{
		System.out.println("Fill your Timesheet");
	}
	
}
