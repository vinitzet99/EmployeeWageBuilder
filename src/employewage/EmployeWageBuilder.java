package employewage;
import java.util.Random;

public class EmployeWageBuilder {
    public static final int IS_FULL_TIME=1;
    public static final int EMP_RATE_PER_HOUR=20;
    public static final int IS_PART_TIME=2;
    public static final int NO_OF_WORKING_DAYS=20;
    public static final int TOTAL_WORKING_HOURS=100;
    public static void main(String args[]) {
        System.out.println("Welcome to Employee Wage Builder");
        int empHours=0;
        int empWage=0;
        int totalEmployeeEage=0;
        int totalEmpHours=0;
        int totalWorkingDays=0;
        while(totalEmpHours<TOTAL_WORKING_HOURS && totalWorkingDays<NO_OF_WORKING_DAYS){
            totalWorkingDays++;
            Random random=new Random();
            int empCheck= random.nextInt( 3);
            switch(empCheck){
                case IS_FULL_TIME:
                    empHours=8;
                    break;
                case IS_PART_TIME:
                    empHours=4;
                    break;
                default:
                    empHours=0;
                    break;
            }
            if(totalEmpHours+empHours>100 && empHours>(100-totalEmpHours)){
                empHours=100-totalEmpHours;
            }
            totalEmpHours=totalEmpHours+empHours;
            empWage=empHours*EMP_RATE_PER_HOUR;
            totalEmployeeEage=totalEmployeeEage+empWage;
        }
        System.out.println("The total employee wage of an employee for "+totalEmpHours+" hours for "+totalWorkingDays+" days is: "+ totalEmployeeEage);
    }
}
