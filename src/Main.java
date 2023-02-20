import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        WageCalculation wage = new WageCalculation();
        wage.companyDetails();
        System.out.println(wage.company1);
        wage.addCompany();
    }
}