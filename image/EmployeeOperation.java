package p1;

    public class EmployeeOperation {
        private Employee elist[];
        static int empIndex=0;

        public EmployeeOperation() {

            elist=new Employee[5];
        }
        /*
            public void addLaptop(Laptop l1)
            {
                if(ll.length==0||ll.length<5)
                {
                    ll[indexlaptop]=l1;
                    indexlaptop++;
                }
            }*/
        public void addEmployee(Employee ee)
        {

            if(empIndex<elist.length) {
                elist[empIndex] = ee;
                empIndex++;
            }
            else
            {
                System.out.println("No Employees Can be added");
            }
        }
        public void showEmployees()
        {
            System.out.println(elist.length);
            for(Employee ee : elist)
            {
                System.out.println("EmpId:"+ee.getEmpID()+"EmployeeName:"+ee.getEmpName()+"Salary:"+ee.getSalary()+"Laptop Detais"+ee.getL());
            }
        }

    }
