package EmployeeWageTasks;

import java.util.Scanner;

public class UC1EmployeePresent {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        int empPresent = (int) (Math.random() * 2);
//        System.out.println(empPresent);

        if(empPresent == 1){
            System.out.println("Employee is Present " + empPresent);
        }else {
            System.out.println("Employee Absent " + empPresent);
        }

    }
}
