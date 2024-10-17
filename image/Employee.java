package p1;

public class Employee {
    private int empID;
    private String empName;
    private int salary;
    private Laptop l;

    public Employee(){
    }

    public Employee(int empID, String empName,int salary, Laptop l)
    {
        this.empID=empID;
        this.empName=empName;
        this.salary=salary;
        this.l=l;
    }

    public int getEmpID()
    {
        return empID;
    }
    public void setEmpID(int empID)
    {
        this.empID=empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Laptop getL() {
        return l;
    }

    public void setL(Laptop l) {
        this.l = l;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empID=" + empID +
                ", empName='" + empName + '\'' +
                ", salary=" + salary +
                ", l=" + l +
                '}';
    }
}
