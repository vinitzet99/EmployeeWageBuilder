package employewage;
import java.util.Random;

public class EmployeWageBuilder {
    public static void main(String args[]) {
        System.out.println("Welcome to Employee Wage Builder");
        int IS_PRESENT=1;
        int FULL_RATE_PER_HOUR=20;
        int IS_PART_TIME=2;
        int empHours=0;
        int empWage=0;
        Random random=new Random();
        int empCheck= random.nextInt( 3);
        if(empCheck==IS_PRESENT) {
            empHours=8;
            System.out.println("Employee is Present");
        }
        else if (empCheck==IS_PART_TIME){
            empHours=4;
            System.out.println("Part Time Employee");
        }
        else{
            System.out.println("Employee is Absent");
            }
        empWage=empHours*FULL_RATE_PER_HOUR;
        System.out.println("The daily wage of an employee is "+ empWage);
    }
}
