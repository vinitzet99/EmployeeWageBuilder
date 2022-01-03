package employewage;
import java.util.Random;

public class EmployeWageBuilder {
    public static final int IS_FULL_TIME=1;
    public static final int IS_PART_TIME=2;


    public static int computeEmpWage(String company,int empRatePerHour, int noOfWorkingDays,int maxHoursPerMonth){
        int empHours=0;
        int empWage=0;
        int totalEmployeeEage=0;
        int totalEmpHours=0;
        int totalWorkingDays=0;
        while(totalEmpHours<maxHoursPerMonth && totalWorkingDays<noOfWorkingDays) {
            totalWorkingDays++;
            Random random = new Random();
            int empCheck = random.nextInt(3);
            switch (empCheck) {
                case IS_FULL_TIME:
                    empHours = 8;
                    break;
                case IS_PART_TIME:
                    empHours = 4;
                    break;
                default:
                    empHours = 0;
                    break;
            }
            empWage = empHours * empRatePerHour;
            totalEmpHours = totalEmpHours + empHours;
            System.out.println("Day "+ totalWorkingDays+" Employee Worked: "+empHours+" Employee Wage "+empWage);
        }
        totalEmployeeEage=totalEmpHours*empRatePerHour;
        System.out.println("The total employee wage is in "+ company+ " company is "+totalEmployeeEage+"\n");
        return totalEmployeeEage;
    }
    public static void main(String args[]) {
        System.out.println("Welcome to Employee Wage Builder");
        computeEmpWage("TCS",10,2,10);
    }
}