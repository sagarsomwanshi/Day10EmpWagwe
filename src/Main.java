import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        WageCalculation wage = new WageCalculation();
        wage.companyDetails();
        System.out.println(wage.company1);
        System.out.println("To calculate wage for another company press 1\n press 2 to close the employee wage calculation program");
        Scanner sc = new Scanner(System.in);
        int check = sc.nextInt();
        if(check ==1) {
            wage.companyDetails();
            System.out.println(wage.company1.get(1));
        }else{
            System.out.println("Company wage calculation closed");
        }



    }
}