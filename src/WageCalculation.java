import java.util.ArrayList;
import java.util.Scanner;

public class WageCalculation implements Interface {
    ArrayList<Company> EmpWageBuilder = new ArrayList<>();

    static int workHour,workDay;

    public void companyDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Company Name");
        String companyName = sc.nextLine();
        System.out.println("Enter Wage/Hour");
        int hourWage = sc.nextInt();
        System.out.println("Enter maximum working hours per month");
        int maxHours = sc.nextInt();
        System.out.println("Enter maximum working days per month");
        int maxWorkDays = sc.nextInt();
        while(workDay < maxWorkDays && workHour < maxHours){
            dailyWork();
        }
        int totalWage = workHour*hourWage;
        Company comp = new Company(companyName,totalWage,workDay);
        EmpWageBuilder.add(comp);

    }
    public int attendance(){
        int attendance = (int) ((Math.random() * 10) % 3);
        return attendance;
    }
    public static void dailyWork(){
        WageCalculation c = new WageCalculation();

        switch (c.attendance()) {
            case 0 :
                workHour += 8;
                workDay++;
                break;
            case 1:
                workHour += 4;
                workDay++;
                break;
        }
    }
    public void addCompany() {
        System.out.println("To calculate wage for another company press 1\n press 2 to close the employee wage calculation program");
        Scanner sc = new Scanner(System.in);
        int check = sc.nextInt();
        if (check == 1) {
            companyDetails();
            System.out.println(EmpWageBuilder);
            addCompany();
        } else {
            System.out.println("Company wage calculation closed");
        }
    }
}
