package EmployeeWageTasks;

import java.util.Scanner;

public class UC2EmployeeWages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter work Time (if < 8) Default enter 0 / 8 ");
        int workTime = sc.nextInt();

        int wagePreHr = 20;
        int fullTime = 8;
        int employeeWage = (wagePreHr * fullTime);

        if(workTime > 0 && workTime < 8){
            int partTime = (workTime * wagePreHr);
            System.out.println("Part Time Wage is : " + partTime);
        } else if(workTime > 8){
            System.out.println("Enter valid Work Time");
        }else {
                System.out.println("Full Time Employee Wage is : " + employeeWage);
            }
        }
    }

