import java.util.ArrayList;
import java.util.Scanner;

public class WageCalculation {
    ArrayList<Company> company1 = new ArrayList<>();

    static int workHour,workDay;

    public void companyDetails(){
        WageCalculation c = new WageCalculation();
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
        company1.add(comp);

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


}
