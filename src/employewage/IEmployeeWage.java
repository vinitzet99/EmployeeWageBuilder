package employewage;

public interface IEmployeeWage {
    public void addCompanyInfo(String companyName, int empRatePerHour, int noOfWorkingDays, int maxHoursPerMonth);

    public void computeEmpWage();
}
