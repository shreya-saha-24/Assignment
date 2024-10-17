package p1;
import java.util.*;

public class MainClass {
    public static void main(String[] args) {
            int mnuch=0;
            int opch=0;
            Scanner sc=new Scanner(System.in);
            EmployeeOperation aa=new EmployeeOperation();
            while(true) {
                System.out.println("1.Add Employees");
                System.out.println("2. Show Employees");
                System.out.println("Press 1 or 2 to select your choice");
                mnuch=sc.nextInt();
                switch (mnuch)
                {
                    case 1:
                    {
                        Laptop l1=new Laptop(15,true);
                        Employee e1=new Employee(101,"sgb",5000,l1);

                        aa.addEmployee(e1);
                        System.out.println("Employee Added");
                        break;
                     }
                    case 2:
                    {
                        aa.showEmployees();
                        break;
                    }
                    default:
                    {
                        System.out.println("Invalid Choice");
                    }
                }
            System.out.println("Do you want to continue press 1 other than press 2");
            opch= sc.nextInt();
            if(opch>1)
            {
                break;
            }


        }
    }
}
