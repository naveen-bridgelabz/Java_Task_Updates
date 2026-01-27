package EmployeeWageTasks;

import java.util.Scanner;

public class UC5MonthlyWages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter valid Working Date : ");
        int actualPresentDays = sc.nextInt();

        int wagePreHr = 20;
        int fullTime = 8;
        int employeeWage = (wagePreHr * fullTime);

        int totalDays = 30;
        int totalWorkingDays = 20;

        if (actualPresentDays > 0 && actualPresentDays < 20){
            System.out.println("Monthly Wages : " + (employeeWage * actualPresentDays));
        } else if (actualPresentDays > 20) {
            System.out.println("Enter Valid Working Day < 20");
        } else{
            System.out.println("Monthly Wages : " + (employeeWage * totalWorkingDays));
        }
    }
}
