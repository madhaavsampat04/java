import java.util.*;

public class Employee {
    String eName;
    double basicSalary;
    static int c;

    public Employee() {
        eName = "";
        basicSalary = 0.0;
        countEmployees();
    }

    public Employee(String name, int bs) {
        eName = name;
        basicSalary = bs;
        countEmployees();
    }

    public void printEmployeeDetails() {
        System.out.println("Name of employee is: " + eName);
        System.out.println("Salary of the employee is: " + basicSalary);
    }

    public int getNetIncome() {
        return (int) (((.60) * basicSalary) + basicSalary);
    }

    public static int countEmployees() {
        return c++;
    }

    class SalesManager extends Employee{
            double SalesAmount;
            public SalesManager(String name,double bs,double sales){
                super(name,bs);
                SalesAmount=sales;
            }
            public void printSalesManagerDetails(){
                super.printEmployeeDetails();
                System.out.println("Sales Amount is:"+SalesAmount);

            }
            public int getNetIncome(){
                    return (int)(basicSalary*1.6 + SalesAmount*.01);
            }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       /* Employee e1 = new Employee("Madhav", 100000);
        Employee e2 = new Employee("Dhruvil", 100000);
        Employee e3 = new Employee("Dhruv", 100000);
        e1.printEmployeeDetails();
        e2.printEmployeeDetails();
        e3.printEmployeeDetails();
        System.out.println(c);*/
        

       

    }

}
