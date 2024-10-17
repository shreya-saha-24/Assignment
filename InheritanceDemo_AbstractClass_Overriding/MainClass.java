package p1;

public class MainClass {
	public static void main(String args[])
	{
		MainClass mc=new MainClass();
		
		RegularEmployee re=new RegularEmployee(101,"Shreya",12345678,50000);
		mc.printEmployeeDetails(re);
		
		//re.creditSalary();
		
		System.out.println("-------------");
		ContractualEmployees emp1 = new ContractualEmployees("Mike",101,2345678,1000);
		
		mc.printEmployeeDetails(emp1);
		//emp1.creditSalary();
	
		System.out.println("-------------");
		
		ThirdPartEmployee tpe = new ThirdPartEmployee();
		mc.printEmployeeDetails(tpe);
		
		
		System.out.println("-------------");
		
		
		
	}
	
	public void printEmployeeDetails(Employee e)
	{
		System.out.println("Employee Name "+e.getName());
		System.out.println("Employee Id "+e.getId());
		System.out.println("Employee Bank Account Number "+e.getBankAccount());
	    e.creditSalary();
		
		
		if(e instanceof RegularEmployee)
		{
			RegularEmployee d = (RegularEmployee)e;
			d.fillTimeSheet();
			
		}
		
	}

}
