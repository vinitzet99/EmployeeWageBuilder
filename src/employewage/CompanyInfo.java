package employewage;


public class CompanyInfo {
    private String companyName;
    private int empRatePerHour;
    private int noOfWorkingDays;
    private int maxHoursPerMonth;
    private int totalEmpWage;

    public CompanyInfo(String companyName, int empRatePerHour, int noOfWorkingDays, int maxHoursPerMonth) {
        this.companyName = companyName;
        this.empRatePerHour = empRatePerHour;
        this.noOfWorkingDays = noOfWorkingDays;
        this.maxHoursPerMonth = maxHoursPerMonth;
    }

    public void setTotalEmpWage(int totalEmpWage) {
        this.totalEmpWage = totalEmpWage;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getEmpRatePerHour() {
        return empRatePerHour;
    }

    public void setEmpRatePerHour(int empRatePerHour) {
        this.empRatePerHour = empRatePerHour;
    }

    public int getNoOfWorkingDays() {
        return noOfWorkingDays;
    }

    public void setNoOfWorkingDays(int noOfWorkingDays) {
        this.noOfWorkingDays = noOfWorkingDays;
    }

    public int getMaxHoursPerMonth() {
        return maxHoursPerMonth;
    }

    public void setMaxHoursPerMonth(int maxHoursPerMonth) {
        this.maxHoursPerMonth = maxHoursPerMonth;
    }

    @Override
    public String toString() {
        return "CompanyInfo: " +
                "companyName = " + companyName + '\'' +
                ", empRatePerHour = " + empRatePerHour +
                ", numOfWorkingDays = " + noOfWorkingDays +
                ", maxHrsPerMonth = " + maxHoursPerMonth +
                ", totalWage = " + totalEmpWage;

    }
}
