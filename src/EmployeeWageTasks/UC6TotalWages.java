package EmployeeWageTasks;

public class UC6TotalWages {
    public static void main(String[] args) {

        int wagePreHr = 20;
        int fullTime = 8;
        int partTime = 4;
        int maxWorkingDays = 20;
        int maxWorkingHrs = 100;

        int totalWorkingDays = 0;
        int totalWorkingHours = 0;

        while (totalWorkingDays < maxWorkingDays
                && totalWorkingHours < maxWorkingHrs) {

            totalWorkingDays++;

            int empType = (int) (Math.random() * 3);
            int dailyHours = 0;

            if (empType == 2) {
                dailyHours = fullTime;
            } else if (empType == 1) {
                dailyHours = partTime;
            } else {
                dailyHours = 0;
            }

            if (totalWorkingHours + dailyHours > maxWorkingHrs) {
                dailyHours = maxWorkingHrs - totalWorkingHours;
            }

            totalWorkingHours += dailyHours;

            System.out.println(
                    "Day " + totalWorkingDays +
                            " | Worked Hours: " + dailyHours +
                            " | Total Hours: " + totalWorkingHours
            );
        }

        int totalWage = totalWorkingHours * wagePreHr;

        System.out.println("Total Working Days  : " + totalWorkingDays);
        System.out.println("Total Working Hours : " + totalWorkingHours);
        System.out.println("Total Wage          : " + totalWage);
    }
}
