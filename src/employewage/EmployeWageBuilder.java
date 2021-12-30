package employewage;
import java.util.Random;

class Employee{
    //variables
    private int empHours,empWage,totalEmployeeWage,totalEmpHours,totalWorkingDays;
    private static final int IS_FULL_TIME=1;
    private static final int EMP_RATE_PER_HOUR=20;
    private static final int IS_PART_TIME=2;
    private static final int NO_OF_WORKING_DAYS=20;
    private static final int TOTAL_WORKING_HOURS=100;
    //constructor
    Employee(int empHours,int empWage,int totalEmployeeWage,int totalEmpHours,int totalWorkingDays){
        this.empHours=empHours;
        this.empWage=empWage;
        this.totalEmployeeWage=totalEmployeeWage;
        this.totalEmpHours=totalEmpHours;
        this.totalWorkingDays=totalWorkingDays;
    }
    //method to find Employee Wage
    public void employeeWageCalculator(Employee employee){
        while(employee.totalEmpHours<TOTAL_WORKING_HOURS && employee.totalWorkingDays<NO_OF_WORKING_DAYS){
            employee.totalWorkingDays++;
            Random random=new Random();
            int empCheck= random.nextInt( 3);
            switch(empCheck){
                case IS_FULL_TIME:
                    employee.empHours=8;
                    break;
                case IS_PART_TIME:
                    employee.empHours=4;
                    break;
                default:
                    employee.empHours=0;
                    break;
            }
            if(totalEmpHours+empHours>100 && empHours>(100-totalEmpHours)){
                empHours=100-totalEmpHours;
            }
            employee.totalEmpHours=employee.totalEmpHours+ employee.empHours;
            employee.empWage=employee.empHours*EMP_RATE_PER_HOUR;
            employee.totalEmployeeWage= employee.totalEmployeeWage+employee.empWage;
        }
        System.out.println("The total employee wage of an employee for "+employee.totalEmpHours+" hours or "+employee.totalWorkingDays+" days is: "+ employee.totalEmployeeWage);
    }
}
public class EmployeWageBuilder {

    public static void main(String args[]) {
        System.out.println("Welcome to Employee Wage Builder");
        //variable declaration
        int empHours=0;
        int empWage=0;
        int totalEmployeeWage=0;
        int totalEmpHours=0;
        int totalWorkingDays=0;
        //object creation
        Employee employee=new Employee(empHours,empWage,totalEmployeeWage,totalEmpHours,totalWorkingDays);
        //calculating Wages
        employee.employeeWageCalculator(employee);
    }
}

