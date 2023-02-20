import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class WageCalculation implements Interface {
    ArrayList<Company> EmpWageBuilder = new ArrayList<>();
    int[] wageStore = new int[30];

    static int workHour, workDay;

    public void companyDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Company Name");
        String companyName = sc.nextLine();
        System.out.println("Enter Wage/Hour");
        int hourWage = sc.nextInt();
        System.out.println("Enter maximum working hours per month");
        int maxHours = sc.nextInt();
        System.out.println("Enter maximum working days per month");
        int maxWorkDays = sc.nextInt();
        int j = 1;
        workHour = 0;
        workDay = 0;
        while (workDay < maxWorkDays && workHour < maxHours) {
            int i = workHour;
            dailyWork();
            int wage = (workHour - i) * 20;
            System.out.println("Day " + j + " : " + wage);
            wageStore[j] = wage;
            j = j + 1;
        }
        int totalWage = workHour * hourWage;
        Company comp = new Company(companyName, totalWage, workDay);
        EmpWageBuilder.add(comp);

    }

    public int attendance() {
        int attendance = (int) ((Math.random() * 10) % 3);
        return attendance;
    }

    public static void dailyWork() {
        WageCalculation c = new WageCalculation();

        switch (c.attendance()) {
            case 0:
                workHour += 8;
                workDay++;

                break;
            case 1:
                workHour += 4;
                workDay++;
                break;
        }
    }

    int check1 = 1;

    public void addCompany() {
        System.out.println("To calculate wage for another company Enter 1\nTo get total wage of any company Enter 2\nTo close the program Enter 3");
        Scanner sc = new Scanner(System.in);
        int check = sc.nextInt();
        if (check == 1) {
            companyDetails();
            System.out.println(EmpWageBuilder);
            System.out.println("Daily Wage of " + EmpWageBuilder.get(check1).getCompanyName() + " company : " + Arrays.toString(wageStore));
            check1 = check1 + 1;
            addCompany();
        } else if (check == 2) {
            getWage();

        } else {
            System.out.println("Company wage calculation closed");
        }

    }

    public void getWage() {
        System.out.println("Enter Name of company to Get total Wage");
        int check3 = 0;
        Scanner sc = new Scanner(System.in);
        String check2 = sc.nextLine();
        for (int i = 0; i < EmpWageBuilder.size(); i++) {
            String Check1 = EmpWageBuilder.get(i).getCompanyName();
            if (Check1.equalsIgnoreCase(check2)) {
                System.out.println("Total Wage of " + EmpWageBuilder.get(i).getCompanyName() + " company : " + EmpWageBuilder.get(i).getTotalWage());
                check3 =1;
            }
        }
        if(check3 != 1){
            System.out.println("Name not found");
        }
        addCompany();
    }
}


