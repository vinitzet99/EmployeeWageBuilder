package employewage;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class EmployeWageBuilder implements IEmployeeWage{
    // Declaring a constant
    public static final int IS_FULLTIME = 1;
    public static final int IS_PARTTIME = 2;
    private int numOfCompany = 0;
    private ArrayList<CompanyInfo> companyInfoArray;
    private static final Scanner sc = new Scanner(System.in);

    public EmployeWageBuilder() {
        companyInfoArray = new ArrayList<CompanyInfo>(6);
    }

    public void addCompanyInfo(String companyName, int empRatePerHour, int noOfWorkingDays, int maxHoursPerMonth) {
        CompanyInfo newComp = new CompanyInfo(companyName, empRatePerHour, noOfWorkingDays, maxHoursPerMonth);
        companyInfoArray.add(newComp);
        numOfCompany++;
    }

    public void computeEmpWage() {
        for (int i = 0; i < numOfCompany; i++) {
            companyInfoArray.get(i).setTotalEmpWage(this.computeWage(companyInfoArray.get(i))); // inside bracket return totalEmpWage
            System.out.println(companyInfoArray.get(i));
        }
    }
    /*
    We have used static method here so that we can directly call it inside main
    */
    public static int computeWage(CompanyInfo companyInfo) {
// Declaring the variables
        int empHrs = 0;
        int empWage = 0;
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;
        int totalWage = 0;
        String dailyWage="( ";
        /*
         * Using random method to generate random numbers 0, 1 and 2
         */
        while (totalEmpHrs <= companyInfo.getMaxHoursPerMonth() && totalWorkingDays < companyInfo.getNoOfWorkingDays()) {
            totalWorkingDays++;
            Random random = new Random();
            int empCheck = random.nextInt(3);
            switch (empCheck) {
                case IS_FULLTIME: // FullTime Employee
                    empHrs = 8;
                    break;
                case IS_PARTTIME: // PartTime Employee
                    empHrs = 4;
                    break;
                default: // Employee is absent
                    empHrs = 0;
            }
            empWage = companyInfo.getEmpRatePerHour() * empHrs;
            dailyWage= dailyWage+empWage+" ";
            companyInfo.setDailyWage(dailyWage);
            totalEmpHrs += empHrs;
        }
        totalWage = totalEmpHrs * companyInfo.getEmpRatePerHour();
        return totalWage;
    }
    public void queryCompanyWage()
    {
        int valueToBeFound=0;
        while(true) {
            System.out.println("Select from below option to get total wages by company name :\n0. to Quit ");
            for (int i = 0; i < numOfCompany; i++) {
                System.out.println((i + 1) + ". " + companyInfoArray.get(i).getCompanyName());
            }

            valueToBeFound = sc.nextInt();
            if (valueToBeFound != 0 && valueToBeFound < 6) {
                System.out.println(
                        "Total Employee Wage for " + companyInfoArray.get(valueToBeFound - 1).getCompanyName() +
                                " is " + companyInfoArray.get(valueToBeFound - 1).getTotalEmpWage());
            } else {
                System.out.println("Quit!!");
                break;
            }
        }
    }

    public static void main(String[] args) {
        int value=1;
        System.out.println("Welcome To Employee Wage Computation Program");
        IEmployeeWage employeeWageBuilder = new EmployeWageBuilder();
        ((EmployeWageBuilder) employeeWageBuilder).addCompanyInfo("Infosys", 150, 2, 10);
        ((EmployeWageBuilder) employeeWageBuilder).addCompanyInfo("TCS" , 200, 3, 10);
        ((EmployeWageBuilder) employeeWageBuilder).addCompanyInfo("Accenture", 100, 4, 12);
        ((EmployeWageBuilder) employeeWageBuilder).addCompanyInfo("Jio", 180, 3, 15);
        ((EmployeWageBuilder) employeeWageBuilder).addCompanyInfo("Airtel", 160, 4, 14);
        ((EmployeWageBuilder) employeeWageBuilder).computeEmpWage();
        ((EmployeWageBuilder) employeeWageBuilder).queryCompanyWage();
    }

}