import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        WageCalculation wage = new WageCalculation();
        wage.companyDetails();
        System.out.println(wage.EmpWageBuilder);
        System.out.println("Daily Wage of "+ wage.EmpWageBuilder.get(0).getCompanyName()+" company : "+Arrays.toString(wage.wageStore));
        wage.addCompany();
    }
}