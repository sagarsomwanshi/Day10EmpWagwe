public class Company {
    String companyName;
    int totalWage, totalWorkingDays;

    public Company(String companyName, int totalWage, int totalWorkingDays) {
        this.companyName = companyName;
        this.totalWage = totalWage;
        this.totalWorkingDays = totalWorkingDays;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getTotalWage() {
        return totalWage;
    }

    public void setTotalWage(int totalWage) {
        this.totalWage = totalWage;
    }

    public int getTotalWorkingDays() {
        return totalWorkingDays;
    }

    public void setTotalWorkingDays(int totalWorkingDays) {
        this.totalWorkingDays = totalWorkingDays;
    }

    @Override
    public String toString() {
        return "Company{" +
                "companyName='" + companyName + '\'' +
                ", totalWage=" + totalWage +
                ", totalWorkingDays=" + totalWorkingDays +
                '}';
    }
}
