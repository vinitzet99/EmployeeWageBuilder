package employewage;
import java.util.Random;

public class EmployeWageBuilder {
    public static void main(String args[]) {
        System.out.println("Welcome to Employee Wage Builder");
        int IS_PRESENT=1;
        Random random=new Random();
        int empCheck= random.nextInt( 2);
        if(empCheck==IS_PRESENT) {
            System.out.println("Employee is Present");
        }
        else{
            System.out.println("Employee is Absent");
            }

    }
}
